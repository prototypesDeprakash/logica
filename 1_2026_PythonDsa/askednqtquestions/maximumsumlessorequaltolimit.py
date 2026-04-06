n=int(input())
arr=list(map(int,input().split()))
k=int(input())

maxsum=arr[0]

def allsubset(i, arr,path,k):
    global maxsum
    if(i==len(arr)):
        if(sum(path)<=k):
            maxsum=max(maxsum,sum(path))
        return

    allsubset(i+1,arr,path+[arr[i]],k)
    allsubset(i+1,arr,path,k)
allsubset(0,arr,[],k)
print(maxsum)