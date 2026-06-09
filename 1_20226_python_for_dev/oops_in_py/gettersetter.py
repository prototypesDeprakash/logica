#oops in python

class Employee:
    
    def __init__(self,first,last):  #constructor
        self.first=first
        self.last=last
        
    @property #getter
    def email(self):
        return '{}{}@gmail.com'.format(self.first,self.last)
    
    @property
    def displayFullname(self):
        return '{} {}'.format(self.first,self.last)
    
    @displayFullname.setter
    def displayFullname(self,name):
        self.first,self.last = name.split(' ')




emp1=Employee("Praksh","Perumal")
emp2=Employee("test","user")


emp1.displayFullname='corey shafer'
print(emp1.email)
print(emp2.email)
