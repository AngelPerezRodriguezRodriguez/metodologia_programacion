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

        if base <= 0 or altura <= 0:

            print("Error: la altura y la base deben ser mayores que cero.")
            return

    except ValueError as e:
        # Se produce cuando una función recibe un argumento 
        # con un valor que no es válido para esa función.

        print("Error: por favor, ingresa un valor válido.")
        return
    
    area = calcular_superficie(base, altura)

    print(f"Área: {area:.2f}")

if __name__ == "__main__":
    
    main()