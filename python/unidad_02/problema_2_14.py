'''
El programa, dados como datos la edad del paciente, el tipo de enfermedad
padecida y el número de días hospitalizados, calcula el costo total por
internación.
'''

def calcular_costo(enfermedad, dias, edad):

    if enfermedad == 1:

        costo_total = dias * 25

    elif enfermedad == 2:

        costo_total = dias * 16

    elif enfermedad == 3:

        costo_total = dias * 20

    elif enfermedad == 4:

        costo_total = dias * 32

    else:

        print("Número de enfermedad no válido.")
        return

    if edad >= 14 and edad <= 22:

        costo_total *= 1.1

    print(f"El costo total por los servicios del hospital es de {costo_total:.2f}")

def main():

    try:

        enfermedad = int(input("Tipo de enfermedad: "))

        edad = int(input("Edad del paciente: "))

        if edad < 0 or edad > 120:

            print("Error: la edad debe estar entre 0 y 120.")
            return

        dias = int(input("Días hospitalizado: "))

        if dias < 1:

            print("Error: el registro de días debe ser mayor que cero.")
            return
        
    except ValueError as e:

        print(e)
        return
    
    calcular_costo(enfermedad, dias, edad)

if __name__ == '__main__':

    main()