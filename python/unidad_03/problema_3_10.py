'''
El programa calcula el término 180 de la secuencia Fibonacci.
'''

def main():

    primero = 0
    segundo = 1

    for i in range(3, 180 + 1):

        siguiente = primero + segundo

        primero = segundo
        segundo = siguiente

    print("El término 180 de la secuencia Fibonacci es:")

    print(siguiente)

if __name__ == '__main__':

    main()