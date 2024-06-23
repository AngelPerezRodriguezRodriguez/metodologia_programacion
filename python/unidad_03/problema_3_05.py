'''
El programa dado N números enteros como dato, obtiene el número de números
positivos, el promedio de los números positivos y el promedio de todos los
números.
'''

def main():

    numeroPositivos = 0
    sumaPositivos = 0
    sumaDatos = 0

    try:

        numeroDatos = int(input("Número de datos: "))

        if numeroDatos <= 0:

            print("Error: el número de datos debe ser mayor que cero.")
            return

        for i in range(numeroDatos):

            numero = int(input(f"Dato {i + 1}: "))

            if numero > 0:

                numeroPositivos += 1
                sumaPositivos += numero

            sumaDatos += numero

        promedioPositivos = sumaPositivos / numeroPositivos

        promedioDatos = sumaDatos / numeroDatos

        print(f"Número de positivos: {numeroPositivos}")

        print(f"Promedio de positivos: {promedioPositivos:.2f}")

        print(f"Promedio de números: {promedioDatos:.2f}")

    except ValueError as e:

        print(e)
        return
    
if __name__ == '__main__':

    main()