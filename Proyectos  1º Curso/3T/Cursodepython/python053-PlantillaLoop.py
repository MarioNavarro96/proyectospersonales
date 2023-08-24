import tkinter as tk

class Persona(object):
    def saluda():
        print("yo soy una persona")
    
class Aplicacion(object):
    def __init__(self,master):
        self.master = master
        print("este es el metodo constructor")
        self.master.after(100,self.bucle)
    def bucle(self):
        print("El programa ha arrancado")
        self.master.after(1000,self.bucle)
    

root = tk.Tk()
aplicacion = Aplicacion(root)
