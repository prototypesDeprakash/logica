arr=[1,2,3,4,5]
k=2
inc=0
while(len(arr)!=1):
    n=len(arr)
    inc=(inc+k-1)%n
    arr.pop(inc)
print(*arr)
 
