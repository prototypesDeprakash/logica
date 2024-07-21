'''Example 1:

Input: s = "1001101"

Output: 4

Explanation:

We can perform the following operations:

Choose index i = 0. The resulting string is s = "0011101".
Choose index i = 4. The resulting string is s = "0011011".
Choose index i = 3. The resulting string is s = "0010111".
Choose index i = 2. The resulting string is s = "0001111".'''

s = "11110000"
s=[x for x in s]
i=0
j=len(s)
c=1
while(i<j):
    if(s[j=='1']):
        j-=1
    if(s[i]=='1' and s[j]=='0'):
        s[i],s[j]=s[j],s[i]
        c+=1
        i+=1

print(c)
