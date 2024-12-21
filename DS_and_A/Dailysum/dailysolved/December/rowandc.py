a=[[1,2,3],[3,2,1],[2,3,1]]
n=len(a[0])

def sol1(ab):
    for i in ab:
        for x in range (1,n+1):
            if x not in i:
                return False
    return True
print(sol1(a))