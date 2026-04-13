m=int(input())
n=int(input())

def isPrimt(n):
    if(n<2):
        return False
    for i in range(2,int(n**0.5)+1):
        if(n%i==0):
            return False
    return True


def cubepowersum(m,n):
    res=0
    for i in range(m,n+1):
        res+=i**3
    print(res)
def primeonlyxum():
    res=0
    for  i in range(m,n+1):
        if(isPrimt(i)):
            res+=i
            print(i)
    print(res)
primeonlyxum()