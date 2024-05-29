import math

'''
El programa, dados los tres lados de un triángulo, calcula su
área.
'''

def calcular_area(lado_01, lado_02, lado_03):

    s = (lado_01 + lado_02 + lado_03) / 2
    # Variable auxiliar

    return math.sqrt(s * (s - lado_01) * (s - lado_02) * (s - lado_03))
    # Área de un triángulo

def main():

    try:
        
        lado_01 = float(input("1er lado: "))

        lado_02 = float(input("2do lado: "))

        lado_03 = float(input("3er lado: "))

        if lado_01 <= 0 or lado_02 <= 0 or lado_03 <= 0:

            print("Error: los lados deben ser mayor que cero.")
            return
        
    except ValueError as e:
        # Se produce cuando una función recibe un argumento 
        # con un valor que no es válido para esa función.

        print(e)
        return
    
    area = calcular_area(lado_01, lado_02, lado_03)

    print(f"El área del triángulo es igual a {area:.4f} u^2")

if __name__ == '__main__':

    main()