'''
El programa, dados como datos la base y la altura de un
triángulo, calcula su superficie.
'''

def calcular_superficie(base, altura):

    return base * altura / 2

def main():

    try:

        base = float(input("Base del triángulo: "))

        altura = float(input("Altura del triángulo: "))

        area = calcular_superficie(base, altura)

        print(f"El área es de {area:.2f}")

    except ValueError:

        print("Error: por favor, ingresa un valor válido.")

if __name__ == "__main__":
    
    main()