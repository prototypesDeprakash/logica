'''
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.'''

s = "A man, a plan, a canal: Panama"
temp=""
for i in s :
    if(i.isalpha()):
        temp+=i.lower()

if(temp==temp[::-1]):
    print("it is a pallindrom")
else:
    print(temp,"is not a pallindrom")
    
