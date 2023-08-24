##Definimos una clase
class Persona:
    def __init__(self,nombre,edad,apellido,colorpelo):
        self.nombre = nombre
        self.edad = edad
        self.apellido = apellido
        self.colorpelo = colorpelo
    def mePresento(self):
        print("Hola mi nombre es "+self.nombre)
    
persona1 = Persona("Mario",26,"Navarro","Negro")
persona2 = Persona("Nerea",20,"Galán","Rubia")

print(persona1.nombre)
print(persona2.nombre)

persona1.mePresento()
