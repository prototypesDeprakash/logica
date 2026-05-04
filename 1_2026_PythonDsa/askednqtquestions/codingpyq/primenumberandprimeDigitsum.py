nn,mm = map(int , input().split())
def primenum(n):
    if(n<2):
        return False
    for i in range(2,int(n**0.5)+1):
        if(n%i==0):
            return False
    return True
def digitsum(n):
    res=0
    
    while n !=0:
        temp=n%10
        res+=temp
        n=n//10
    return res
for i in range(nn,mm+1):
    if(primenum(i) and primenum(digitsum(i))):
        print(i)
        
    
