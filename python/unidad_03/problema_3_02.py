'''
El programa imprime y suma los términos de una serie.
'''

def main():

    i = 2

    sumaSerie = 0

    varControl = True

    while (i <= 1800):

        sumaSerie += i
        print(f"Se suma el número: {i}")

        if varControl:

            i += 3
            print(f"Total: {sumaSerie} \n")

            varControl = False
            continue

        i += 2
        print(f"Total: {sumaSerie} \n")

        varControl = True

    print(f"Total final: {sumaSerie}")

if __name__ == '__main__':

    main()