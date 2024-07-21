def rev(string):
    if(string ==""):
        return ""
    return rev(string[1::])+string[0]
print(rev("Hello"))

