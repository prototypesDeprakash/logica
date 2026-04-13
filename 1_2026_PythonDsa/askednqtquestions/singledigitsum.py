def digitsum(n):
    res=0
    while n!=0:
        res+=n%10
        n=n//10
    return res


def dotillsingle(num):
    if(num<10):
        return num
    return dotillsingle(digitsum(num))


def is_prime(num):
    if(num<2):
            return False
    for i in range(2,int(num**0.5)+1):
         if(num%i==0):
              return False
    return True

def nthprimeNumber(n):
     count=0
     candidate=1
     while(count<n):
        candidate+=1
        if(is_prime(candidate)):
            count+=1
        
     return candidate

n=int(input())
prime=nthprimeNumber(n)
digit=dotillsingle(prime)


print(prime*digit)


        

    