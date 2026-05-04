arr=list(map(int,input().split()))
hashmap={}
for i in arr:
    hashmap[i]=hashmap.get(i,0)+1

sorted_hash = sorted(hashmap.items(),key=lambda x:x[1],reverse=True)
print(sorted_hash)

res=[]
for k, v in sorted_hash:
    for i in range(v):
        res.append(k)
print(res)
        
    
