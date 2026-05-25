#oops in python

class Employee:
    
    def __init__(self,first,last,pay):  #constructor
        self.first=first
        self.last=last
        self.pay=pay
        self.email=first+'.'+last+'@gmail.com'
    def displayFullname(self):
        return '{} {}'.format(self.first,self.last)



emp1=Employee("Praksh","Perumal",52000)
emp2=Employee("test","user",40000)



print(emp1.email)
print(emp2.email)
print(emp1.displayFullname())