

arr=[1,2,3,5,6,7,2,1]
def fast_and_slow(arr):
    slow=0
    for fast in range(1,len(arr)):
        if(arr[fast]!=arr[slow]):
            slow+=1
            arr[slow]=arr[fast]
    return slow+1