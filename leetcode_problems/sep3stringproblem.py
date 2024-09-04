

#string to num string
numstr=""
for i in s:
    numstr+=str(ord(i)-ord('a')+1)
# by default find the first iteration

#print(numstr)
def sumdig(strs):
    res=0
    for i in strs:
        res+=int(i)
    return res
numint = int(numstr)
for _ in range(k):
    numint=sumdig(str(numint))

print(numint)
