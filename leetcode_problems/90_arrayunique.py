
nums = [1,9,8,7,1,2,2,3]
nums.sort()
c=0
for i in range(1,len(nums)):
    if(nums[i-1]>=nums[i]):
        inc=abs(nums[i-1]-nums[i]+1)
        nums[i]+=inc
        c+=inc

           
print(c)

print(nums)
 













'''print(nums)
for  i in range(1,len(nums)):
    
    while(nums[i-1]==nums[i]):
       
        nums[i]+=1
        c+=1
    while(i<len(nums)-1 and nums[i-1]==nums[i+1]):
        nums[i+1]+=1
        c+=1
print(nums)
print(c)'''
        
                
        