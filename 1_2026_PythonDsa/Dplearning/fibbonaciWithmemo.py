
def fibbo(n,memo={}):
    if(n<=1):
        return 1
    if(n in memo):
        return memo[n]
    state = fibbo(n-1,memo)+ fibbo(n-2,memo)
    memo[n] = state
    return state
print(fibbo(44))