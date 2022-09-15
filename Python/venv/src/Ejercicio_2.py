
peso = int(input('Ingrese su peso en kg: '))
estatura = float(input('Ingrese su altura en metros: '))

indiceMasaCorporal = peso/(estatura**2)
indiceMasaCorporal = int(indiceMasaCorporal*100)/100

print('Tu indice de masa corporal es: ', indiceMasaCorporal)