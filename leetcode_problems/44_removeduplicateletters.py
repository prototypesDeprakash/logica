'''Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is 
the smallest in lexicographical order
 among all possible results.

Example 1:

Input: s = "bcabc"
Output: "abc"
Example 2:

Input: s = "cbacdcbc"
Output: "acdb"
 '''
s = "cbacdcbc"

s1=""

for i in s:
    if(i not in s1):
        s1+=i
print(s1)       
    
        

    

