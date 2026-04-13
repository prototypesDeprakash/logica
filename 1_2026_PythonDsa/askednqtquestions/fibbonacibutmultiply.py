n=5

a=1
b=1
c=1
n-=1

res=1
while(n!=0):
    c=(a*b)*2
    res+=c
    a=b
    b=c
    n-=1
print(res)
