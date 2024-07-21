s="abc"
t="abc"
'''for i in range(len(s)):
    first=s[i]
    for j in range(len(t)):
        if first ==t[j]:
            continue
        if(j>=len(t) and first!=t):
            f=1
if(f==1):
    print("flase")
else:
    print("true")

'''
i=0
j=0
while(i<len(s) and j<len(t)):
    if(s[i]==t[j]):
        i+=1
    j=+1

if(i==len(s)):
    print("true")
else:
    print("false")