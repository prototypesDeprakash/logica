arr=[1,2,3,4,5,99,283,430,223,4322]

largest  = max(arr)

seclarg=-1
for i in range(0,len(arr)):
    if arr[i]<largest and arr[i]>seclarg:
        seclarg=arr[i]
print(seclarg)

    

#single pass
first = second = float('-inf')
for i in arr:
    if(i>first):
        second=first
        first=i 
    elif(i>second and i!=first):
        second=i
print(second)

