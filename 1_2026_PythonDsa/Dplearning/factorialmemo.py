def fact(n,memo={}):
    if(n in memo):
        return memo[n]
    if(n==1):
        return 1
    memo[n]= n* fact(n-1,memo)
    return memo[n]
#print(fact(555))

def factnodp(n):
    if(n<=1):
        return 1
    return n*factnodp(n-1)
print(factnodp(555))