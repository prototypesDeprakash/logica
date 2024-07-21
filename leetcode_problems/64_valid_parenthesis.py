'''
Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false'''
s = "["
stack=[]
for i in s:
    if(i=="(" or i=="{" or i=="["):
        stack.append(i)
    else:
        if(len(stack)==0):
            print("false")
        c=stack[-1]
        
        if((i=="}" and c=="{") or (i==")" and c=="(") or (i=="]" and c=="[")):
            stack.pop()
        else:
            print("false")
if(len(stack)==0):
    print("true")
else:
    print("false")




        
    '''if((i=="}" or i==")" or i=="]") and len(stack)!=0):
        if(i=="}" and stack[-1]=="{"):
            stack.pop()
        if(i==")" and stack[-1]=="("):
            stack.pop()
        if(i=="]" and stack[-1]=="["):
            stack.pop()
    else:
        stack.append(i)
if(len(stack)==0):
    print("true")
else:
    print("false")


        
       
                
    '''