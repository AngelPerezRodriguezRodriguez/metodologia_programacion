import math

'''
El programa, dadas las coordenadas de dos puntos P1 y P2
calcula la distancia entre estos puntos.
'''

def calcular_distancia(x1, y1, x2, y2):

    return math.sqrt(math.pow(x1 - x2, 2) + math.pow(y1 - y2, 2))
    # Distancia entre dos puntos en un plano bidimensional

def main():

    try:
        x1 = float(input("x1: "))

        y1 = float(input("y1: "))

        x2 = float(input("x2: "))

        y2 = float(input("y2: "))

    except ValueError as e:
        # Se produce cuando una función recibe un argumento 
        # con un valor que no es válido para esa función.

        print("Error: por favor, ingresa un valor válido.")
        return

    distancia = calcular_distancia(x1, y1, x2, y2)

    print(f"La distancia entre A({x1}, {y1}) y B({x2}, {y2})")
    
    print(f"es igual a {distancia:.2f} u")

if __name__ == '__main__':

    main()