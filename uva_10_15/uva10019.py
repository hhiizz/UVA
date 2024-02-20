z = int(input())
for i in range(z):
    a = int(input())
    print( str(bin(a).count("1"))+" "+str(bin(int(str(a),16)).count("1")))