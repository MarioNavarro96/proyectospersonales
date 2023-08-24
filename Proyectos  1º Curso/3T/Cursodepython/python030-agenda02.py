##Programa agenda por Mario Navarro
agenda = [["nombre","telefono","email"]]
agenda.append(["nombre2","telefono2","email2"])

def miAgenda():
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

    #ejecucion recursiva
    miAgenda()

miAgenda()
