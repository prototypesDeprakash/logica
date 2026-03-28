arr=[1,2,3,4,5,6]
k=4
k=k%len(arr)
arr[:k]=reversed(arr[:k])
arr[k:]=reversed(arr[k:])
arr[:] = reversed(arr)
print(arr)