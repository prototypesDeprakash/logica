'''Substring Pattern (IMPORTANT)

Problem:
Check if a string contains a substring of length k where:

All characters are same
The character before and after (if exists) are different'''
s = "aaabaaa"
k = 3

#this skipps a edge case
'''for i in range(0,len(s)-k+1):
    if(i>0 and i+k <len(s)):
        if(s[i:i+k]==s[i]*k and s[i-1]!=s[i] and s[i+k]!=s[i] ):
            print(s[i:i+k])

'''

for i in range(0,len(s)-k+1):
    substring=s[i:i+k]

    if substring!=s[i]*k:
        continue
    if i>0 and s[i]==s[i-1]:
        continue

    if i+k<len(s) and s[i]==s[i+k]:
        continue
    print(substring)