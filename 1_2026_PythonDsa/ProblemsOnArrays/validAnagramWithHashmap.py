from collections import Counter
s = "rat"
t = "car"

map1 = Counter(s)

for i in t:
    map1[i]-=1

print(map1)

for i in map1:
    if(map1.get(i)!=0):
        print(False)
print(True)