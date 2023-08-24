from PIL import Image
import math
##Se importa la clase Image de la biblioteca PIL y el módulo math.
imagen = Image.open("jvExamen.jpg")
##Se abre la imagen llamada "jvExamen.jpg" utilizando Image.open() y se asigna a la variable imagen.
pixeles = imagen.load()
print(imagen.size)
##Se imprime el tamaño de la imagen utilizando imagen.size.
print(pixeles[0,0])

altura = imagen.size[1]
##Se obtiene la altura de la imagen utilizando imagen.size[1] y se asigna a la variable altura.
anchura = imagen.size[0]
##Se obtiene la anchura de la imagen utilizando imagen.size[0] y se asigna a la variable anchura.
for x in range(0,anchura):
    for y in range(0,altura):
        rojo = pixeles[x,y][0]
        verde = pixeles[x,y][1]
        azul = pixeles[x,y][2]
        color = math.floor((rojo+verde+azul)/3)
##Se calcula el valor promedio de los componentes de color (rojo, verde y azul) dividiendo la suma por 3 y redondeando el resultado utilizando math.floor(), y se asigna a la variable color

        if color > 127:
            rojo = 255

            verde = 255

            azul = 255

        else:
            rojo = 0

            verde = 0

            azul = 0

        pixeles[x,y] = (rojo,verde,azul)
##Se actualiza el valor del píxel en la imagen utilizando pixeles[x, y] = (rojo, verde, azul).
imagen.save("jvGris.jpg")
##Se guarda la imagen modificada en un archivo llamado "jvGris.jpg" utilizando el método save().
        
