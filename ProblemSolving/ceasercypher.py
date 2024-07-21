'''
Sample Input

11
middle-Outz
2
Sample Output

okffng-Qwvb
'''

st="abcdefghijklmnopqrstuvwxyz"
cyphe=""
k=2
for i in st:
    print(i)
    c=ord(i)+k
    cyphe+=chr(c)

print(cyphe)
