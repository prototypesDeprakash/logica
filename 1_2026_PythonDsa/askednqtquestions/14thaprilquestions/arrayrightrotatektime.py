arr=list(map(int,input().split()))
# k=4
element = int(input())

# n=len(arr)
# k=k%n
# arr[:]=reversed(arr)
# arr[:k]=reversed(arr[:k])
# arr[k:]=reversed(arr[k:])

# print(arr)

#arr=arr[-k:]+arr[:-k]


def rotatektime(arr,k):
    n=len(arr)
    k=k%n
    
    arr[:k]=reversed(arr[:k])
    arr[k:]=reversed(arr[k:])
    arr[:]=reversed(arr)



startingposition = min(arr)
number_of_rotations = arr.index(startingposition)
print(number_of_rotations)
rotatektime(arr,number_of_rotations)
#print(arr)
if(element in arr):
    print(arr.index(element))
else:
    print(-1)


