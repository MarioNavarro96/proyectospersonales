<?php

//ESTE ARCHIVO ACTUALIZA UN SOLO DATO
$enlace = mysqli_connect("localhost", "cursoaplicacionesweb1", "cursoaplicacionesweb1", "examen");

        $resultado = mysqli_query ($enlace,"
        UPDATE ".$_GET['tabla']."
        SET ".$_GET['columna']." = '".$_GET['valor']."'
        WHERE
        Identificador = ".$_GET['identificador']."
        ");


?>