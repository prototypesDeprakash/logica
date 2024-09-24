nums = [3,30,34,5,9]
res=[]
for i in range(0,len(nums)-1):
        if(int(str(nums[i])+str(nums[i+1])) >int(str(nums[i+1]) +str(nums[i]))):
            res.append(int  (str(nums[i]) + str(nums[i+1])))
print(res)


    