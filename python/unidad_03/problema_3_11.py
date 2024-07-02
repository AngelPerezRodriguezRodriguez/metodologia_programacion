'''
El programa, obtiene el total de votos y el porcentaje obtenido por los cuatro
candidatos de una elección.
'''

def main():

    votos_candidato_01 = 0
    votos_candidato_02 = 0
    votos_candidato_03 = 0
    votos_candidato_04 = 0

    try:

        voto = int(input("Voto: "))

        while (voto != 0):

            if voto == 1:

                votos_candidato_01 += 1

            elif voto == 2:

                votos_candidato_02 += 1

            elif voto == 3:

                votos_candidato_03 += 1

            elif voto == 4:

                votos_candidato_04 += 1

            else:

                print("Error: voto no válido.")

            voto = int(input("Voto: "))
        
    except ValueError as e:

        print(e)
        return

    total_votos = votos_candidato_01 + votos_candidato_02 + votos_candidato_03 + votos_candidato_04

    porcentaje_candidato_01 = (votos_candidato_01 / total_votos) * 100
    porcentaje_candidato_02 = (votos_candidato_02 / total_votos) * 100
    porcentaje_candidato_03 = (votos_candidato_03 / total_votos) * 100
    porcentaje_candidato_04 = (votos_candidato_04 / total_votos) * 100

    print(f"Votos candidato 01: {votos_candidato_01} \nPorcentaje: {porcentaje_candidato_01:.2f}")
    print(f"Votos candidato 02: {votos_candidato_02} \nPorcentaje: {porcentaje_candidato_02:.2f}")
    print(f"Votos candidato 03: {votos_candidato_03} \nPorcentaje: {porcentaje_candidato_03:.2f}")
    print(f"Votos candidato 04: {votos_candidato_04} \nPorcentaje: {porcentaje_candidato_04:.2f}")

    print(f"Total de votos: {total_votos}")

if __name__ == '__main__':

    main()