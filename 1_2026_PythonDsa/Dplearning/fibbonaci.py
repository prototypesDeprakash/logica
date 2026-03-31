def fibbo(n,memo={}):
    if(n in memo):
        return memo[n]
    if(n<=2):
        return 1
    memo[n]= fibbo(n-1,memo)+fibbo(n-2,memo)
    return memo[n]

print(fibbo(50))
    