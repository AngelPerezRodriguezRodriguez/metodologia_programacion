''' 
El programa, dado el costo de un producto y la cantidad de dinero entregada
por el cliente, cacula el vuelto que hay que entregarle al mismo.
'''

def calcular_cambio(precio, pago):

    return pago - precio

def main():

    try:

        precio = float(input("Costo del producto: "))   
        
        pago = float(input("Dinero recibido: "))

        cambio = calcular_cambio(precio, pago)

        print(f"Cambio: {cambio:.2f}")

    except ValueError:

        print("Error: por favor, ingresa un valor válido.")

if __name__ == "__main__":

    main()