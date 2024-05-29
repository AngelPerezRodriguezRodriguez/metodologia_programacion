import math

'''
El programa, dado como datos el radio y la altura de un
cilindro, calcula su área y su volumen.
'''

def calcular_area(radio, altura):

    return 2 * math.pi * radio * altura
    # Área de un cilindro

def calcular_volumen(radio, altura):

    return math.pi * radio ** 2 * altura
    # Volumen de un cilindro

def main():

    try:

        radio = float(input("Radio: "))

        altura = float(input("Altura: "))

        if radio <= 0 or altura <= 0:

            print("Error: el radio y la altura deben ser mayores que cero.")
            return
    
    except ValueError as e:
        # Se produce cuando una función recibe un argumento 
        # con un valor que no es válido para esa función.

        print(e)
        return

    area = calcular_area(radio, altura)

    volumen = calcular_volumen(radio, altura)

    print(f"El área del cilindro es de {area:.2f} u^2 y")
    
    print(f"el volumen es de {volumen:.2f} u^3")

if __name__ == '__main__':

    main()