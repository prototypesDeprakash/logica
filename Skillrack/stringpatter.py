s1="abcacb"
s2="book pen pencil book pencil pen"
s3=""
s2=s2.split()


if(len(s1)!=len(s2)):
    print("No")

s ={}
for i in range(len(s1)):
    s[s1[i]]=s2[i]

print(s)



