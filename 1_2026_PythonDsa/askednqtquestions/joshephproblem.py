arr=[1,2,3,4,5,6,7]
k=3

inc=k-1

while(len(arr)!=1):
   
    if(inc>=len(arr)):
        inc=inc%len(arr)
    arr.remove(arr[inc])
    inc=inc+(k-1)
print(arr[0])