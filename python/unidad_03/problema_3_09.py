'''
El programa calcula la suma de una serie.
'''

def main():

    serie = 0

    try:

        numero = int(input("Número: "))

        if numero < 1:

            print("Error: el número debe ser mayor que cero.")
            return

    except ValueError as e:

        print(e)
        return

    for i in range(1, numero + 1):

        serie += i ** i

    print("De acuerdo a la serie: (1 ^ 1) + (2 ^ 2) + (3 ^ 3) + ... + (n ^ n)")

    print(f"El resultado es: {serie}")

if __name__ == '__main__':

    main()