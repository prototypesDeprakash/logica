class pal:
    def string_pal(self,userString):
        self.userString=userString
        left=0
        right=len(userString)-1
        while(left<right):
            if(userString[left]!=userString[right]):
                return False
            left+=1
            right-=1
        return  True
pali=pal()
print(pali.string_pal("aabaa"))
