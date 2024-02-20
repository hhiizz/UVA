count = int(input())
for i in range(1,count+1):
    z1 = int(input(),2)
    z2 = int(input(),2)
    yes = False
    while(z2 != 0):
        register = z2
        z2 = z1%z2
        z1 = register
    print("Pair #"+str(i)+": All you need is love!"  if z2==0 and z1!= 1 else "Pair #"+str(i)+": Love is not all you need!")
