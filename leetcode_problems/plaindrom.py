'''
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
'''
x=-121
x=str(x)
y=x[::-1]
print(x)
if(x==y):
    print("true")
else:
    print("false")