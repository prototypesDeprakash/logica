class pallindrom:
    def isPallindrom(self,number):
        self.number=number
        cop=number
        temp=0
        rev=0
        while(number!=0):
            temp=number%10
            rev=rev*10+temp
            number//=10
        if(rev==cop):
            return True
        return False

pal=pallindrom()

n=int(input("Enter a number: "))
print(pal.isPallindrom(n))