nums=[9,8,7,6,5,4,3,2,1]

for i in range(1,len(nums)):
    
    j=i
    while(nums[j-1]>nums[j] and j>0):
        nums[j-1],nums[j]=nums[j],nums[j-1]
        j-=1
print(nums)