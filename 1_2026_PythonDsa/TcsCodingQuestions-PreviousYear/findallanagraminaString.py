s = "abab"
p = "ab"


k=len(p)
count1 =[0]* 26
count2= [0]* 26
res=[]

for c in p:
    count1[ord(c)-97]+=1

for i in range(0,len(s)):
    count2[ord(s[i])-97]+=1
    if(i>=k):
        count2[ord(s[i-k])-97]-=1
    if(count1==count2):
        res.append(i-k+1)
print(res)
