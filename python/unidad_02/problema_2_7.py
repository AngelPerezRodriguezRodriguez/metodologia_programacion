"""
El programa, dados como datos tres números enteros, determina si
los mismos están en orden creciente.
"""

def ascendente(numeros, dimension):

    for i in range(dimension - 1):

        if numeros[i] > numeros[i + 1]:

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
    
    sentencia = ascendente(numeros, dimension)

    if not sentencia:

        print("La lista de números no es ascendente")
        return
        
    print("La lista de números es ascendente")      

if __name__ == '__main__':

    main()