import mysql.connector as my
import matplotlib.pyplot as plt
import numpy as np


mibd=my.connect(
host="localhost",
user="mario",
password="mario",
database="cursopython"
            )
##print(mibd)

micursor=mibd.cursor()


micursor.execute("SELECT COUNT(Nombre) AS cuenta, Nombre FROM hombres GROUP BY Nombre ORDER BY cuenta DESC LIMIT 50 ")
miresultado=micursor.fetchall()
longaniza = "'hola'"
performance = [0]
for i in miresultado:

    longaniza += ",'"+str(i[1])+"'"
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
