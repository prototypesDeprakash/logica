

class Employee:
    num_of_employee=0
    Raise_amount=1.4

    def __init__(self,first,last,pay):
        self.first=first
        self.last=last
        self.pay=pay
        self.email=first+"."+last+"@gmail.com"
        Employee.num_of_employee+=1

    def fullname(self):
        return '{} {}'.format(self.first,self.last)
    
    def apply_raise(self):
        self.pay=int(self.pay*self.Raise_amount)
    
class Developer(Employee):
    Raise_amount=1.1
    def __init__(self,first,last,pay,prog_lang):
        #the employees init method handles fn ln and pay
        super().__init__(first,last,pay)
        # Employee.__init__(self,first,last,pay)  both of these methods work
        self.prog_lang=prog_lang


        

dev1=Developer('Prakash','raj',50000,'java')

dev2=Developer('test','developer',50000,'Python')

print(dev1.prog_lang)