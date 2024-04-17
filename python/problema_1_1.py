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

        if precioProducto <= 0 or pagoRecibido <= 0:

            print("Error: el precio y el pago deben ser mayores que cero.")
            return

    except ValueError:
        # Se produce cuando una función recibe un argumento 
        # con un valor que no es válido para esa función.

        print("Error: por favor, ingresa un valor válido.")
        return

    cambio = calcular_cambio(pagoRecibido, precioProducto)

    print(f"Cambio: {cambio:.2f}")

if __name__ == "__main__":

    main()