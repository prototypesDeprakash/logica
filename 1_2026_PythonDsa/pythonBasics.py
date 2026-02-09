#Missing Number
num =[3,0, 1]

def sol():
    num.sort()
    for index , actualNumber in enumerate(num):
        if(index!=actualNumber):
            return actualNumber-1
        if(actualNumber==len(num)-1):
            return actualNumber+1


