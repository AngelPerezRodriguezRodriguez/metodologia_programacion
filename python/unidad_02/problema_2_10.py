'''
El programa, dados como datos tres números cuyos valores pueden ser iguales,
determina cuál es el mayor o los mayores.
'''

def encontrar_mayor(numero_01, numero_02, numero_03):

    if numero_01 > numero_02:

        if numero_01 > numero_03:

            print(f"a:{numero_01} es el mayor")

        elif numero_01 == numero_03:

            print(f"a:{numero_01} y c:{numero_03} son los mayores")

        else: 

            print(f"c:{numero_03} es el mayor")

    elif numero_01 == numero_02:

        if numero_01 > numero_03:

            print(f"a:{numero_01} y b:{numero_02} son los mayores")

        elif numero_01 == numero_03:

            print(f"a:{numero_01}, b:{numero_02} y c:{numero_03} son iguales")
        
        else:

            print(f"c:{numero_03} es el mayor")

    elif numero_02 > numero_03:

        print(f"b:{numero_02} es el mayor")

    elif numero_02 == numero_03:

        print(f"b:{numero_02} y c:{numero_03} son los mayores")

    else:

        print(f"c:{numero_03} es el mayor")

def main():

    try: 

        numero_01 = int(input("número a: "))

        numero_02 = int(input("número b: "))

        numero_03 = int(input("número c: "))

    except ValueError as e:

        print(e)
        return
    
    encontrar_mayor(numero_01, numero_02, numero_03)

if __name__ == '__main__':

    main()