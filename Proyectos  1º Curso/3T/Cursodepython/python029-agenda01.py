##Programa agenda por Mario Navarro
agenda = [["nombre","telefono","email"]]
agenda.append(["nombre29","telefono29","email29"])


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
    #ejecucion recursiva
    miAgenda
miAgenda()

