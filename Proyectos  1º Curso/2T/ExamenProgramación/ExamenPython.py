#PRIMERO IMPORTO SQLITE
import sqlite3 as basededatos

#ME CONECTO A SQLITEconexion
conexion = basededatos.connect("loterias.sqlite3")

#SIEMPRE TENGO QUE HACER UN CURSOR CUANDO ME CONECTO A LA BASE DE DATOS

cursor = conexion.cursor()

def calculanumero(numero):
    #LE PIDO ALGO CON UN SELECT

    cursor.execute('''
        SELECT *
        FROM Euromillones
        LIMIT 100;
            ''')

    #RECUPERO LA INFORMACION CON UN BUCLE FOR
    minimo = 100000000000
    maximo = 0
    datos = cursor.fetchall()
    for i in datos:
##        print(i[numero])
        if int(i[numero]) < minimo:
            minimo = int (i[numero])

    #HAGO OPERACIONES CON ESA FUNCION
            



    #Y LA SACO POR PANTALLA

    print("El numero al que debes jugar en la casilla",numero,"es",minimo)
    

calculanumero(1)
calculanumero(2)
calculanumero(3)
calculanumero(4)
calculanumero(5)

calculanumero(6)
calculanumero(7)

