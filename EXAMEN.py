N = int(input("Ingrese numero de alumnos a validar: "))

while N <= 0:
    print("El número ingresado debe ser positivo.")
    N = int(input("Ingrese numero de alumnos a validar: "))


bandera = 0
alumnos = {}
datoscargados = 0

def busca(legajo,diccionario):
  dato=[]
  for i in diccionario.keys():
    if i == legajo:
      dato = diccionario[i]

  return dato


def muestra(diccionario):
  for i in diccionario.items():
    print(i)




while bandera==0 :

  print('''
        MENÚ:

        1) Carga de datos
        2) Búsqueda
        3) Muestra
        4) Salir

        ''')
  
  opcion = input("Elija una opción: ").upper()

  if opcion == "1":
    for i in range(0,N):

      legajo = int(input("Ingrese el número de legajo del alumno "+ str(i+1) + ": "))

      while legajo <= 0:
        print("El número ingresado debe ser positivo.")
        legajo = int(input("Ingrese nuevamente el número de legajo del alumno: "))

      nombre_apellido = input("Ingrese el nombre y apellido del alumno "+ str(i+1) + ": ")

      nota_primer_parcial = int(input("Ingrese la nota del primer parcial: "))
      while nota_primer_parcial <= 0:
        print("El número ingresado debe ser positivo.")
        nota_primer_parcial = int(input("Ingrese la nota del primer parcial: "))

      
      nota_segundo_parcial = int(input("Ingrese la nota del segundo parcial: "))
      while nota_segundo_parcial <= 0:
        print("El número ingresado debe ser positivo.")
        nota_segundo_parcial = int(input("Ingrese la nota del segundo parcial: "))

      alumnos[legajo]=[nombre_apellido,nota_primer_parcial,nota_segundo_parcial]
      datoscargados = 1

  if opcion == "2":
    if datoscargados == 0:
      print("primero debe cargar los datos...")
    if datoscargados == 1:
      legajobusca = int(input("Ingrese el numero de legajo que esta buscando: "))
      print(busca(legajobusca,alumnos))

  if opcion == "3":
    muestra(alumnos)


  if opcion == "4":
    bandera = 1