nums=[1,1,4,5,6,6,5,5,5,5,6]
n=len(nums)
for i in range(0,len(nums)):
    count=0
    for j in range(0,len(nums)):
        if(nums[i]==nums[j]):
            count+=1
    if(count>(n//2)):
        print(nums[i])
        break
    else:
        print("nothing big")
