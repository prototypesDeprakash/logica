

class Employee:
    num_of_employee=0
    Raise_amount=1.04

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
emp_1=Employee("Prakash","Perumal",50000)
emp_2=Employee("user","test",8933)
emp_1.apply_raise()
emp_1.Raise_amount=1.5
print(emp_1.__dict__)
print(Employee.num_of_employee)
