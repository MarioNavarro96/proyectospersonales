import sqlite3 as lite
import sys
##Se importa la biblioteca sqlite3 y el módulo sys.

conexion = lite.connect("cd.db")
##Se establece una conexión a la base de datos cd.db usando lite.connect().
cursor = conexion.cursor()
##Se crea un cursor para ejecutar consultas SQL en la base de datos.
cursor.execute("SELECT * FROM coleccioncds")
datos = cursor.fetchall()


##Se define una función llamada miAgenda() que muestra un menú de opciones y realiza diferentes acciones según la opción seleccionada.
def miAgenda():
    # Menu Inicial
    print("Escoge tu opción")
    print("1 - Introduce un nuevo registro de canciones")
    print("2 - Listar registros")
    print("3 - Buscar registro")
    print("4 - Eliminar registro")  
    print("5 - Actualizar registro")
    opcion = input()

    if opcion == "1":
        print("Introduce el título de la canción")
        titulo = input()
        print("Introduce el nombre del artista")
        artista = input()
        print("Introduce el año de lanzamiento de la canción")
        aniolanzamiento = input()
        print("Introduce el género de la canción")
        genero = input()

        cursor.execute("INSERT INTO coleccioncds VALUES(NULL, ?, ?, ?, ?);", (titulo, artista, aniolanzamiento, genero))
        conexion.commit()

    elif opcion == "2":
        cursor.execute("SELECT * FROM coleccioncds")
        datos = cursor.fetchall()
        for i in datos:
            print("Titulo", i[1], "\t Artista", i[2], "\t Año", i[3], "\t Genero", i[4])

    elif opcion == "3":
        print("Introduce el título de la canción a buscar")
        titulo = input()
        cursor.execute("SELECT * FROM coleccioncds WHERE titulo=?", (titulo,))
        datos = cursor.fetchall()
        for i in datos:
            print("Titulo", i[1], "\t Artista", i[2], "\t Año", i[3], "\t Genero", i[4])

    elif opcion == "4":
        print("Introduce el ID del registro a eliminar")
        id_registro = input()
        cursor.execute("DELETE FROM coleccioncds WHERE Identificador =?", (id_registro,))
        conexion.commit()
        print("Registro eliminado exitosamente.")

    elif opcion == "5":
        print("Introduce el ID del registro a actualizar")
        id_registro = input()
        print("Introduce el nuevo título de la canción")
        nuevo_titulo = input()
        print("Introduce el nuevo nombre del artista")
        nuevo_artista = input()
        print("Introduce el nuevo año de lanzamiento de la canción")
        nuevo_aniolanzamiento = input()
        print("Introduce el nuevo género de la canción")
        nuevo_genero = input()

        cursor.execute("UPDATE coleccioncds SET titulo=?, artista=?, aniolanzamiento=?, genero=? WHERE Identificador=?",
                       (nuevo_titulo, nuevo_artista, nuevo_aniolanzamiento, nuevo_genero, id_registro))
        conexion.commit()
        print("Registro actualizado exitosamente.")
##Después de cada operación, se llama a conexion.commit() para guardar los cambios en la base de datos.

    # Ejecución recursiva
    miAgenda()

miAgenda()

##Al final del código, se llama a la función miAgenda() para iniciar el programa.
##La función miAgenda() se ejecuta varias veces, lo que permite realizar múltiples operaciones sin salir del programa.



