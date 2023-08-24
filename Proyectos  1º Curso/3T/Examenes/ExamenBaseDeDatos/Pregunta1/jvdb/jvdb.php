<?php

class JVDB{  //Defino la clase JVDB
    
    public function __construct($basededatos){
        $this->db = $basededatos;       
        echo "La base de datos que se ha seleccionado es: ".$this->db."<br>";
                                                                                    //Creamos el parametro basededatos y especificamos que es una base de datos y le ponemos un nombre
    }
    public function peticion($consulta){                                             //Definimos el metodo peticion y ponemos el parametro consulta
        echo "A continuacion vamos a procesar la siguiente consulta: ".$consulta."<br>";
        
        $primerapalabra = explode(" ",$consulta)[0];
        $segundapalabra = explode(" ",$consulta)[1];                                
        $tercerapalabra = explode(" ",$consulta)[2];
        echo "la primera palabra es: ".$primerapalabra."<br>";
        switch($primerapalabra){                                                          //Se inicia la estructura de control switch con la primera palabra de la consulta, en este caso la peticion CREATE
            case "CREATE":
                echo "Voy a crear algo<br>";
                if($segundapalabra == "TABLE"){
                    $myfile = fopen("db/".$this->db."/".$tercerapalabra.".csv", "a") or die("Unable to open file!"); //Se crea un archivo CSV ubicado en la carpeta db 
                    $text = $consulta;
                    preg_match('#\((.*?)\)#', $text, $match);
                    print $match[1];
                    $txt = $match[1];
                    $campos = explode(",",$txt);
                    $cadenacampos = "";
                    for($i = 0;$i<count($campos);$i++){
                        $cadenacampos .= '"'.$campos[$i].'",';
                    }
                    $recortado = substr($cadenacampos, 0, -1);
                    fwrite($myfile, $recortado."\n");
                    fclose($myfile);
                  
                }                                                                   
                break;
                ///////////////////////////////////////////////////////////////////////////////////////////////
            case "INSERT":  
                $tabla = explode(" ",$consulta)[2];
                $myfile = fopen("db/".$this->db."/".$tabla.".csv", "a") or die("Unable to open file!");
                $text = $consulta;
                preg_match('#\((.*?)\)#', $text, $match);                                                   //En la peticion INSERT se obtiene el nombre de la tabla de la consulta
                    print $match[1];                                                                        //Se abre un archivo CSV correspondiente a esa tabla y luego se extrae el 
                    $txt = $match[1];                                                                       //contenido entre parentesis y se escribe en el archivo csv
                fwrite($myfile, $txt."\n");
                break;   
                //////////////////////////////////////////////////////////////////////////////////////////////////////
            case "SELECT":                                                                                  // En la peticion de "SELECT" Se obtiene el nombre de la tabla de la consulta
                                                                                                            //Se abre el archivo CSV correspondiente a esa tabla en modo lectura.
                                                                                                            //Se lee la primera línea del archivo para obtener los nombres de los campos.
                                                                                                            //Se crea un array vacío y un contador.
                                                                                                            //Se lee el contenido del archivo, se guarda cada línea en el array y se crea un elemento asociativo con los //nombres de los campos y los valores de la línea.
                                                                                                            //Se retorna el array resultante.
                            $piezas = explode(" ",$consulta);
                            foreach( $piezas as $key => $value )
                            {
                                if($piezas[$key] == 'FROM' )
                                {
                                    $tabla = $piezas[$key+1];
                                    break;
                                }
                            }
                echo "la tabla es: ".$tabla."<br>";
                $array = [];
                $contador = 0;
                $file = fopen("db/".$this->db."/".$tabla.".csv", 'r');
                $line = fgetcsv($file); 
                $nombrescampo = $line;
                
                $file = fopen("db/".$this->db."/".$tabla.".csv", 'r');
                while (($line = fgetcsv($file)) !== FALSE){
                    
                    $array[$contador] = $line;
                    
                    for($i = 0;$i<count($line);$i++){
                        $array[$contador][$nombrescampo[$i]] = $line[$i];
                    }
                    $contador++;
                }
                fclose($file);
                return $array;
                break;
                //////////////////////////////////////////////////////////////////////////////
                                                                            //En la peticion de "DELETE" se obtiene el nombre de la tabla y los criterios de eliminación de la consulta
                                                                            //y se muestra un mensaje indicando la tabla y los criterios de eliminación.
                                                                            //Se abre el archivo CSV correspondiente a esa tabla en modo lectura y
                                                                            //se lee la primera línea del archivo para obtener los nombres de los campos.
                                                                            //Se abre un segundo archivo CSV en modo escritura y
                                                                            //se lee el contenido del archivo original, se verifica si cada línea coincide con los criterios de eliminación y se escribe en el segundo //archivo solo si no hay coincidencia.
                                                                            //Se cierran los archivos y se elimina el archivo original y se renombra el segundo archivo con el nombre original.*/
            case "DELETE":
                    $piezas = explode(" ",$consulta);
                    foreach( $piezas as $key => $value )
                            {
                                if($piezas[$key] == 'FROM' )
                                {
                                    $tabla = $piezas[$key+1];
                                    
                                    break;
                                }
                                
                            }
                    foreach( $piezas as $key => $value )
                        {
                                if($piezas[$key] == 'WHERE' )
                                {
                                    $campo = $piezas[$key+1];
                                    $valor = str_replace("'","",$piezas[$key+3]);
                                    break;
                                }
                            }
        
                            echo "De la tabla ".$tabla." Voy a borrar el campo ".$campo." 
                            cuyo valor sea ".$valor."<br>";
                           $array = [];
                           $contador = 0;
                           $file = fopen("db/".$this->db."/".$tabla.".csv", 'r');
                           $line = fgetcsv($file); 
                           $nombrescampo = $line;
                           $file = fopen("db/".$this->db."/".$tabla.".csv", 'r');
                           $file2 = fopen("db/".$this->db."/".$tabla."2.csv", 'w');
                           while (($line = fgetcsv($file)) !== FALSE){
                               $borra = "no";
                               $array[$contador] = $line;

                               for($i = 0;$i<count($line);$i++){
                                  $array[$contador][$nombrescampo[$i]] = $line[$i];
                                   if($nombrescampo[$i] == $campo && $line[$i] == $valor){
                                       $borra = "si";
                                   }else{
                                       
                                    
                                   }
                                }
                                $contador++;
                                 if($borra == "si"){
                                      echo "He encontrado una coincidencia<br>";
                                 }else{
                                     echo "No he encontrado una coincidencia<br>";

                                     foreach($line as $a) {
                                         fwrite($file2,'"'.$a.'",');
                                     }
                                     fwrite($file2, PHP_EOL);
                                 }
                            }
                            fclose($file);
                             fclose($file2);
               
                            unlink("db/".$this->db."/".$tabla.".csv");
                            rename("db/".$this->db."/".$tabla."2.csv", "db/".$this->db."/".$tabla.".csv");
                                
                            
                            break;
        }
    }
}

?>