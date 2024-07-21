'''
Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
'''
# nums1=[4,9,5]
# nums2=[9,4,9,8,4]
# ans=[]
# for i in range(0,len(nums1)):
#     if(nums1[i] in nums2):
#         ans.append(nums1[i])
# ans=set(ans)
# ans=list(ans)
# ans.sort()
# print(ans)
'''algorithm 2 '''
hashset=set()
nums1 = [1,2,2,1]
for i in range(0,len(nums1)):
    hashset.add(nums1[i])
print(hashset)
