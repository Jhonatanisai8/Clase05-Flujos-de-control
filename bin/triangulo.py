altura = int(input("Ingrese la altura del triángulo: "));
i = 1
j = 1
for i in range(altura):
    for j in range(i):
        print(" * ", end = "")
    print(" ")

for i in range(altura):
    for j in range(altura-i):
        print(" * ",end = "")
    print(" ")