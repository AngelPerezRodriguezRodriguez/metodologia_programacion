'''
El programa, calcula lo que hay que pagarle a un trabajador teniendo en cuenta su
sueldo, horas extras y su categoría.
'''

def obtener_precio_horas_extra(categoria):

    if categoria == 1:

        return 30;
        
    elif categoria == 2:

        return 38;

    elif categoria == 3:

        return 50;

    elif categoria == 4:

        return 70;

    else:

        return 0;

def calcular_nuevo_sueldo(sueldo, horas_extra, precio_horas_extra):

    if horas_extra > 30:

        return sueldo + 30 * precio_horas_extra

    return sueldo + horas_extra * precio_horas_extra

def main():
    
    try:

        sueldo = float(input("Sueldo: "))

        categoria = int(input("Categoría: "))

        horas_extra = int(input("Horas extra: "))

        if sueldo <= 0 or categoria <= 0 or horas_extra < 0:

            print("Error: el sueldo y la categoría deben ser mayor que cero.")
            print("Además, las horas extra debe ser mayor o igual a cero.")
            return

    except ValueError as e:

        print(e)
        return

    precio_horas_extra = obtener_precio_horas_extra(categoria)

    nuevoSueldo = calcular_nuevo_sueldo(sueldo, horas_extra, precio_horas_extra)

    print(f"El sueldo total es de {nuevoSueldo} u")

if __name__ == '__main__':

    main()