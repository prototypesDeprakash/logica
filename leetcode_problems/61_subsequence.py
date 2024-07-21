'''Input: s = "abc", t = "ahbgdc"'''
s = "abc"
t = "ahbgdc"
for i in range(len(s)):
    for j in range(len(t)):
        print(s[i],t[j])
