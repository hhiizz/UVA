
while(True):
    z = int(input())
    if(z == 0):
        break
    print("The parity of "+bin(z)[2:]+" is "+str(bin(z).count("1"))+" (mod 2).")
