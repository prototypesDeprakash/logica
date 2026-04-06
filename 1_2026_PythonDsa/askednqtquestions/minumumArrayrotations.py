arr1 = [1,2,3,4,5]
arr2 = [3,4,5,1,2]

def leftrotation(arr, k):
    n = len(arr)
    k = k % n
    arr = arr[:]  # copy to avoid modifying original
    arr[:k] = reversed(arr[:k])
    arr[k:] = reversed(arr[k:])
    arr[:] = reversed(arr)
    return arr

def rightrotation(arr, k):
    n = len(arr)
    k = k % n
    arr = arr[:]  # copy
    arr[:] = reversed(arr)
    arr[:k] = reversed(arr[:k])
    arr[k:] = reversed(arr[k:])
    return arr

n = len(arr1)
leftrot = -1
rightrot = -1

for i in range(n):
    if arr2 == leftrotation(arr1, i):
        leftrot = i
    if arr2 == rightrotation(arr1, i):
        rightrot = i

print(min(leftrot, rightrot))




# temp=arr1+arr1

# n=len(arr1)
# leftrot=-1

# for i in range(0,len(arr2)):
#     if(temp[i:i+n]==arr2):
#         leftrot=i
#         break
# print(min(leftrot,n-leftrot))


