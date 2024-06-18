'''
El programa calcula el resultado de una determinada serie.
'''

def calcular_serie(numero, serie):

    var_control = True

    for i in range (1, numero + 1):

        if var_control:

            serie += 1 / i
            var_control = False

            print(f"{serie:.4f}")
            continue
        
        serie -= 1 / i
        var_control = True

        print(f"{serie:.4f}")
    
    return serie

def main():

    serie = 0

    try:

        numero = int(input("Número entero: "))

    except ValueError as e:

        print(e)
        return
    
    serie = calcular_serie(numero, serie)

    print(f"Resultado de la serie: {serie:.4f}")

if __name__ == '__main__':

    main()