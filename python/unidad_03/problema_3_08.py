'''
El programa, dado un entero positivo, obtiene e imprime la sucesión de ULAM.
'''

def main():

    try:

        numero = int(input("Número: "))

        if numero < 1:

            print("Error: el número debe ser mayor que cero.")
            return

    except ValueError as e:

        print(e)
        return

    while numero != 1:

        print(f"{numero:.0f}")

        if (-1) ** numero > 0:

            numero /= 2
            continue

        numero = numero * 3 + 1

    print(f"{numero:.0f}")

if __name__ == '__main__':

    main()