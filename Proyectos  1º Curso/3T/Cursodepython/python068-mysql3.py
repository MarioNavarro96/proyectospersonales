import mysql.connector as my
try:
    mibd=my.connect(
    host="localhost",
    user="mario",
    password="mario",
    database="cursopython"
            )
    print(mibd)

    micursor=mibd.cursor()
    micursor.execute("SELECT*FROM personas")

    miresultado=micursor.fetchall()

    ##print(miresultado)

    for i in miresultado:
        print("Tengo un resultado que es: ")
        print(i[1])
except:
    print("Ha ocurrido algún error en la base de datos")
