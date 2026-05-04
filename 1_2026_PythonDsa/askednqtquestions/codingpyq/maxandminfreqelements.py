arr=[23,45,23,45,23,78,45,67,78,90,67]
hashmap = {}
for i in arr:
    hashmap[i]=hashmap.get(i,0)+1
maxfreq=(max(hashmap.values()))
minfreq = min(hashmap.values())
nod =[]
seen=set()
for i in arr:
    if i not in seen:
        nod.append(i)
        seen.add(i)
min_ele=0
max_ele=0
for i in nod:
    if(hashmap.get(i)==maxfreq):
        max_ele = i
        break
for i in nod:
    if(hashmap.get(i)==minfreq):
        min_ele=i
        break
print(max_ele)
print(min_ele)

