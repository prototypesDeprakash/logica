nums=[-1,-1,2,3,-2]
nums.sort()
res=[]


for i in range(len(nums)):
    if(i>0 and nums[i]==nums[i-1]): #new logic 
        continue
    l,r=i+1,len(nums)-1
    while l<r:
        threesum=nums[i]+nums[l]+nums[r]
        if(threesum>0):
            r-=1
        elif(threesum<0):
            l+=1
        else:
            res.append([nums[i],nums[l],nums[r]])
            l+=1
            while(nums[l]==nums[l-1] and l<r):
                l+=1
print(res)
        

  


    

