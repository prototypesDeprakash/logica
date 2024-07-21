'''
Input: nums = [4,1,2,3]
Output: [2,3,4,1]
Explanation: 
First, we sort the values present at odd indices (1 and 3) in non-increasing order.
So, nums changes from [4,1,2,3] to [4,3,2,1].
Next, we sort the values present at even indices (0 and 2) in non-decreasing order.
So, nums changes from [4,1,2,3] to [2,3,4,1].
Thus, the array formed after rearranging the values is [2,3,4,1].
'''
nums=[36,45,32,31,15,41,9,46,36,6,15,16,33,26,27,31,44,34]
#brute force approach complexity is i think o(n)  edit: its o(nlogn)
'''even=[nums[i] for i in range (0,len(nums),2) ]
odd=[nums[i] for i in range(1,len(nums),2)]
even.sort()
odd.sort(reverse=True)
e=0
o=0
for i in range(len(nums)):
    if(i%2==0):
        nums[i]=even[e]
        e+=1
    else:
        nums[i]=odd[o]
        o+=1
print(nums)
'''
#better solution 
#first convert odd positon numers into -ve
