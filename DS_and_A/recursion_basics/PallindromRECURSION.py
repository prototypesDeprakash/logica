def pall(string):
    if(len(string)==0 or len(string)==1):
        return True
    if(string[0]==string[len(string)-1]):
        return pall(string[1:len(string)-1])
    return False
print(pall("momy"))


