a,b= map(int, input().split())

def pal(n):
    res=0
    orig=n
    while n !=0:
        temp=n%10
        res=(res*10)+temp
        n=n//10
    if(orig == res):
        return True
    return False
for i in range(a,b+1):
    if(pal(i)):
        print(i)
