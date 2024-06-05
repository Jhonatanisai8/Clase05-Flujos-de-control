#variables
numero = int()
i = 0
#pedimos los números 
#finaliza hasta que se introdusca un '0'
while True:
     print("Ingresa un número (0 para finalizar): ")
     numero = int(input())
     if(numero == 0):
      break 
     suma = 0
        #pedimos el numero
     if(numero!=0):
        for i in range(numero+1):
          suma+=i
     print("La suma desde 0 hasta ",numero," es: ",suma)