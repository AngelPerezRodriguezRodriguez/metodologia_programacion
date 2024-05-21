'''
El programa, dados como dato la clave de la zona a la cual se llamó y el
número de minutos que duró la llamada, calcula el costo total de la misma.
'''

def calcular_costo(clave, minutos):

    costo = 0

    if clave == 12:

        costo = minutos * 2

    elif clave == 15:

        costo = minutos * 2.2

    elif clave == 18:

        costo = minutos * 4.5

    elif clave == 19:

        costo = minutos * 3.5

    elif clave == 23 or clave == 25:

        costo = minutos * 6

    elif clave == 29:

        costo = minutos * 5

    else:

        print("Error: clave no válida.")

    return costo

def main():

    try:

        clave = int(input("Clave telefónica: "))

        minutos = int(input("Duración de la llamada (min): "))

        if minutos <= 0:

            print("Error: la duración debe ser mayor que cero.")
            return

    except ValueError as e:

        print(e)
        return
    
    costo = calcular_costo(clave, minutos)

    if costo != 0:
    
        print(f"El costo de llamada es de {costo} u")

if __name__ == '__main__':

    main()