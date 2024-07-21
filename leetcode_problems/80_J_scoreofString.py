s="hello"
l=0
l2=1
res=0
for i in range(len(s)-1):
    res+=abs(ord(s[l])-ord(s[l2]))
    l+=1
    l2+=1
print(res)

