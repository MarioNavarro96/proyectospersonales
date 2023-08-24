print ("bienvenido al programa calculadora")
print ("Introduce tu nombre")
nombre = input()
print ("Hola",nombre,".Bienvenido al programa calculadora")
def calculadora():

    print ("Ahora elige la operacion que vas a realizar "+
    "\n 1 Suma"+
    "\n 2 Resta"+
    "\n 3 Multiplicacion"+
    "\n 4 Division"+
           "")
    operacion = int (input())
    print ("La operacion que has elegido es",operacion)

    print ("Ahora introduce un numero")
    numero1= int (input())
    print ("Ahora introduce otro numero")
    numero2= int (input())

    if operacion == 1:
        print ("El resultado es ",(numero1+numero2))
    if operacion == 2:
        print ("El resultado es ",(numero1-numero2))
    if operacion == 3:
        print ("El resultado es ",(numero1*numero2))
    if operacion == 4:
        print ("El resultado es ",(numero1/numero2))


    calculadora()

calculadora()
