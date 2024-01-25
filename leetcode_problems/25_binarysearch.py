nums = [-1,0,3,5,9,12]

target = 13
low=0
high=len(nums)

while (low<high):
    mid=(low+(high-low)//2)
    
    
    if(nums[mid]==target):
        print(mid)
        break
    elif(nums[mid]>target):
        high=mid-1
    else:
        low=mid+1
print(-1)
    



