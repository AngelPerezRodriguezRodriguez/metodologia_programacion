"""
El programa, dado como dato un número entero, determina si el
mismo es positivo, negativo o nulo.
"""

def main():

    try:

        numero = int(input("Número entero: "))

    except ValueError as e:

        print(e)
        return
    
    if numero < 0:

        print(f"{numero} es un número negativo")
        return
    
    if numero > 0:

        print(f"{numero} es un número positivo")
        return
    
    print(f"{numero} es un número natural dependiendo")

    print("del contexto o corriente de pensamiento")

if __name__ == '__main__':

    main()