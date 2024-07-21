def dectobin(decimal,result):
    if(decimal==0):
        return result
    result = str(decimal%2)+result
    return dectobin(decimal//2,result)

res=""
decimal=13
x=dectobin(decimal,res)
print(x)