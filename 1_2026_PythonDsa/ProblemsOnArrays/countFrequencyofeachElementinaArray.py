from collections import Counter
arr=[1,2,3,4,3,2,1,5,4,4,2,2,1,2]
hashmap={}
print(type(hashmap))
x=0
for i in arr:
    
    hashmap[i]=hashmap.get(i,0)+1
print(hashmap)
print(Counter(arr))

