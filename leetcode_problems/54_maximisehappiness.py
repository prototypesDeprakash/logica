'''
Input: happiness = [1,2,3], k = 2
Output: 4
Explanation: We can pick 2 children in the following way:
- Pick the child with the happiness value == 3. The happiness value of the remaining children 
becomes [0,1].
- Pick the child with the happiness value == 1. The happiness value of the remaining child becomes
 [0]. 
Note that the happiness value cannot become less than 0.
The sum of the happiness values of the selected children is 3 + 1 = 4.'''
'''happiness = [1,1,1,1]
k = 2
happiness.sort()

maxnum=max(happiness)
happiness.pop()
k-=1


for i in range(0,k+1):
    #print(happiness[i])
    if(happiness[i]>=0):
        happiness[i]=happiness[i]-1
        #print(happiness[i])
print(happiness)
print(maxnum+max(happiness))     
'''
happiness = [2,3,4,5]
happiness.sort(reverse=True)
k = 1
ans=0 
dec=0
for i in range(k+1):

    if(happiness[i]-dec<0):
        break
    ans+=happiness[i]-dec
    #print(happiness[i]-dec)
  
    dec+=1
print(ans)
        


#print(happiness)

