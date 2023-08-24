import mysql.connector as my
import matplotlib.pyplot as plt
import numpy as np


mibd=my.connect(
host="localhost",
user="mario",
password="mario",
database="cursopython"
            )
micursor=mibd.cursor()
longaniza = "'hola'"
performance = [0]

micursor.execute("SELECT COUNT(id) AS cuenta FROM logs WHERE navegador LIKE ('%Macintosh%')")
miresultado=micursor.fetchall()
for i in miresultado:
    longaniza += ",'Macintosh'"
    performance.append(i[0])

micursor.execute("SELECT COUNT(id) AS cuenta FROM logs WHERE navegador LIKE ('%Windows%')")
miresultado=micursor.fetchall()
for i in miresultado:
    longaniza += ",'Windows'"
    performance.append(i[0])

micursor.execute("SELECT COUNT(id) AS cuenta FROM logs WHERE navegador LIKE ('%iPhone%')")
miresultado=micursor.fetchall()
for i in miresultado:
    longaniza += ",'iPhone'"
    performance.append(i[0])

micursor.execute("SELECT COUNT(id) AS cuenta FROM logs WHERE navegador LIKE ('%Android%')")
miresultado=micursor.fetchall()
for i in miresultado:
    longaniza += ",'Android'"
    performance.append(i[0])




people = eval(longaniza)
print(people)

plt.rcdefaults()
fig, ax = plt.subplots()

# Example data

y_pos = np.arange(len(people))

error = np.random.rand(len(people))

ax.barh(y_pos, performance, xerr=error, align='center')
ax.set_yticks(y_pos, labels=people)
ax.invert_yaxis()  # labels read top-to-bottom
ax.set_xlabel('Performance')
ax.set_title('How fast do you want to go today?')

plt.show()

