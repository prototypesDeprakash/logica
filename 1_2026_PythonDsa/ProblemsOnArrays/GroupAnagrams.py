from collections import Counter
strs = ["eat","tea","tan","ate","nat","bat"]
'''
res=[]
for i in range(0,len(strs)):

    map1=Counter(strs[i])
    print(map1)
    curls=[]
    for j in range(i,len(strs)):
        if(map1==Counter(strs[j])):
            if(strs[j] not in curls):
                curls.append(strs[j])
    if(curls not in res):
        res.append(curls)
print(res)

'''
def getFrequency(s):
    freq=[0]*26
    for c in s:
        freq[ord(c)-ord("a")]+=1
    res=""
    for i in range(26):
        if freq[i] > 0:
            res += chr(ord('a') + i)
            res += str(freq[i])
    return res
mymap={}
for s in strs:
    key=getFrequency(s)
    if key in mymap:
        mymap[key].append(s)
    else:
        mymap[key]=[s]
print(mymap)



#mythought
mymap={}
for s in strs:
  
    x=Counter(s)
    key = tuple(sorted(x.items()))
    
    if key in mymap:
        mymap[key].append(s)
    else:
        mymap[key]=[s]
print(mymap.values())
