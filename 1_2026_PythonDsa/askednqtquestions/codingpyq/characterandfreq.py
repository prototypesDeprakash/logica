s=input()
hashmap={}
nodupli=""
seen=set()
for i in s:
    hashmap[i]=hashmap.get(i,0)+1
for i in s:
    if i not in seen:
        nodupli+=i
        seen.add(i)
for i in nodupli:
    print(i+ str(hashmap.get(i)) ,end=" ")
