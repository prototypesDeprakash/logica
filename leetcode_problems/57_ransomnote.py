


'''print(len(x))
for i in x:
    if(i in y):
        y.replace(i,str(0))
print(y)'''
'''dic={}
dic2={}
for i in x:
    dic[i] = x.count(i)
for i in y:
    dic2[i]=y.count(i)
for key,value in dic.items():
    if((key in dic2 )and (int(dic[key])<=int(dic2[key]))):
            print("true")
            exit()
print("false")
'''




ransomNote = "aa"
magazine = "ab"
a=[0]*26
for c in magazine:
    i=ord(c)-ord('a')
    a[i]+=1
for c in ransomNote:
    i=ord(c)-ord('a')
    if(a[i]==0):
        print("false")
        exit()
    else:
        a[i]-=1
print("true")
