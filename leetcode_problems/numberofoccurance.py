'''
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
'''

arr=[26,2,16,16,5,5,26,2,5,20,20,5,2,20,2,2,20,2,16,20,16,17,16,2,16,20,26,16] 
count=[]
x=set(arr)
x=list(x)
bul=0
for i in range(0,len(x)):
    count.append(arr.count(x[i]))
count.sort()
for i in range(0, len(count)-1):
    
    if(count[i]==count[i+1]):
        bul+=1
      

print(x)
print(count)

print(bul)
if(bul>0):
    print("false")
elif(bul<=0):
    print("true")

