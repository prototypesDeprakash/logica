arr=[1,2,3]
target=9

def findtarget(i,arr,target):
    if(target==0):
        return True
    if(i ==len(arr)):
        return False
    return findtarget(i+1,arr,target-arr[i]) or findtarget (i+1,arr,target)
print(findtarget(0,arr,target))