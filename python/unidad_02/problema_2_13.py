'''
 El programa, dados como datos el número de la matrícula, carrera, semestre y
 promedio de un alumno, determina si dicho alumno es aceptado o no como
 miembro de la facultad menor.
'''

def pertenecer_facultad(carrera, semestre, promedio, matricula):

    estado = "rechazado"

    if carrera == "economia":

        if semestre >= 6 and promedio >= 8.8:

            estado = "aceptado"

    elif carrera == "computacion":

        if semestre > 6 and promedio > 8.5:

            estado = "aceptado"

    elif carrera == "contabilidad" or carrera == "administracion":

        if semestre > 5 and promedio > 8.5:

            estado = "aceptado"
        
    else:

        print("Nombre de carrera no válido.")
        print("El nombre no debe contener acentos")
        return

    print(f"El alumno con matrícula {matricula}")
    print(f"es {estado} en la carrera de {carrera}")

def main():

    try:

        matricula = int(input("Matrícula: "));

        if len(str(matricula)) != 5:

            print("Error: la matrícula debe ser positiva y de cinco dígitos.")
            return

        carrera = input("Carrera: ")

        semestre = int(input("Semestre: "))

        if semestre < 1 or semestre > 12:

            print("Error: el semestre debe estar entre 1 y 12.")
            return

        promedio = float(input("Promedio: "))

        if promedio < 5 or promedio > 10:

            print("Error: el promedio debe estar entre 5 y 10.")
            return

    except ValueError as e:

        print(e)
        return

    pertenecer_facultad(carrera, semestre, promedio, matricula)

if __name__ == '__main__':

    main()