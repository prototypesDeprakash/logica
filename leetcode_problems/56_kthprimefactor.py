'''
 K-th Smallest Prime Fraction

 Input: arr = [1,2,3,5], k = 3
Output: [2,5]
Explanation: The fractions to be considered in sorted order are:
1/5, 1/3, 2/5, 1/2, 3/5, and 2/3.
The third fraction is 2/5.
Example 2:

Input: arr = [1,7], k = 1
Output: [1,7]
 

Constraints:

2 <= arr.length <= 1000
1 <= arr[i] <= 3 * 104
arr[0] == 1
arr[i] is a prime number for i > 0.
All the numbers of arr are unique and sorted in strictly increasing order.
1 <= k <= arr.length * (arr.length - 1) / 2
 '''

import heapq

'''n=len(arr)
pq=[]
for i in range(n-1):
    heapq.heappush(pq,(arr[i]/arr[-1],i,n-1))
    while k-1:
      _,i,j=  heapq.heappop(pq)
      if(i<j-1):
         heapq.heappush(pq,(arr[i]/arr[j-1],i,-1))
      k-=1

print(arr[pq[0][1]] ,arr[pq[0][2]])'''
     
heap=[]
arr = [1,2,3,5]
k=3
for i in range(len(arr)):
    for j in range(i+1,len(arr)):
        heapq.heappush(heap,[arr[i]/arr[j],(arr[i],arr[j])])
print(heap)
while(k>1):
    heapq.heappop(heap)  #heap removes and returns the smallest 
    print(heap)
    k-=1
print(heapq.heappop(heap)[1])
    



'''resarr=[]
k = 3
min=0
for i in range(len(arr)):
    for j in range(i+1,len(arr)):
        #print(arr[i],arr[j])
        resarr.append(abs(arr[i]/arr[j]))
resarr.sort()

print(resarr)'''

