import time
contador = 0
numero = 0.0000032542345

def bucle(contador,numero):
    contador = contador + 1
    if contador % 100 == 0:
        print ("ok la cosa va bien")
    numero = numero*1.2
    time.sleep(0.01)
    bucle(contador,numero)
bucle(contador,numero)
    
