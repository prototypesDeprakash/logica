'''

Example 1:

Input: s = "coaching", t = "coding"
Output: 4
Explanation: Append the characters "ding" to the end of s so that s = "coachingding".
Now, t is a subsequence of s ("coachingding").
It can be shown that appending any 3 characters to the end of s will never make t a subsequence.
Example 2:

Input: s = "abcde", t = "a"
Output: 0
Explanation: t is already a subsequence of s ("abcde").'''

s = "coaching"
t = "coding"
l=0
l2=0

       
while(l<len(s) and l2<len(t)):
    if(s[l]==t[l2]):
        l+=1
        l2+=1
    else:
        l+=1

print(s)
print(t)    
print(len(t)-l2)