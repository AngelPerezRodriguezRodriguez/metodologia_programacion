'''
El programa, dado como dato el número de sonidos emitidos por un
grillo en un minuto, calcula la temperatura en grados Fahrenheit.
'''

def calcular_temperatura(no_sonidos):

    return no_sonidos / 4 + 40
    # Función de temperatura en grados Fahrenheit
    # de acuerdo al no. de sonidos emitidos por un grillo en un minuto

def main():

    try:

        no_sonidos = int(input("Sonidos por minuto de un grillo: "))

        if no_sonidos <= 0:

            print("Error: el no. de sonidos debe ser mayor que cero.")
            return
    
    except ValueError:

        print("Error: por favor, ingresa un valor válido.")
        return
    
    temperatura = calcular_temperatura(no_sonidos)

    print("La temperatura es igual a")
    
    print(f"{temperatura:.2f} grados Fahrenheit")
    
if __name__ == '__main__':

    main()