from PIL import Image
import math

imagenvertical = Image.open("caras/vertical.png")
pixelesvertical = imagenvertical.load()

imagenhorizontal = Image.open("caras/horizontal.png")
pixeleshorizontal = imagenhorizontal.load()


imagendiagonal1 = Image.open("caras/diagonal1.png")
pixelesdiagonal1 = imagendiagonal1.load()

imagendiagonal2 = Image.open("caras/diagonal2.png")
pixelesdiagonal2 = imagendiagonal2.load()



imagen= Image.open("caras/cara1.jpg")
pixeles=imagen.load()

imagenresultado= Image.open("caras/resultado.png")
pixelesresultado=imagenresultado.load()

altura=imagen.size[1]
anchura=imagen.size[0]

numeropixelesverticales = 0
numeropixeleshorizontales = 0
numeropixelesdiagonales1 = 0
numeropixelesdiagonales2 = 0
##//////////////////VERTICAL
for superx in range(0,247):
    for supery in range(0,247):
        suma = 0;
        for x in range (0,7):
            for y in range(0,7):
                if pixelesvertical[x,y][3] !=0:
                    valor = 0
                    valor = pixeles[superx+x,supery+y][0]-pixelesvertical[x,y][0]
                    suma += valor
            if abs(suma) < 1000:
                pixelesresultado[superx+x,supery+y] = 0
                numeropixelesverticales += 1
            else:
                pixelesresultado[superx+x,supery+y] = 255
print("El numero de pixeles verticales es: "+str(numeropixelesverticales))
##////////////////////vertical
##//////////////////HORIZONTAL
for superx in range(0,247):
    for supery in range(0,247):
        suma = 0;
        for x in range (0,7):
            for y in range(0,7):
                if pixeleshorizontal[x,y][3] !=0:
                    valor = 0
                    valor = pixeles[superx+x,supery+y][0]-pixeleshorizontal[x,y][0]
                    suma += valor
            if abs(suma) < 1000:
                pixelesresultado[superx+x,supery+y] = 0
                numeropixeleshorizontales += 1
            else:
                pixelesresultado[superx+x,supery+y] = 255
print("El numero de pixeles verticales es: "+str(numeropixeleshorizontales))
##////////////////////HORIZONTAL
##//////////////////DIAGONAL1
for superx in range(0,247):
    for supery in range(0,247):
        suma = 0;
        for x in range (0,7):
            for y in range(0,7):
                if pixelesdiagonal1[x,y][3] !=0:
                    valor = 0
                    valor = pixeles[superx+x,supery+y][0]-pixelesdiagonal1[x,y][0]
                    suma += valor
            if abs(suma) < 1000:
                pixelesresultado[superx+x,supery+y] = 0
                numeropixelesdiagonales1 += 1
            else:
                pixelesresultado[superx+x,supery+y] = 255
print("El numero de pixeles verticales es: "+str(numeropixelesdiagonales1))
##////////////////////DIAGONAL1
##//////////////////DIAGONAL2
for superx in range(0,247):
    for supery in range(0,247):
        suma = 0;
        for x in range (0,7):
            for y in range(0,7):
                if pixelesdiagonal2[x,y][3] !=0:
                    valor = 0
                    valor = pixeles[superx+x,supery+y][0]-pixelesdiagonal2[x,y][0]
                    suma += valor
            if abs(suma) < 1000:
                pixelesresultado[superx+x,supery+y] = 0
                numeropixelesdiagonales2 += 1
            else:
                pixelesresultado[superx+x,supery+y] = 255
print("El numero de pixeles verticales es: "+str(numeropixelesdiagonales2
                                                 ))
##////////////////////DIAGONAL2
imagen.save("caras/cara1guardado.jpg")
imagenresultado.save("caras/resultado.png")
