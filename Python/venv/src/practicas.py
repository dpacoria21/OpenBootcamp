a=5
print(id(a))
a = 6
print(id(a))
a=5
print(id(a))

#tupla no puede cambiar sus valores
mivariable = ('a',2,'z')
print(mivariable)

lista1 = ['a','b','c']
lista2 = ['x','y','z']
lista1.append(lista2)
print(lista1)

diccionario = {
    'clave1' : 'valor',
    'clave2': 15,
    'clave3': 18,
    'clave4': 'Hola'
}
print(diccionario)
diccionario.pop('clave3')
print(diccionario)

#Los conjuntos no permiten repeticiones
conjunto = {1,2,3,1,2,3}
print(conjunto)

miTexto = 'hola, esto es un texto'
miTexto = miTexto.capitalize()
print(miTexto)
miTexto = miTexto.lower()
print(miTexto)
miTexto = miTexto.replace('e', 'i')
print(miTexto)
print(miTexto.find('isto'))
print(miTexto[6])
print(miTexto.split())
lista = miTexto.split()
print(''.join(lista))

num1 = 5
num2 = 2
num1 **= num2
print(num1)