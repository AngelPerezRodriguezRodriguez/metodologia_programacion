'''
El programa, teniendo en cuenta ciertos criterios, calcula el aumento de sueldo
para un grupo de trabajadores. Imprime el nuevo sueldo del trabajador y la nómina
correspondiente.
'''

def ingresar_sueldo(no_empleado):

    sueldo = float(input(f"Sueldo del trabajador {no_empleado}: "))

    if sueldo < -1:

        print("Error: el sueldo debe ser mayor que cero.")
        return -1

    return sueldo

def main():

    no_empleado = 1

    nomina = 0

    try:

        sueldo = ingresar_sueldo(no_empleado)

        while sueldo != -1:

            if sueldo < 1000:

                nuevo_sueldo = sueldo * 1.15

            else:

                nuevo_sueldo = sueldo * 1.12
            
            nomina += nuevo_sueldo

            print(f"Nuevo sueldo: {nuevo_sueldo:.2f} \n")
            no_empleado += 1

            sueldo = ingresar_sueldo(no_empleado)

        print(f"Nómina de la empresa: {nomina:.2f}")

    except ValueError as e:

        print(e)
        return

if __name__ == '__main__':

    main()