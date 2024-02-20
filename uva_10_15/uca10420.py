count = int(input())
ans = dict()
for i in range(count):
    zz = input()
    zz = zz.split(" ")
    if(not zz[0] in ans):
        ans[zz[0]] = 1
    else:
        ans[zz[0]]+=1
ans = dict(sorted(ans.items(),key=lambda x:x[0]))
for k,v in ans.items():
    print(k,v)
