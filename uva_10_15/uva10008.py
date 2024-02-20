count = int(input())
oo = dict()
for i in range(count):
    zz =  input().upper()
    for i in zz:
        if(ord(i)>=ord('a') and ord(i)<=ord('z') or ord(i)>=ord('A') and ord(i)<=ord('Z')):
            if(not i in oo):
                oo[i] = -1
            else:
                oo[i]-=1
oo = sorted(oo.items(),key=lambda x:(x[1],x[0]),reverse= False)
for k,v in oo:
    print(k,v*-1)