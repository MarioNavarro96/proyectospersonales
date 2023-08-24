import sqlite3 as basedatos
import sys
conexion = basedatos.connect("videojuegos.db")
cursor = conexion.cursor()
cursor.execute("SELECT * FROM usuarios")
datos = cursor.fetchall()

def miAplicacion():
#Menu Inicial

    print("1- Registrarse \n")
    print("2- Iniciar sesión \n")
    opcion = input()
    if opcion == "1":
        print("Introduce tu nombre")
        nombre= input()
        print("Introduce tu apellido")
        apellido= input()
        print("Introduce un nombre para tu usuario")
        usuario= input()
        print("Introduce una contraseña")
        contrasena= input()
        #Antes de nada mas metemos los datos en la lista y la sacamos en pantalla
        cursor.execute("INSERT INTO usuarios VALUES(NULL,'"+nombre+"','"+apellido+"','"+usuario+"','"+contrasena+"');")
        conexion.commit()
        print("Usuario Registrado")
        print("Finalizando programa \n")
    

    else:
        ("Error al registrar Usuario")
        
    if opcion == "2":
        print("Introduce tu usuario \n")
        usuario= input()
        print("Introduce tu contraseña \n")
        contrasena= input()
        cursor.execute("SELECT * FROM usuarios WHERE usuario=? AND contrasena=?", (usuario,contrasena))
        if cursor.fetchall():
            print("Usuario encontrado \n")
            print("Bienvenido/a",usuario,"\n")
        else:
            print("Error usuario no encontrado")
            sys.exit()
        



        print("Escoge tu opción\n")
        print("1 - Introduce un nuevo registro de videojuegos \n")
        print("2 - Listar videojuegos \n")
        print("3 - Buscar un videojuego \n")
        print("4 - Eliminar datos de un videojuego \n")  
        print("5 - Actualizar datos de un videojuego \n")
        print("6 - Cerrar Sesion \n")
        opcion = input()

        if opcion == "1":
            print("Introduce el titulo del videojuego \n")
            titulo = input()
            print("Introduce el genero del videojuego \n")
            genero = input()
            print("Introduce el nombre de la desarroladora del videojuego \n")
            creador = input()
            print("Introduce el año de lanzamiento del videojuego \n")
            aniolanzamiento = input()
            cursor.execute("INSERT INTO videojuegos VALUES(NULL, ?, ?, ?, ?);", (titulo, genero, creador, aniolanzamiento))
            print("El registro se ha guardado correctamente \n")
            print("Finalizando programa...")
            conexion.commit()

        elif opcion == "2":
            cursor.execute("SELECT * FROM videojuegos")
            datos = cursor.fetchall()
            for i in datos:
                print("\t Titulo ", i[1], "\t Genero ", i[2], "\t Creador ", i[3], "\t Año ", i[4])
                conexion.commit()
            print("Finalizando programa")

        elif opcion == "3":
            print("Introduce el título de el videojuego a buscar")
            titulo = input()
            cursor.execute("SELECT * FROM videojuegos WHERE nombre=?", (titulo,))
            datos = cursor.fetchall()
            for i in datos:
                print("\t Titulo", i[1], "\t Genero", i[2], "\t Creador", i[3], "\t Año", i[4])

        elif opcion == "4":
            print("Introduce el ID del dato a eliminar")
            id_registro = input()
            cursor.execute("DELETE FROM videojuegos WHERE identificador =?", (id_registro,))
            conexion.commit()
            print("Registro eliminado exitosamente. \n")

        elif opcion == "5":
            print("Introduce el ID del videojuego a actualizar")
            id_registro = input()
            print("Introduce el nuevo título del videojuego")
            nuevo_titulo = input()
            print("Introduce el nuevo genero del videojuego")
            nuevo_artista = input()
            print("Introduce el nuevo creador del videojuego")
            nuevo_aniolanzamiento = input()
            print("Introduce el nuevo año de lanzamiento del videojuego")
            nuevo_genero = input()

            cursor.execute("UPDATE videojuegos SET nombre=?, genero=?, creador=?, aniolanzamiento=? WHERE identificador=?",
                           (nuevo_titulo, nuevo_artista, nuevo_aniolanzamiento, nuevo_genero, id_registro))
            conexion.commit()
            print("Registro actualizado exitosamente.")
        elif opcion == "6":
            print("Finalizando programa...\n")
            sys.exit()

        else:
            print("Lo que has escrito no es una opcion")


                     

    miAplicacion()
   
miAplicacion()
