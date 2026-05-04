s="aaa"
t="aaaa"
hashmap={}
for i in s:
    hashmap[i]=hashmap.get(i,0)+1
    if(hashmap.get(i)==2):
        hashmap[i]=0
for i in t:
    if(hashmap.get(i)==2):
        hashmap[i]=0
    hashmap[i]=hashmap.get(i,0)+1

for i in hashmap:
    if hashmap[i]==1 :
        print(i)

        break
