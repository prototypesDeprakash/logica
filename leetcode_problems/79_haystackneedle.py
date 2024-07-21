haystack ="mississippi"
needle ="issip"

n=0
h=0
hslength=len(haystack)
nedlength=len(needle)
if(hslength<nedlength):
    print(-1)
for h in range(0,hslength):
    if(haystack[h]==needle[n]):
        n+=1
    else:
        h=h-n
        n=0
    if(n==len(needle)):
        print(h-len(needle)+1)
