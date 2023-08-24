##Programa agenda por Mario Navarro
agenda = [["nombre","telefono","email"]]

#antes de nada cargamos los registros guardados en el archivo de texto
archivo=open("agenda.txt","r")
for i in range (1,10):
    nuevalinea = archivo.readline().split(",")
    agenda.append(nuevalinea)

#antes de seguir muestrame el estado de la agenda
print(agenda)

def miAgenda():
    #Menu Inicial
    print("Escoge tu opcion")
    print("1- Introduce un nuevo registro")
    print("2- Listar registros")
    print("3- Buscar registro")
    opcion = input()
    if opcion == "1":
        print("Introduce el nuevo nombre en la agenda")
        nombre= input()
        print("Introduce el numero de telefono")
        telefono= input()
        print("Introduce el correo")
        correo= input()
        #Antes de nada mas metemos los datos en la lista y la sacamos en pantalla
        agenda.append([nombre,telefono,correo])
        print(agenda)
        #Guardo en archivo
        archivo = open("agenda.txt",'a')
        patata = nombre+","+telefono+","+correo+"\n"
        archivo.write(str(patata))
        archivo.close()
    if opcion == "2":
        for i in range(1,len(agenda)):
            print(agenda[i])
    #ejecucion recursiva
    miAgenda()

miAgenda()
