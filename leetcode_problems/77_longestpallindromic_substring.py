'''
Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
'''
s = "babad"
'''for i in range(0,len(s)):
    for j in range(i,len(s)):
        print(s[j],end="")
    print()'''
res=""
reslen=0

for i in range(len(s)):
    l,r=i,i
    while(l>=0 and r<len(s) and s[l]==s[r]):
        if((r-l+1)>reslen):
            reslen=r-l+1
            res=s[l:r+1]
        l-=1
        r+=1
    #even pall
    l,r=i,i+1
    while(l>=0 and r<len(s) and s[l]==s[r]):
        if((r-l+1)>reslen):
            reslen=r-l+1
            res=s[l:r+1]
        l-=1
        r+=1
print(res)
        