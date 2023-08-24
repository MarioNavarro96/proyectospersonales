
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.1.1">
    <title>Dashboard Template · Bootstrap</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/dashboard/">
    <script
  src="https://code.jquery.com/jquery-3.6.4.js"
  integrity="sha256-a9jBBRygX1Bh5lt8GZjXDzyOB+bWve9EiO7tROUtj/E="
  crossorigin="anonymous"></script>

    <!-- Bootstrap core CSS -->
<link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="dashboard.css" rel="stylesheet">
  </head>
  <body>
    <nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
  <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href="#">SISTEMA PRINCIPAL</a>
  <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-toggle="collapse" data-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <input class="form-control form-control-dark w-100" type="text" placeholder="Search" aria-label="Search">
  <ul class="navbar-nav px-3">
    <li class="nav-item text-nowrap">
      <a class="nav-link" href="#">Buscar</a>
    </li>
  </ul>
</nav>

<div class="container-fluid">
  <div class="row">
    <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
      <div class="sidebar-sticky pt-3">
        <ul class="nav flex-column">
          <li class="nav-item">
            <a class="nav-link active" href="#">
              <span data-feather="home"></span>
              Escritorio <span class="sr-only">(current)</span>
            </a>
          </li>
                        <?php

            include "../CRUD/conexiondb.php";
            $resultado = mysqli_query ($enlace,"
            SHOW TABLES");
            while ($fila = $resultado->fetch_assoc()) {
            
                echo'
                
                    <li class="nav-item">
                    <a class="nav-link" href="?tabla='.$fila['Tables_in_examen'].'">
                    <span data-feather="file"></span>
                    '.$fila['Tables_in_examen'].'
                    </a>
                    </li>
                ';
            }

                        ?>
            
        
            
         
        </ul>

        <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
          <span>Informes guardados</span>
          <a class="d-flex align-items-center text-muted" href="#" aria-label="Add a new report">
            <span data-feather="plus-circle"></span>
          </a>
        </h6>
        <ul class="nav flex-column mb-2">
         
                                <?php

            include "../CRUD/conexiondb.php";
            $resultado = mysqli_query ($enlace,"
            SHOW FULL TABLES IN examen WHERE TABLE_TYPE LIKE 'VIEW'");
            while ($fila = $resultado->fetch_assoc()) {
            
                echo'

                          <li class="nav-item">
                    <a class="nav-link" href="#">
                      <span data-feather="file-text"></span>
                       '.$fila['Tables_in_simulacro'].'
                    </a>
                  </li>';
            }

                        ?>
            
        </ul>
      </div>
    </nav>

    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        <h1 class="h2">Dashboard</h1>
        <div class="btn-toolbar mb-2 mb-md-0">
          <div class="btn-group mr-2">
            <button type="button" class="btn btn-sm btn-outline-secondary">Share</button>
            <button type="button" class="btn btn-sm btn-outline-secondary">Export</button>
          </div>
          <button type="button" class="btn btn-sm btn-outline-secondary dropdown-toggle">
            <span data-feather="calendar"></span>
            This week
          </button>
        </div>
      </div>

     <!-- <canvas class="my-4 w-100" id="myChart" width="900" height="380"></canvas>
-->

      <h2>SECCIÓN</h2>
      <div class="table-responsive">
          <style>.table-responsive{overflow-x: visible !important;}</style>
        <table class="table table-striped table-sm">
          <thead>
            <tr>
                 <?php

            include "../CRUD/conexiondb.php";
            $resultado = mysqli_query ($enlace,"
            SHOW COLUMNS FROM ".$_GET['tabla']."");
                
                $contador = 0;
                $cabeceras;
            while ($fila = $resultado->fetch_assoc()) {
                
                $cabeceras[$contador] = $fila['Field'];
            
                echo'
                
                      <th>'.$fila['Field'].'</th>
                            ';
                $contador++;
                        }
                
                //var_dump($cabeceras);
                    
                        ?>
                <th>Ver</th>
                <th>Actualizar</th>
                <th>Eliminar</th>
            </tr>
          </thead>
          <tbody>
            
                  <?php

            include "../CRUD/conexiondb.php";
            $resultado = mysqli_query ($enlace,"
            SELECT * FROM ".$_GET['tabla']."");
            while ($fila = $resultado->fetch_array()) {
                echo '<tr>';
                
                $contador= 0;
                
                for($i=0;$i<count($fila)/2;$i++){
                    echo'<td cabecera="'. $cabeceras[$contador].'"identificador='.$fila[0].'>'.$fila[$i].'</td>';
                    
            $contador++;
                }
                
                echo '  <td><a href="ver.php?tabla='.$_GET['tabla'].'&id'.$fila[0].'">Ver</td>
                        <td><a href="actualizar.php?tabla='.$_GET['tabla'].'&id='.$fila[0].'">Actualizar</td>
                        <td><a href="eliminar.php?tabla='.$_GET['tabla'].'&id='.$fila[0].'">Eliminar</td>';
                
                 echo ' </tr>';
                
                        }

                        ?>
             
             
            
          </tbody>
        </table>
      </div>
        <div id="ajax"></div>
        
        <div class="modal" tabindex="-1" role="dialog" id="myModal">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <p>Modal body text goes here.</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary">Save changes</button>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
        <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Modal</button>
        
        
        
        
    </main>
  </div>
</div>
<!--<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
      <script>window.jQuery || document.write('<script src="../assets/js/vendor/jquery.slim.min.js"><\/script>')</script>--><script src="../assets/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.9.0/feather.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.min.js"></script>
        <script src="dashboard.js"></script>
    
    <script>
        var tabla = '<?php echo $_GET['tabla']?>'
            $("td").dblclick(function(){
                $(this).attr("contenteditable","true");
            })
        $("td").blur(function(){
            $(this).attr("contenteditable","false");
            console.log("Voy a meter esto en la base de datos")
            var valor = $(this).text()
            console.log("El nuevo valor de la celda es: "+valor)
            var identificador = $(this).attr("identificador")
            console.log("El  valor sobre el que voy a trabajar en la base de datos tiene el id : "+identificador)
            var columna = $(this).attr("cabecera")
            console.log ("La columna es "+columna)
            console.log ("Y la tabla es "+tabla)
            $("#ajax").load("ajax.php?valor="+valor+"&identificador="+identificador+"&columna="+columna+"&tabla="+tabla)
            alert("Tu registro se ha introducido en la base de datos")
        })
        

        
      </script>
    
    
    
    </body>
</html>
