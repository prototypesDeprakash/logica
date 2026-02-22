

def fact(n):
    res=1
    for i in range(n,1,-1):
        res*=i
    return res
num=415
res=0
while num!=0:
    x=num%10
    res+=fact(x)
    num=num//10
print(res)
