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
    
    mensaje = "número par" if (- 1) ** numero > 0 else "número impar"
    # -1 elevado a un número par, es positivo
    # -1 elevado a un número impar, es negativo

    print(f"{numero} es un {mensaje}")

if __name__ == '__main__':

    main()