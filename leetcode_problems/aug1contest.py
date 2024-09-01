#chess board color 
color1 =""
color2=""
odd=['a','c','e','g']
even =['b','d','f','h']
coordinate1="a1"
coordinate2="c3"
if(coordinate1[0] in odd  and int(coordinate1[1])%2!=0 ):
        color1="b"
else:
        color1="w"
if(coordinate2[0] in even and int(coordinate2[1]) %2==0):
        color2="b"
else:
        color2="w"
if(color1==color2):
        print(True)
else:
        print(False)
print(color1)
print(color2)

k=[-1,3]  
print(abs(k[0]))
