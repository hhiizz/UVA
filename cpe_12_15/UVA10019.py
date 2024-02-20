z = int(input())
for i in range(z):
    z = input()
    print(str(bin(int(z)).count("1"))+" "+str(bin(int(z,16)).count("1")))
