'''
El programa, dado como dato los galones surtidos a un
cliente en una gasolinera, calcula lo que el mismo debe
pagar.
'''

def convertir_galones(galones):

    litros = galones * 3.785
    # Un galón es igual a 3.785 litros

    return litros

def calcular_total(litros, precio_gasolina):

    total = litros * precio_gasolina

    return total

def main():

    try:

        galones = float(input("Galones de gasolina: "))

        if galones <= 0:

            print("Error: el galón debe ser mayor que cero.")
            return
    
    except ValueError as e:
        # Se produce cuando una función recibe un argumento 
        # con un valor que no es válido para esa función.
        
        print(e)
        return
    
    litros = convertir_galones(galones)

    precio_gasolina = 8.2

    total = calcular_total(litros, precio_gasolina)

    print(f"{galones:.2f} galón(es) equivale(n) a {litros:.2f} litro(s).")

    print(f"Si el litro de gasolina cuesta {precio_gasolina} pesos, entonces")

    print(f"el costo total es de {total:.2f} pesos")

if __name__ == '__main__':

    main()