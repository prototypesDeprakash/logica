s = "([]){[]}"

def isValidParenthesis():
    stack=[]
    for x in s:
        if(x=='('  or x=='{' or x=='['): #the parenthesis should start with ( || { || [
            stack.append(x)
        else:
            if(len(stack)==0): 
                return False
            if(x==')' and stack[-1]!='('): # checking if the last element is the correct pair 
                return False
            if(x=='}' and stack[-1]!='{'):
                return False
            if (x==']' and stack[-1]!='['):
                return False
            stack.pop() # if the above conditions fail then it must be correct pair , so pop()
    return len(stack)==0 # if the final stack is empty then we poped all the valid pairs so it returns true/false
print(isValidParenthesis())