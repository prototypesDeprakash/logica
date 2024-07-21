nums = [0,4,3,0,4]
nums.sort(reverse=True)
cout=0
for i in range(0,len(nums)):
    
    if(nums[i]>=cout):
        cout+=1
        if(cout>nums[i]):
            print(-1)
            exit

    else:
       print(cout)
       break
