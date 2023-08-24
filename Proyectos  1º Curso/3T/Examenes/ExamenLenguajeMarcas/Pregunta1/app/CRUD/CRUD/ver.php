<?php
$enlace = mysqli_connect("localhost", "cursoaplicacionesweb1", "cursoaplicacionesweb1", "examen");
$resultado = mysqli_query ($enlace,"
SELECT * FROM usuarios 
WHERE Identificador = ".$_GET['id']."
");
while ($fila = $resultado->fetch_assoc()) {
    echo $fila['nombre']." ".$fila['apellidos']."<br>";
    $pasas=true;
      $_SESSION['nombre'] =  $fila['nombre'];
          $_SESSION['apellidos'] =  $fila['apellidos'];
    echo'
    
   Usuario: '.$fila['usuario'].' <br>
    Contraseña: '.$fila['password'].' <br>
    Nombre: '.$fila['nombre'].' <br>
    Apellidos: '.$fila['apellidos'].' <br>
    ';
}

?>
<a href="paneldecontrol.php"> Volver a la pagina anterior</a>