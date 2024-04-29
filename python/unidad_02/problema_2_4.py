'''
El programa, dado como datos la matrícula y calificaciones de un alumno; imprime
la matrícula, el promedio y "aprobado" o "no aprobado", dependiendo si su
promedio fue mayor o igual que 6 o menor que 6, respectivamente.
'''

def promediar_calificaciones(calificaciones):

    suma_calificaciones = 0

    for calificacion in calificaciones:
        # Bucle for each

        suma_calificaciones += calificacion
        # Suma de calificaciones

    return suma_calificaciones / 5
    # Promedio de calificaciones

def main():

    try:

        calificaciones = []

        matricula = int(input("Matrícula: "))

        for i in range(5):
            # Toma los valores entre [0, 5)

            calificacion = float(input(f"Calificación {i + 1}: "))

            if not 0 <= calificacion <= 10:

                print("Error: la calificación debe ser entre cero y diez.")
                return

            calificaciones.append(calificacion)

    except ValueError as e:

        print(e)
        return

    promedio = promediar_calificaciones(calificaciones)

    texto = "aprueba" if promedio >= 6 else "no aprueba"

    print(f"El alumno con matrícula {matricula}")
    
    print(f"promedia sus calificaciones con {promedio:.2f}")

    print(f"por lo tanto, {texto} el curso")

if __name__ == '__main__':

    main()