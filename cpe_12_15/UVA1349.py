

zz = int(input())
for i in range(1,zz+1):
    size = int(input().split("=")[1])
    mattx = []

    for i in range(size):
        inpu = input().split('')
        for i in inpu:
            # zz = int(i)
            print(i)
            # if (int(i)<0):
            #     print("Test #"+i+":"+" Non-Symmetric.")
            #     break
            mattx.append(i)
    print(mattx)
    if(mattx == mattx[::-1]):
        print("Test #"+i+":"+" Symmetric.")
    else:
        print("Test #"+i+":"+" Non-Symmetric.")