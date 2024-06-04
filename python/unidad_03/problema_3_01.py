'''
El programa, dados 270 números enteros, obtiene la suma de los números
impares y el promedio de los números pares.
'''

def main():

    suma_pares = 0
    
    no_pares = 0

    suma_impares = 0

    try:

        for i in range (270):

            numero = int(input(f"Número {i + 1}: "))

            if numero == 0:
                continue

            if (-1) ** numero > 0:
                # -1 elevado a un número par, es positivo

                suma_pares += numero
                no_pares += 1

            else:
                # -1 elevado a un número impar, es negativo

                suma_impares += numero
    
    except ValueError as e:

        print(e)
        return
    
    # El promedio de 'n' números pares siempre es un número entero
    promedio_pares = suma_pares / no_pares

    print(f"Números pares (promedio): {promedio_pares:.0f}")

    print(f"Números impares (suma): {suma_impares}")

if __name__ == '__main__':

    main()