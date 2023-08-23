#                                           PRACTICA 1
import tkinter as tk

# Crear la ventana principal
root = tk.Tk()
root.title("Hola Mundo con Tkinter")

# Añadir un label que dice "Hola Mundo"
label = tk.Label(root, text="Hola Mundo")
label.pack(pady=20, padx=20)

# Mostrar la ventana y entrar al bucle principal
root.mainloop()

#                                           PRACTICA 2
import tkinter as tk
from tkinter import messagebox

def mostrar_mes():
    try:
        valor = int(entry.get())
        if 1 <= valor <= 12:
            meses = [
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
            ]
            mes = meses[valor-1]
            messagebox.showinfo("Resultado", f"El mes es: {mes}")
        else:
            messagebox.showwarning("Advertencia", "Por favor, ingresa un número entre 1 y 12.")
    except ValueError:
        messagebox.showerror("Error", "Por favor, ingresa un valor numérico válido.")

# Crear la ventana principal
root = tk.Tk()
root.title("Mes Correspondiente")

# Crear widgets
label = tk.Label(root, text="Ingresa un valor entre 1 y 12:")
label.pack(pady=10)

entry = tk.Entry(root)
entry.pack(pady=10)

button = tk.Button(root, text="Mostrar Mes", command=mostrar_mes)
button.pack(pady=10)

# Mostrar la ventana y entrar al bucle principal
root.mainloop()

#                                           PRACTICA 3
import tkinter as tk
from tkinter import messagebox

def calcular():
    num1 = entry1.get()
    num2 = entry2.get()
    operacion = operador.get()

    try:
        num1 = float(num1)
        num2 = float(num2)
        
        if operacion == "+":
            resultado = num1 + num2
        elif operacion == "-":
            resultado = num1 - num2
        elif operacion == "*":
            resultado = num1 * num2
        elif operacion == "/":
            if num2 == 0:
                messagebox.showerror("Error", "No se puede dividir por cero.")
                return
            resultado = num1 / num2
        else:
            messagebox.showerror("Error", "Operación no válida.")
            return
        
        label_result.config(text=f"Resultado: {resultado}")

    except ValueError:
        messagebox.showerror("Error", "Introduce números válidos.")

root = tk.Tk()
root.title("Calculadora Básica")

# Crear widgets
label1 = tk.Label(root, text="Número 1:")
label1.pack(pady=10)

entry1 = tk.Entry(root)
entry1.pack(pady=10)

label2 = tk.Label(root, text="Número 2:")
label2.pack(pady=10)

entry2 = tk.Entry(root)
entry2.pack(pady=10)

operador = tk.StringVar()
operador.set("+")
opciones = ["+", "-", "*", "/"]
dropdown = tk.OptionMenu(root, operador, *opciones)
dropdown.pack(pady=10)

boton = tk.Button(root, text="Calcular", command=calcular)
boton.pack(pady=10)

label_result = tk.Label(root, text="Resultado: ")
label_result.pack(pady=10)

root.mainloop()
