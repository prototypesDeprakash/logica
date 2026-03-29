
def print1ton(n):
    if(n==0):
        return
    
    print1ton(n-1)
    print(n)

print1ton(4)

    