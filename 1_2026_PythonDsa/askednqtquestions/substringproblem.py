def issame(s):
    s1=set()
    for i in s:
        s1.add(i)
    if(len(s1)==1):
        return True
    else:
        return False
    #print(len(s1))



for i in range(0,len(s)-k+1):
    if issame(s[i:i+k]):
        if i>0 and s[i]!=s[i-1]:
            continue
        if i+k < len(s) and s[i] == s[i+k]:
            continue

        print(True)
        break
    else:
        print(False)

    