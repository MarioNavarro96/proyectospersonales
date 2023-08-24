import tkinter as tk

class Persona(object):
    def __init__(self,canvas,*argumentos,**masargumentos):
        self.canvas = canvas
        self.id = canvas.create_oval(*argumentos,**masargumentos)
        self.vx = 5
        self.vy = 0

    def mover():
        print("Voy a mover")
        
    
class Aplicacion(object):
    def __init__(self,master):
        self.master = master
        self.canvas = tk.Canvas(self.master,width=512,height=512)
        self.canvas.pack()

        self.personas = [
            Persona(self.canvas,50,50,10,10,outline="black",fill="green"),
            Persona(self.canvas,250,250,30,30,outline="red",fill="blue")

            ]
        self.canvas.pack()
        
        self.master.after(1000,self.bucle)
    def bucle(self):

       
        self.master.after(33,self.bucle)
    

root = tk.Tk()
aplicacion = Aplicacion(root)
