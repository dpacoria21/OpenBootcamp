import math
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

dibujos = ['disney', 'knd', 'victorius', 'dbz']

# sorted() para ordenar listas, el reverser es para definir si va a ordenar < o >
print(sorted(dibujos, reverse=True))

# Obtener la longitud de una lista
print("Esta es la longitud de la lista: ",len(dibujos))

for dibujo in dibujos:
    print(dibujo)

# Inicia siempre desde el i=0 ---> i<10
for i in range(10):
    print(i)


# Inicia en el primer parametro i=1 ---> i<10
for i in range(1,10):
    print(i)

# el tercer parametro es el aumentador
for i in range(1,10,2):
    print(i)