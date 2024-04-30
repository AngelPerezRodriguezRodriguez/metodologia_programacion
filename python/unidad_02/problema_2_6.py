"""
El programa, dado como dato un número entero, determina si el
mismo es par, impar o nulo.
"""

def main():

    try:

        numero = int(input("Número entero: "))

    except ValueError as e:

        print(e)
        return       
    
    if (- 1) ** numero > 0:

        print(f"{numero} es un número par")
        # -1 elevado a un número par, es positivo
        return

    print(f"{numero} es un número impar")
    # -1 elevado a un número impar, es negativo

if __name__ == '__main__':

    main()