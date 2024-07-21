s="()()[)"
f_count=0
for i in range(0, len(s), 2):
    if i + 1 < len(s):
        if (s[i] =="(" and s[i+1]==(")")):
            print(s[i],s[i+1])

        elif(s[i]=="{" and s[i+1]=="}"):
            print(s[i], s[i + 1])
        elif (s[i] == "[" and s[i + 1] == "]"):
            print(s[i], s[i + 1])


        else:
            print("false")
            print(f_count)
            f_count+=1
    else:
        f_count+=1

if(f_count>0):
    print("final answer = False")
else:
    print("final answer = True")
