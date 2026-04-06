

def climbingstairs(n):
    if n==0 or n==1:
        return 1
    return climbingstairs(n-1) +climbingstairs(n-2)

print(climbingstairs(3))