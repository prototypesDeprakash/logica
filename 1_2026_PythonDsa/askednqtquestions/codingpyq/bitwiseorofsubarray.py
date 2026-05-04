arr=list(map(int,input().split()))

def orcalc(arr):
    res=0
    for i in arr:
        res|=i
    return res

ans=[]
def allsubarray():
    global ans
    for i in range(0,len(arr)):
        for j in range(i,len(arr)):
            ans.append(orcalc(arr[i:j+1]))
            print(arr[i:j+1])
allsubarray()
print(len(set(ans)))
            
    
    
