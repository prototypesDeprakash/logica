arr=[1,1,2,3,4,5,6,6,7,8,9,9,10]
i=0
j=1
while(j<len(arr)):
    if(arr[i]!=arr[j]):
        i+=1
        arr[i]=arr[j]
    if(arr[i]==arr[j]):
        j+=1
for x in range(0,i+1):
    print(arr[x],end=" ")