'''
Return the following:

If version1 < version2, return -1.
If version1 > version2, return 1.
Otherwise, return 0.

Example 1:

Input: version1 = "1.01", version2 = "1.001"
Output: 0
Explanation: Ignoring leading zeroes, both "01" and "001" represent the same integer "1".
Example 2:

Input: version1 = "1.0", version2 = "1.0.0"
Output: 0
Explanation: version1 does not specify revision 2, which means it is treated as "0".
Example 3:

Input: version1 = "0.1", version2 = "1.1"
Output: -1
Explanation: version1's revision 0 is "0", while version2's revision 0 is "1". 0 < 1, so version1 < version2.'''

version1 = "1.0.1"
version2 = "1"
'''x=version1.split(".")
y=version2.split(".")
while(len(x)<len(y)):
    x.append("0")
while(len(y)<len(x)):
    y.append("0")
print(x)
print(y)

for i in range(len(x)):
    if(int(x[i])>int(y[i])):
        print(1)
    elif(int(x[i])<int(y[i])):
        print(-1)
    else:
        print(0)
'''
version1 = "1.0"
version2 = "1.00"

s1 = version1.split(".")
s2 = version2.split(".")

maxlength = max(len(s1), len(s2))

for i in range(0, maxlength):
    if i < len(s1) and i < len(s2):
        if int(s1[i]) > int(s2[i]):
            print(1)
            break
        elif int(s2[i]) > int(s1[i]):
            print(-1)
            break
    elif i < len(s1):
        print(1)
        break
    elif i < len(s2):
        print(-1)
        break
else:
    print(0)
