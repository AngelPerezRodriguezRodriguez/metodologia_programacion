'''
El programa dada información sobre las ventas que hizo un vendedor, obtiene
cuantas ventas fueron chicas, medianas y grandes.
'''

def main():

    no_ventas_chi = 0
    no_ventas_med = 0
    no_ventas_gra = 0

    try:

        numero_ventas = int(input("Número de ventas: "))

        if numero_ventas < 1:

            print("Error: el número de ventas debe ser mayor que cero.")
            return

        for i in range(numero_ventas):

            venta = float(input(f"Venta {i + 1}: "))

            if venta <= 200:

                no_ventas_chi += 1

            elif venta < 400:

                no_ventas_med += 1

            else:

                no_ventas_gra += 1

    except ValueError as e:

        print(e)
        return

    print(f"Número de ventas chicas: {no_ventas_chi}")

    print(f"Número de ventas medianas: {no_ventas_med}")

    print(f"Número de ventas grandes: {no_ventas_gra}")

if __name__ == '__main__':

    main()