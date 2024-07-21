'''
Example 1:

Input: num = 26
Output: "1a"
Example 2:

Input: num = -1
Output: "ffffffff"
 '''
num=26
hexp="0123456789abcdef"
ans=""
for i in range(8):
    ans=hexp[num%16]+ans
    num=num//16
print(ans.lstrip("0"))
