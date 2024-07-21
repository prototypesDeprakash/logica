
c=4
nums=[i for i in range(1,c)]
mymap={}
for i in range(len(nums)):
    complement=c-nums[i]**2
    if complement in mymap:
        print(True)
        exit()
    mymap[nums[i]]=i
print (False)