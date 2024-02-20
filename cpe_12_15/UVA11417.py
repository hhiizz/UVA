import math
while(True):
    z = int(input())
    if(z==0):break
    ans = 0
    for i in range(1,z):
        for j in range(i+1,z+1):
            o = i
            p = j
            while(o!=0):
                register = o
                o = p%o
                p = register
            print(i,j,o,p)
            ans+=p
    print(ans)