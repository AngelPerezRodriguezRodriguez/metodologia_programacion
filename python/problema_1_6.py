'''
El programa, dado un número determinado de días, calcula
cuántos segundos tienen éstos.
'''
def calcular_segundos(dias):

    return dias * 60 * 60 * 24

def main():

    try:
        dias = int(input("Días: "))

        if dias <= 0:

            print("Error: el número de días debe ser mayor que cero.")
            return

    except ValueError as e:
        # Se produce cuando una función recibe un argumento 
        # con un valor que no es válido para esa función.

        print("Error: por favor, ingresa un valor válido.")
        return
    
    segundos = calcular_segundos(dias)

    print(f"{dias:d} días equivalen a {segundos:d} segundos")

if __name__ == "__main__":

    main()