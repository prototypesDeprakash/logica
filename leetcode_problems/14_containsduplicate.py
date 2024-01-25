'''
Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 
 '''


# time limit exceededddddddddddddddddddddddd
'''flag=0
for i in range(0,len(nums)):
    for j in range(i+1,len(nums)):
        if(nums[i]==nums[j]):
            flag=1
if(flag==0):
    print("flase")
else:
    print("true")'''

#solution accepted , time - 519ms
nums=[1,2,3]
'''nums.sort()
flag=0
for i in range(0,len(nums)-1):
    if(nums[i]==nums[i+1]): 
        flag=1

if(flag==1):
    print("true")
else:
    print("flase")
'''
#optimal 414 ms 
hash=set()
for n in nums:
    if(n in hash):
        print("True")
    hash.add(n)
print("flalse")