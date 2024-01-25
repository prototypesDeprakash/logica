'''
s = "A man, a plan, a canal: Panama"
'''
s = "A man, a plan, a canal: Panama"

l,r=0,len(s)-1
def alnum(c):
    
    return (ord('A')<=ord(c)<=ord('Z') or
            ord('a')<=ord(c)<=ord('z') or
            ord('0')<=ord(c)<=ord('9'))


#ignoring non alphanum

#logic for pallindrom 

while(l<r):
    while(l<r and not alnum(s[l]) ):
        l+=1
    while(r>l and not alnum(s[r])):
        r-=1

    if(s[l].lower()!=s[r].lower()):
        print("False")
        break
    l=l+1
    r=r-1
print("true")

'''
class Solution:
    def alnum(self,c):
    
        return (ord('A')<=ord(c)<=ord('Z') or
                ord('a')<=ord(c)<=ord('z') or
                ord('0')<=ord(c)<=ord('9'))

    def isPalindrome(self, s: str) -> bool:
        l,r=0,len(s)-1
        while(l<r):
            while(l<r and not self.alnum(s[l]) ):
                l+=1
            while(r>l and not self.alnum(s[r])):
                r-=1

            if(s[l].lower()!=s[r].lower()):
                return False
             
            l=l+1
            r=r-1
        return True



        
            
            '''