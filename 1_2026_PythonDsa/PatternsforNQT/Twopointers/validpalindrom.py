s = "A man, a plan, a canal: Panama"
s=s.lower()
s=s.replace(" ","")
s=s.replace(":","")
s=s.replace(",","")
s=s.replace(".","")
print(s==s[::-1])