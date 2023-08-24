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
    micursor.execute("INSERT INTO personas VALUES (NULL,'Antonio','567467','correoantionio@.com')")
    mibd.commit()


except:
    print("Ha ocurrido algún error en la base de datos")
