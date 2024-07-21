map={}
nums = [3,7,11,15,87]
target = 90

for i in range(len(nums)):
    complement=target-nums[i]
    if(complement in map):
        print(map[complement],i)
    map[nums[i]]=i

print(map)
    