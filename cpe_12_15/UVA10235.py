while(True):
    ans = input()
    print(ans[::-1])
    if(int(ans)%2==0):
        print(ans+" is not prime.")
    elif(int(ans[::-1])%2==0):
        print(ans+" is prime.")
    else:
        print(ans+" is emirp.")