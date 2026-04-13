m,n =map(int,input().split(" "))
arr=[]
allarr=list(map(int,input().split(" ")))
for i in range(0,m):
    x=[]
    for j in range(0,n):
        x.append(allarr[i*n+j])
    arr.append(x)
print(arr)


def is_prime(n):
    if(n<2):
        return False
    for i in range(2,int(n**0.5)+1):
        if(n%i==0):
            return False
    return True

allrowprime=True
isnegative=False
totalelements=0
for i in arr:
    for x in i:
        totalelements+=1
        if(is_prime(x)==False):
            allrowprime=False
            break
        if(x<0):
            isnegative=True

if(n<=0 or m<=0 or isnegative or totalelements<m*n):
    print("Wrong input")


elif(allrowprime):
    print("Valid")
else:
    print("Not valid")

