s="rac  eca .,r"
#ignoring spaces , punctutations and cases
cleaned = ""

for x in s:
    if x.isalnum(): #only consider alphabets , ignore spaces and punctutations
        cleaned += x.lower()


s=cleaned

def isValidParenthesis():
    if(s==s[::-1]):
        return True
    else:
        return False


def isValidParenthesis2():
    i=0;
    while(i<len(s)//2): # only need to compare first half with the second half so len(s)//2
        if(s[i]!=s[len(s)-1-i]):
            return False
        i+=1
    return True

print(isValidParenthesis2())