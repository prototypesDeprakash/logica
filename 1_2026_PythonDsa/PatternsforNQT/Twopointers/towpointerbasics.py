arr=[2,7,11,15]
target=9
cursum=0
left=0
right = len(arr)-1
while(left<right):
    cursum=arr[left]+arr[right]
    if(cursum==target):
        print([left,right])
    if(cursum>target):
        right-=1
    else:
        left+=1



