'''
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
'''


nums=[0,1,2,2,3,0,4,2]
val=2
count=0

for i in range(len(nums)):
    for j in range(i+1,len(nums)):
        if(nums[i]==val):
            nums[j],nums[i]=nums[i],nums[j]


for i in range(len(nums)):
    if val ==nums[i]:
        count+=1
        nums[i]="_"
k=(len(nums))-count

print(nums)

print(k)

