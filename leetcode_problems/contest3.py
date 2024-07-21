#special array ||
'''
Example 1:

Input: nums = [3,4,1,2,6], queries = [[0,4]]
Output: [false]
Explanation:
The subarray is [3,4,1,2,6]. 2 and 6 are both even.

Example 2:
Input: nums = [4,3,1,6], queries = [[0,2],[2,3]]
Output: [false,true]
Explanation:
The subarray is [4,3,1]. 3 and 1 are both odd. So the answer to this query is false.
The subarray is [1,6]. There is only one pair: (1,6) and it contains numbers 
with different parity. So the answer to this query is true.'''
'''
 n=len(nums)
        for i  in range(n):
            for j in range(i+1,n):
                #if((nums[i]%2==0 and nums[j]%2==0)) or ((nums[i]%3==0) and (nums[j]%3==0)):
                if (nums[i] % 2 == nums[i + 1] % 2):
                    return False
        return True'''

nums = [4,3,1,6]
parity =[num % 2==0 for num in nums]
print(parity)
queries = [[0,2],[2,3]]
res=[]
x=len(queries)-1
i=0
for i in range(queries[x-1][i],queries[x-1][i]):
    print(nums[i])