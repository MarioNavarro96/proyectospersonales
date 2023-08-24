import mysql.connector as my
import matplotlib.pyplot as plt


mibd=my.connect(
host="localhost",
user="mario",
password="mario",
database="cursopython"
            )
##print(mibd)

micursor=mibd.cursor()


micursor.execute("SELECT COUNT(Nombre) AS cuenta, Nombre FROM hombres GROUP BY Nombre ORDER BY cuenta DESC LIMIT 10 ")

miresultado=micursor.fetchall()



sizes = [0]
explode = (0, 0.1, 0, 0)  # only "explode" the 2nd slice (i.e. 'Hogs')
longaniza="'hola'"
for i in miresultado:

    sizes.append(i[0])
    longaniza+=",'"+str(i[1])+"'"

labels=eval(longaniza)
print("Vamos a comprobar")
print(labels)
print(sizes)
print("Quiero ver el tipo de dato")
print(type(labels))

fig, ax = plt.subplots()
ax.pie(sizes, labels=labels, autopct='%1.1f%%',
        shadow=True, startangle=90)
ax.axis('equal')
plt.show()
