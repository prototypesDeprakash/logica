'''
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.'''
s = "leetcode"
s_list = [i for i in s]
s.lower
l = 0
r = len(s) - 1

vov = ['a', 'e', 'i', 'o', 'u']

while l < r:
    if s[l] in vov and s[r] in vov:
        # Swap characters at positions l and r
        s_list[l], s_list[r] = s_list[r], s_list[l]
        l += 1
        r -= 1
    elif s[l] in vov and s[r] not in vov:
        r -= 1
    elif s[l] not in vov and s[r] in vov:
        l += 1
    else:
        l += 1
        r -= 1

# Join the list of characters back into a string
s = ''.join(s_list)

print(s)
