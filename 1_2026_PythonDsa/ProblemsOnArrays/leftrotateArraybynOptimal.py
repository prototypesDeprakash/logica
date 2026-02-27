arr=[1,2,3,4,5,6]

k=2
k=k%len(arr)

def rotate(start,end):
    while start< end:
        arr[start],arr[end]=arr[end],arr[start]
        start+=1
        end-=1
rotate(0,k-1)
rotate(k,len(arr)-1)
rotate(0,len(arr)-1)
print(arr)