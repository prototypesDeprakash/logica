
nums = [1,2,-1,1,3,1]
res=[]
hashmap={}
for i in nums:
    hashmap[i]=hashmap.get(i,0)+1
for key,val in hashmap.items():
    if(val==1):
        res.append(key)
print(res)
    
