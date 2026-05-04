s="aabbcdd"
hashmap={}
for i in s:
    hashmap[i]=hashmap.get(i,0)+1
for i in s:
    if(hashmap.get(i)==1):
        print(i)
        exit()
print(-1)
