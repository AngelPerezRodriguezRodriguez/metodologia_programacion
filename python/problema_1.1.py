''' 
El programa, dado el costo de un producto y la cantidad de dinero entregada
por el cliente, calcula el vuelto que hay que entregarle al mismo.
'''

def calcular_cambio(pagoRecibido, precioProducto):

    return pagoRecibido - precioProducto

def main():

    try:

        precioProducto = float(input("Costo del producto: "))   
        
        pagoRecibido = float(input("Dinero recibido: "))

        cambio = calcular_cambio(pagoRecibido, precioProducto)

        print(f"Cambio: {cambio:.2f}")

    except ValueError:

        print("Error: por favor, ingresa un valor válido.")

if __name__ == "__main__":

    main()