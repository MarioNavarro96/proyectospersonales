#Importamos librerias
from tkinter import *                                               
import tkinter as tk
from PIL import ImageTk,Image
from tkinter import messagebox as mb
import sqlite3 as basedatos
import sys
#Importamos librerias
#Nos conectamos a la base de datos y creamos un cursor
conexion = basedatos.connect("videojuegos.db")
cursor = conexion.cursor()
cursor.execute("SELECT * FROM usuarios")
datos = cursor.fetchall()
#Nos conectamos a la base de datos y creamos un cursor
#Establecemos un color de fondo
Color_Fondo = "#FAD317"     
#Establecemos un color de fondo
#Creamos el marco y establecemos su tamaño y color de fondo
marco = Tk()
marco.title("Aplicacion 1.5")
marco.geometry("280x450+300+250")
marco.configure(bg=Color_Fondo)
#Creamos el marco y establecemos su tamaño y color de fondo
#Creamos la etiqueta del nombre del programa
etiqueta = Label(marco, text = "Programa Mario",fg="black", font=("Arial,Verdana,Sans-serif",20),bg=Color_Fondo, padx = 10, pady = 10)
etiqueta.pack()
#Creamos la etiqueta del nombre del programa
#Importamos la imagen y la metemos en el programa ademas de establecer su tamaño
imagen= Image.open("logopython.png")
imagen= imagen.resize((100,100))
fotoImg=ImageTk.PhotoImage(imagen)
panel= Label(marco,image=fotoImg).pack()
#Importamos la imagen y la metemos en el programa ademas de establecer su tamaño
usuario = StringVar()
contrasena= StringVar()
usuario.set("Escribe aquí...")
contrasena.set("Escribe aquí..")
def IniciarSesion():
    usuario=cajaTexto1.get()
    contrasena=cajaTexto2.get()
    cursor.execute("SELECT * FROM usuarios WHERE usuario=? AND contrasena=?", (usuario,contrasena))
    if cursor.fetchall():
        mb.showinfo(title="Bienvenido/a",message="Usuario correcto")
        
    else:
        mb.showerror(title="Error",message="No se ha encontrado al usuario")

def Registrarse():
    marcoRegistro = Tk()
    marcoRegistro.title("Crea tu usuario")
    marcoRegistro.geometry("280x450+300+250")
    marcoRegistro.configure(bg=Color_Fondo)
    etiquetaR1 = Label(marcoRegistro, text = "Registrarse", font  =("Arial,Verdana,Sans-serif",15),bg=Color_Fondo, padx = 10, pady = 10)
    etiquetaR1.pack()
    etiquetaR2 = Label(marcoRegistro, text = "Introduce tu nombre", font  =("Arial,Verdana,Sans-serif",10),bg=Color_Fondo, padx = 10, pady = 10)
    etiquetaR2.pack()
    cajaR1 = Entry(marcoRegistro)
    cajaR1.pack()
    etiquetaR3 = Label(marcoRegistro, text = "Introduce tu apellido", font  =("Arial,Verdana,Sans-serif",10),bg=Color_Fondo, padx = 10, pady = 10)
    etiquetaR3.pack()
    cajaR2 = Entry(marcoRegistro)
    cajaR2.pack()
    etiquetaR4 = Label(marcoRegistro, text = "Introduce un nombre de usuario", font  =("Arial,Verdana,Sans-serif",10),bg=Color_Fondo, padx = 10, pady = 10)
    etiquetaR4.pack()
    cajaR3 = Entry(marcoRegistro)
    cajaR3.pack()
    etiquetaR5 = Label(marcoRegistro, text = "Introduce tu contraseña", font  =("Arial,Verdana,Sans-serif",10),bg=Color_Fondo, padx = 10, pady = 10)
    etiquetaR5.pack()
    cajaR4 = Entry(marcoRegistro)
    cajaR4.pack()
    etiquetaR6 = Label(marcoRegistro, text = "Repite la contraseña", font  =("Arial,Verdana,Sans-serif",10),bg=Color_Fondo, padx = 10, pady = 10)
    etiquetaR6.pack()
    cajaR5 = Entry(marcoRegistro)
    cajaR5.pack()
    def FuncionRegistro():
        nombre=cajaR1.get()
        apellido=cajaR2.get()
        usuario=cajaR3.get()
        contrasena=cajaR4.get()
        contrasena2=cajaR5.get()
        if(contrasena==contrasena2):
         cursor.execute("INSERT INTO usuarios VALUES(NULL,'"+nombre+"','"+apellido+"','"+usuario+"','"+contrasena+"');")
         conexion.commit()
         mb.showinfo(title="Te has registrado correctamente",message="Saludos "+nombre+" "+apellido+" Enhorabuena¡¡")
         marcoRegistro.destroy()
        else:
         mb.showerror(title="Contraseña incorrecta",message="Las contraseñas no coinciden¡¡")
    buttons= Button(marcoRegistro, text="Registrate",command=FuncionRegistro).pack(side="bottom")

def MenuPrincipal():
    marcoPrincipal = Tk()
    marcoPrincipal.title("Menú Principal")
    marcoPrincipal.geometry("280x450+300+250")
    marcoPrincipal.configure(bg=Color_Fondo)
            
etiqueta2 = Label(marco, text = "Introduce tu usuario",font=("Arial,Verdana,Sans-serif",10),bg=Color_Fondo, padx = 10, pady = 10)
etiqueta2.pack()
cajaTexto1 = Entry(marco, font = ("Arial,Verdana,Sans-serif",10),textvariable=usuario)
cajaTexto1.pack()
etiqueta2 = Label(marco, text = "Introduce tu contraseña",font=("Arial,Verdana,Sans-serif",10),bg=Color_Fondo, padx = 10, pady = 10)
etiqueta2.pack()
cajaTexto2 = Entry(marco, font = ("Arial,Verdana,Sans-serif",10),textvariable=contrasena)
cajaTexto2.pack()
etiquetavacia = Label(marco,text=" ",bg=Color_Fondo).pack()
boton1 = Button(marco, text = "Iniciar Sesión",font=("Arial,Verdana,Sans-serif",10),command=IniciarSesion, padx = 10, pady = 10)
boton1.pack()
etiqueta3 = Label (marco, text = "Create un usuario",font=("Arial,Verdana,Sans-serif",10),bg=Color_Fondo, padx = 10, pady = 10)
etiqueta3.pack()
boton2 = Button(marco, text = "Registrarse",font=("Arial,Verdana,Sans-serif",10),command=Registrarse, padx = 10, pady = 10)
boton2.pack()
marco.mainloop()
