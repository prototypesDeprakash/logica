'''
Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.'''
s = "the sky is blue"
s=s.split()
s=s[::-1]
x=""
for i in s:
    x+=i
    x+=" "
x=x[0:len(x)-1]
print(x)
