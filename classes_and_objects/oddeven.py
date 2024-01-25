class odd_or_even:

    def odd_Or_even(self,number):
        self.number=number
        if(number%2==0):
            return True
        else:
            return False

n=int(input("Enter a number: "))

if(odd_or_even().odd_Or_even(n)):
    print("Even number")
    exit()
print("Odd number")
