def checkifvalid(n):
    charactercount = 0
    numericdigit = 0
    capitallettercount = 0
    havespacesorslashes = False
    isstartingwithnumber = False

    if n[0].isdigit():
        isstartingwithnumber = True

    for i in n:
        if i.isalpha():
            charactercount += 1
        if i.isupper():
            capitallettercount += 1
        if i.isdigit():
            numericdigit += 1
        if i == " " or i == "/":
            havespacesorslashes = True

    if (charactercount >= 4 and 
        numericdigit >= 1 and 
        capitallettercount >= 1 and 
        not havespacesorslashes and 
        not isstartingwithnumber):
        
        print("Your Password is Valid")
    else:
        print("Your Password is Invalid")


s = input()
checkifvalid(s)