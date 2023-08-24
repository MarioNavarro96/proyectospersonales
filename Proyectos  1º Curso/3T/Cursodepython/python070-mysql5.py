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
    micursor.execute("UPDATE personas SET telefono = '987654' ")
    mibd.commit()


except:
    print("Ha ocurrido algún error en la base de datos")
