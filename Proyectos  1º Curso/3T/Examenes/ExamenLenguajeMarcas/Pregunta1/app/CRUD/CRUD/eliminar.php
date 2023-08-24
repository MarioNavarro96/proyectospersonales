<?php
$enlace = mysqli_connect("localhost", "cursoaplicacionesweb1", "cursoaplicacionesweb1", "examen");
$resultado = mysqli_query ($enlace,"
DELETE FROM ".$_GET['tabla']."
WHERE Identificador = ".$_GET['id']."");

 echo ' <meta http-equiv="refresh"
   content="5; url=escritorio.php">';
mysqli_close($enlace);

?>