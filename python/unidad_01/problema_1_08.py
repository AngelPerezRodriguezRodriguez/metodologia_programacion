import math

'''
El programa, dadas las coordenadas de dos puntos P1 y P2
calcula la distancia entre estos puntos.
'''

def calcular_distancia(x_01, y_01, x_02, y_02):

    return math.sqrt((x_01 - x_02) ** 2 + (y_01 - y_02) ** 2)
    # Distancia entre dos puntos en un plano bidimensional

def main():

    try:

        x_01 = float(input("x1: "))

        y_01 = float(input("y1: "))

        x_02 = float(input("x2: "))

        y_02 = float(input("y2: "))

    except ValueError as e:
        # Se produce cuando una función recibe un argumento 
        # con un valor que no es válido para esa función.

        print(e)
        return

    distancia = calcular_distancia(x_01, y_01, x_02, y_02)

    print(f"La distancia entre A({x_01}, {y_01}) y B({x_02}, {y_02})")
    
    print(f"es igual a {distancia:.2f} u")

if __name__ == '__main__':

    main()