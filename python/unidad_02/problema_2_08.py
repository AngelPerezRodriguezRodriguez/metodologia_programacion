"""
El programa, dado como dato el monto de la compra de un cliente, determina lo
que el mismo debe pagar teniendo en cuenta una serie de descuentos.
"""

def aplicar_descuento(total_compra):

    if total_compra < 500:

        descuento = 0

    elif total_compra <= 1000:

        descuento = 0.05

    elif total_compra <= 7000:

        descuento = 0.11

    elif total_compra <= 15000:

        descuento = 0.18

    else:

        descuento = 0.25
        
    nuevo_total = total_compra - total_compra * descuento
    
    return descuento, nuevo_total

def main():

    try:

        total_compra = float(input("Total de compra: "))

        if total_compra <= 0:

            print("Error: el total de compra debe ser mayor que cero.")
            return

    except ValueError as e:

        print(e)
        return
    
    descuento, nuevo_total = aplicar_descuento(total_compra)
    
    print(f"{total_compra} u tiene {descuento * 100} % de descuento,")

    print(f"por lo tanto, el nuevo total es de {nuevo_total:2f} u")

if __name__ == '__main__':

    main()