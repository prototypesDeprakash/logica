

s = "(u(love)i)"
temp=""
stack=[]
for i in s:
    if(i=='(' or (i!="(" and i!=")") ):
        stack.append(i)
    elif i==')':
        temp=""
        while(stack[-1]!='('):
            temp+=stack[-1]
            stack.pop()
        stack.pop()
        for ch in temp:
            stack.append(ch)
    
print(stack)

