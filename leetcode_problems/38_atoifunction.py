#read upto non digit 
#ignore whitespaces 
#include sign if it is read at the begining

a="1337c0d3"
i=0
n=len(a)
result=0
sign=1
max_int = 2147483647
min_int = -2147483648
while i<n and a[i]=='':
    i+=1
if(a[i]=='+'):
    sign=1
    i+=1
elif(i<n and a[i]=='-'):
    sign=-1
    i+=1
while(i<n and a[i].isdigit()):
    if(a[i].isdigit()):
        result=result*10+int(a[i])
    else:
        break
    i+=1
result=result*sign
if(result>max_int):
    print(max_int)
elif(result<min_int):
    print(min_int)
else:
    print(result)

      

x="   "
if(x.strip()==""):
    print("yes")
