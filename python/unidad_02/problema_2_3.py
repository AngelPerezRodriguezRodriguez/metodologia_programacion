import math

'''
El programa, dado como datos los coeficientes de la ecuación,
calcula las raíces reales (si existen).
'''

def formula_general(coeficiente_a, coeficiente_b, discriminante):
    # Fórmula general para resolver ecuaciones de segundo grado

    x_01 = (- coeficiente_b + math.sqrt(discriminante)) / (2 * coeficiente_a)
    # Primera solución

    x_02 = (- coeficiente_b - math.sqrt(discriminante)) / (2 * coeficiente_a)
    # Segunda solución

    return x_01, x_02

def main():

    try:

        coeficiente_a = float(input("Coeficiente a: "))

        coeficiente_b = float(input("Coeficiente b: "))

        coeficiente_c = float(input("Coeficiente c: "))

        if coeficiente_a == 0:

            print("Error: el primer coeficiente debe ser diferente de cero.")
            return

    except ValueError:

        print("Error: por favor, ingresa números flotantes.")
        return
    
    discriminante = coeficiente_b ** 2 - 4 * coeficiente_a * coeficiente_c

    if discriminante >= 0:

        x_01, x_02 = formula_general(coeficiente_a, coeficiente_b, discriminante)

        print("Las raíces reales de la expresión (a * x) ** 2 + (b * x) + c = 0")

        print(f"siendo a = {coeficiente_a}, b = {coeficiente_b} y c = {coeficiente_c}")

        print(f"son {x_01:.2f} y {x_02:.2f}")

    else:

        print("No es posible obtener las raíces reales de la ecuación de segundo grado.")

if __name__ == '__main__':

    main()