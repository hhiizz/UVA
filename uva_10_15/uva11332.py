z = 30
while True:
    z = input()
    if z == "0":break
    while(len(z)>1):
        count= 0
        for i in z:
            count +=int(i)
        z = str(count)
    print(z)