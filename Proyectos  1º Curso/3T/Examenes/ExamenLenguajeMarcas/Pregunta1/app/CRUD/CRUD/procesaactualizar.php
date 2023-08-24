<?php
$enlace = mysqli_connect("localhost", "cursoaplicacionesweb1", "cursoaplicacionesweb1", "examen");
$contador = 0;
foreach($_POST as $clave => $valor) {
    if($contador >=2) {
        echo "Voy a actualizar el valor del campo ".$clave." con el valor".$valor."<br>";
        $resultado = mysqli_query ($enlace,"
        UPDATE ".$_POST['tabla']."
        SET ".$clave." = '".$valor."'
        WHERE
        Identificador = ".$_POST['id']."
        ");
    }
    $contador++;
}


 echo ' <meta http-equiv="refresh"
   content="2; url=escritorio.php?tabla='.$_POST['tabla'].'">';
mysqli_close($enlace);

?>