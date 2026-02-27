arr=[1,2,3,4,5,6,7,8,9,10]
n=7

def leftRotatebyOne():
    temp=arr[0]
    for i in range(1,len(arr)):
        arr[i-1]=arr[i]
    arr[len(arr)-1]=temp


actualRotationNeeded = n%len(arr)
for i in range(0,actualRotationNeeded):
    leftRotatebyOne()
print(arr)