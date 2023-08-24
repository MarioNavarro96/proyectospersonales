from PIL import Image

imagen= Image.open("supermario.jpg")
pixeles=imagen.load()
print(imagen.size)

print(pixeles[0,0])

pixeles[0,0] = (84,26,85)

imagen.save("supermarioguardado.jpg")
