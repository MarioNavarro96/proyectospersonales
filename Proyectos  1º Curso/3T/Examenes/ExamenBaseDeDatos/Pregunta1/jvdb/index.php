<?php
include "jvdb.php"; //Se incluye el archivo "jvdb.php", que contiene la clase JVDB.
$conexion = new JVDB("crm"); //Se crea una instancia de la clase JVDB llamada $conexion y se establece la base de datos "crm".

//Se realizan varias peticiones utilizando el método peticion de la clase JVDB:

$conexion->peticion("CREATE TABLE clientes (id,nombre,apellidos,email,telefono)");                       //Se crea una tabla llamada "clientes" con columnas "id", "nombre", "apellidos", "email" y "telefono"
$conexion->peticion('INSERT INTO clientes VALUES ("1","jose vicente","carratala","info@josevicentecarratala.com","666444777")');    //Se inserta un registro en la tabla "clientes" con valores específicos.
     
$conexion->peticion("CREATE TABLE productos (id,nombreproducto,precio,dimensiones)");   //Se crea una tabla llamada "productos" con columnas "id", "nombreproducto", "precio" y "dimensiones".
$conexion->peticion('INSERT INTO productos VALUES ("1","raton","25","8x5x6")'); //Se inserta un registro en la tabla "productos" con valores específicos.

$datos = $conexion->peticion("SELECT * FROM clientes ORDER BY apellidos ASC"); //Se realiza una consulta a la tabla "clientes" para obtener todos los registros, ordenados por "apellidos" de forma ascendente.
echo '<table border="1">';
echo "<tr><td>nombre</td><td>apellidos</td><td>telefono</td><td>email</td></tr>";
for($i = 0;$i<count($datos);$i++){
    echo "<tr><td>".$datos[$i]['nombre']."</td><td>".$datos[$i]['apellidos']."</td><td>".$datos[$i]['telefono']."</td><td>".$datos[$i]['email']."</td></tr>";
}
echo "</table>";                                                                //Se muestra una tabla HTML con los resultados de la consulta, mostrando los campos "nombre", "apellidos", "telefono" y "email".
/*
$datos = $conexion->peticion("DELETE * FROM clientes WHERE apellidos = 'carratala'");

echo "Vamos a ver que queda despues de eliminar<br>";
*/
$datos = $conexion->peticion("SELECT * FROM clientes ORDER BY apellidos ASC");
echo '<table border="1">';
echo "<tr><td>nombre</td><td>apellidos</td><td>telefono</td><td>email</td></tr>";
for($i = 0;$i<count($datos);$i++){
    echo "<tr><td>".$datos[$i]['nombre']."</td><td>".$datos[$i]['apellidos']."</td><td>".$datos[$i]['telefono']."</td><td>".$datos[$i]['email']."</td></tr>";
}
echo "</table>"; //Se muestra nuevamente una tabla HTML con los resultados de la segunda consulta.











?>
