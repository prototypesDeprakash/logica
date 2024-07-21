'''
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.'''
s = "abcabcbb"
charset=set()
l=0
res=0
for r in range(len(s)):
    while s[r] in charset:
        charset.remove(s[r])
        l+=1
    charset.add(s[r])
    res=max(res,r-l+1)
print(res)