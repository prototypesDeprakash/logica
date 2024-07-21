'''
For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is 
concatenated with itself one or more times).
Given two strings str1 and str2, return the largest string x such that x divides both 
str1 and str2.
Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:
Input: str1 = "LEET", str2 = "CODE"
Output: ""
Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.'''

str1 = "ABABAB"
str2 = "ABAB"
'''res=[]
finalres=[]
# Output: "AB"
if(len(str1)<len(str2)):
    minstr=str1
    maxstr=str2
else:
    minstr=str2
    maxstr=str1
for i in minstr:
    if(i in maxstr):
        res.append(i)

for i in res:
    if(i not in finalres):
        finalres.append(i)
x = ''.join(finalres)
print(x)
'''
import math
x= math.gcd(len(str1),len(str2))
if(str1+str2 != str2+str1):
    print("")
else:
    print((str1[:x]))



    

