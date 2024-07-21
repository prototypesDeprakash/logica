'''
Input: score = [5,4,3,2,1]
Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
Example 2:

Input: score = [10,3,8,9,4]
Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].

'''
score = [10,3,8,9,4]
x=sorted(score,reverse=True)

count={}
for i in range(len(x)):
    if(i==0):
        count[x[i]]="Gold Medal"
    if(i==1):
        count[x[i]]="Silver Medal"
    if(i==2):
        count[x[i]]="Bronze Medal"
    if(i>2):
        count[x[i]]=str(i+1)
res=[]
for i in score:
    res.append(count[i])      
print(res)
    
