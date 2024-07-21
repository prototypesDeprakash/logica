'''
Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".'''
num = "000078668"
'''temp=[0]*10
x=""
for i in num:
    temp[int(i)]+=1
for i in num:
    if(i*3 in num and temp[int(i)]>=3 ):

        x+=i
print(x)

'''
maxy=0
cout=0
prev="x"
for i in num:
    if(i==prev):
        cout+=1
    else:
        cout=1
    if(cout==3) :
       maxy=max(int(i),maxy)
    prev=i
print(str(maxy)*3)
print(max("1","7"))
