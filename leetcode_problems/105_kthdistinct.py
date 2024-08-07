from typing import List
class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        def strcount(n):
            c=0
            for i in arr:
                if(i==n):
                    c+=1
            return c


        dist=[]
        for i in arr:
            if(strcount(i)==1):
                dist.append(i)
        print(dist)
        return dist[k-1] 
solution  =Solution()
arr = ["d","b","c","b","c","a"]

k = 2 
result= solution.kthDistinct(arr,k)

print(result)
        