'''
El programa, dado el nombre de un dinosaurio, su peso expresado en toneladas y
su longitud expresada en pies; escribe el nombre del dinosuario, su peso y longitud
expresadas en kilogramos y metros, respectivamente.
'''

def convertir_unidades(peso, longitud):

    peso_kilogramos = peso * 1000
    # Una tonelada es igual a mil kilogramos

    longitud_metros = longitud * 0.3047
    # Un pie es igual a 0.3047 metros

    return peso_kilogramos, longitud_metros

def main():
    
    try:

        nombre = input("Nombre del dinosaurio: ")

        peso = float(input("Peso en toneladas: "))

        longitud = float(input("Longitud en pies: "))

        if peso <= 0 or longitud <= 0:

            print("Error: el peso y la longitud deben ser mayores que cero.")
            return

    except ValueError as e:
        # Se produce cuando una función recibe un argumento 
        # con un valor que no es válido para esa función.

        print("Error: por favor, ingresa un valor válido.")
        return
    
    peso_kilogramos, longitud_metros = convertir_unidades(peso, longitud)

    print(f"El dinosaurio {nombre}")

    print(f"pesa {peso_kilogramos:.2f} kilogramos y")

    print(f"mide {longitud_metros:.2f} metros")

if __name__ == "__main__":

    main()