def maxproduct(arr):
    maxsum=arr[0]
    minsum=arr[0]
    res=arr[0]
    for i in range(1,len(arr)):
        if(arr[i]<0):
            maxsum,minsum=minsum,maxsum
        maxsum=max(arr[i],arr[i]*maxsum)
        minsum=min(arr[i],arr[i]*minsum)
        res=max(res,maxsum)
    return res
print(maxproduct([2,3,-2,4]))
