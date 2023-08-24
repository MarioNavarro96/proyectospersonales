import matplotlib.pyplot as plt
import mysql.connector as my
mibd=my.connect(
host="localhost",
user="mario",
password="mario",
database="cursopython")


micursor=mibd.cursor()
micursor.execute("select FROM_UNIXTIME(`utc`, '%d.%m.%Y') as ndate, count(id) as post_count from logs group by ndate;")

miresultado=micursor.fetchall()

lista = []

for i in miresultado:
    lista.append(i[1])
    print(str(i[1])+" - "+str(i[0]))



plt.plot(lista)
plt.ylabel('visitas')
plt.show()
