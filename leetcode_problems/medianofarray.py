'''
Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
'''
class Solution:
    def findMedianSortedArrays(self, num1: List[int], num2: List[int]) -> float:
        nums=num1+num2
        nums.sort()
        median=0

        siz=len(nums)
        if(siz==2):
            x=nums[0]+nums[1]
            return x/2
        if(siz==1):
            x=nums[0]
            return x
        if(siz%2==0):
            median+=nums[int((siz/2))]+nums[int((siz/2)-1)]
            median=median/2
        else:
            median=nums[int(siz/2)]
        return median

