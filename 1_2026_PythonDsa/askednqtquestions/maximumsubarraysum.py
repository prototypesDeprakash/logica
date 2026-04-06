# maxnum=float('-inf')

# def allsubarrays(i, arr, path):
#     global maxnum
#     if(i==len(arr)):
#         maxnum=max(maxnum,sum(path))
#         return
#     allsubarrays(i+1,arr,path+[arr[i]])
#     allsubarrays(i+1,arr,path)
# allsubarrays(0,[4,-1,2,1,-5,4],[])
# print(maxnum)

def maximumsubarraysum(arr):
    currentsum=arr[0]
    maxsum=arr[0]
    for i in range(1,len(arr)):
        currentsum=max(arr[i],currentsum+arr[i])
        maxsum=max(maxsum,currentsum)  
    print(maxsum)
maximumsubarraysum([4,-1,2,1,-5,4])