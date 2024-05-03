"""
El programa, dado como dato el precio básico de un artículo, calcula el
impuesto correspondiente del mismo teniendo en cuenta ciertos criterios.
"""

def aplicar_impuesto(precio):

    if precio <= 20:

        impuesto = 0

    elif precio <= 40:

        impuesto = (precio - 20) * 0.3

    elif precio <= 500:

        impuesto = 20 * 0.3 + (precio - 40) * 0.4

    else:

        impuesto = 20 * 0.3 + (precio - 40) * 0.5

    nuevo_precio = precio + impuesto

    return nuevo_precio

def main():

    try:

        precio = float(input("Precio del artículo: "))

        if precio <= 0:

            print("Error: el precio debe ser mayor que cero.")
            return
    
    except ValueError as e:

        print(e)
        return
    
    nuevo_precio = aplicar_impuesto(precio)

    print(f"El precio del artículo más impuestos")

    print(f"da un total de {nuevo_precio:.2f} u")

if __name__ == '__main__':

    main()