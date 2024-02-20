z = int(input())
for i in range(1,z+1):
    a = input()
    b = input()
    if(a[0] == "0" or b[0] == "0"):
        print("Pair #"+str(i)+": Love is not all you need!")
    else:
        a10 = int(a,2)
        b10 = int(b,2)
        open = True
        if(a10 < b10):
            for k in range(2,a10):
                if(a10%k==0 and b10%k==0):
                    print("Pair #"+str(i)+": All you need is love!")
                    open = False
                    break
        else:
            for k in range(2,b10):
                if(a10%k==0 and b10%k==0):
                    print("Pair #"+str(i)+": All you need is love!")
                    open = False
                    break
        if(open):
            print("Pair #"+str(i)+": Love is not all you need!")
            
        