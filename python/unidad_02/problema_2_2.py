'''
El programa, dado como datos dos valores enteros, determina si los
mismos satisfacen una expresión.
'''

def calcular_expresion(numero_01, numero_02):

    return numero_01 ** 3 + numero_02 ** 4 - 2 * numero_01 ** 2
    # Expresión que contempla ambos números de entrada

def main():

    try:

        numero_01 = int(input("1er número: "))

        numero_02 = int(input("2do número: "))

    except ValueError as e:

        print("Error: por favor, ingresa un valor válido.")
        return
    
    resultado = calcular_expresion(numero_01, numero_02)

    condicion = resultado < 680
    # Valor booleano

    mensaje = "cumplen" if condicion else "no cumplen"

    simbolo = '<' if condicion else '>'

    print(f"P = {numero_01} y Q = {numero_02} {mensaje} con la condición")

    print(f"P ** 3 + Q ** 4 - 2 * P ** 2 < 680")

    print(f"{resultado:.0f} {simbolo} 680")

if __name__ == '__main__':

    main()