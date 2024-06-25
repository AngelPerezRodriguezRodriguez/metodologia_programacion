'''
El programa obtiene el mayor y menor de N números enteros que se ingresan.
'''

def obtener_mayor_menor(lista_datos):

    if lista_datos[0] > lista_datos[1]:

        numero_mayor = lista_datos[0]
        numero_menor = lista_datos[1]

    else:

        numero_mayor = lista_datos[1]
        numero_menor = lista_datos[0]

    for i in range(2, len(lista_datos)):

        if lista_datos[i] > numero_mayor:

            numero_mayor = lista_datos[i]

        elif lista_datos[i] < numero_menor:

            numero_menor = lista_datos[i]

    print(f"Número mayor: {numero_mayor}")

    print(f"Número menor: {numero_menor}")

def main():

    try:

        numero_datos = int(input("Número de datos: "))

        if numero_datos < 2:

            print("Error: el número de datos debe ser mayor que uno.")
            return

        lista_datos = []

        for i in range(numero_datos):

            numero = int(input(f"Dato {i + 1}: "))
            lista_datos.append(numero)

    except ValueError as e:

        print(e)
        return

    obtener_mayor_menor(lista_datos)

if __name__ == '__main__':

    main()