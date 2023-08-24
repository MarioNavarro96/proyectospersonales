<?php
session_start();
//ABRO LA CONEXION CON LA BASE DE DATOS
$enlace = mysqli_connect("localhost", "cursoaplicacionesweb1", "cursoaplicacionesweb1", "examen");
//LE PIDO ALGO A LA BASE DE DATOS
$resultado = mysqli_query ($enlace,"
SELECT * FROM usuarios
WHERE usuario = '".$_POST['usuario']."'
AND
password = '".$_POST['contrasena']."'
LIMIT 1
             ");
$pasas=false;
$_SESSION['pasas'] = false;
if ($fila = $resultado->fetch_assoc()) {
    echo $fila['nombre']." ".$fila['apellidos']."<br>";
    $pasas=true;
      $_SESSION['nombre'] =  $fila['nombre'];
          $_SESSION['apellidos'] =  $fila['apellidos'];
}
else{
    echo"No hay ningun usuario que cumpla esas caracteristicas";
    $pasas=false;
}

if($pasas){
    echo"Te voy a dar acceso a la aplicacion";
    $_SESSION['pasas'] = true;
  
    echo ' <meta http-equiv="refresh"
   content="5; url=escritorio.php">';
}
else{
    $_SESSION['pasas'] = false;
    echo"No te doy acceso";
    echo ' <meta http-equiv="refresh"
   content="5; url=index.html">';
}

mysqli_close($enlace);

?>