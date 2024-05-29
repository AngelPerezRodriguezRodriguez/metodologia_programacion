"""
El programa, dados como datos tres números enteros, determina si
los mismos están en orden creciente.
"""

def determinar_ascendencia(numeros, dimension):

    for i in range(dimension - 1):
        # Toma los valores entre [0, dimension - 1)

        if numeros[i] > numeros[i + 1]:
            # La lista de números no es ascendente 
            # si un número es mayor que el siguiente en la lista

            return False
    
    return True

def main():
    
    try: 

        dimension = 3

        numeros = []

        for i in range(dimension):

            numero = int(input(f"Número {i + 1}: "))
            numeros.append(numero)

    except ValueError as e:

        print(e)
        return
    
    sentencia = determinar_ascendencia(numeros, dimension)

    mensaje = "es ascendente "if sentencia else "no es ascendente"

    print(f"La lista de números {mensaje}")  

if __name__ == '__main__':

    main()