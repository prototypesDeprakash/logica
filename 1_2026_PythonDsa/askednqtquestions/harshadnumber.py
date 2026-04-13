n=int(input())
def sumofdigit(n):
    res=0
    while(n!=0):
        temp=n%10
        res+=temp
        n=n//10
    return res
print(n%sumofdigit(n)==0)

# first 10 multiples of 3

res= sum([i*10 for i in range(0,n+1)])
print(res)