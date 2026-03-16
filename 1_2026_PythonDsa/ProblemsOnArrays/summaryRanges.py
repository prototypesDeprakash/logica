arr=[0,1,2,4,5,7]

finres=[]
start=0
end=0
i=0
while i<len(arr):
    start =arr[i]
    #end=start
    while(i<len(arr)-1 and arr[i+1]==arr[i]+1):
        end=arr[i+1]
        i+=1

    if(start == end):
        finres.append(f"{start}")
    else:
        finres.append(f"{start}->{end}")
    i+=1
print(finres)