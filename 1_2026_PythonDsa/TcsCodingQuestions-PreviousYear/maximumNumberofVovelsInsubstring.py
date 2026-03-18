s = "abciiidef"
k = 3

window=0
vovels={'a','e','i','o','u'}
for i in range(0,k):
    if(s[i]in vovels):
        window+=1
maxsize=window
for i in range(1,len(s)-k):
    if(s[i-1] in vovels):
        window-=1
    if(s[i+k-1] in vovels):
        window+=1
    maxsize=max(maxsize,window)
print(maxsize)

