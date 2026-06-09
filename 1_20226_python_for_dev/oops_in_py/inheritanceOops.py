

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

class Manager(Employee):
    def __init__(self, first, last, pay,employees=None):
        super().__init__(first, last, pay)
        if(employees is None):
            self.employees=[]
        else:
            self.employees = employees
    def add_emp(self, emp):
        if emp  not in self.employees:
            self.employees.append(emp)
    def add_remove_emp(self,emp):
        if(emp in self.employees):
            self.employees.remove(emp)
    def print_employees(self):
        for employee in self.employees:
            print('---> ',employee.fullname())

dev1=Developer('Prakash','raj',50000,'java')

dev2=Developer('test','developer',50000,'Python')

mgr_1=Manager('sue','Heck',90000,[dev1])
print(mgr_1.email)
mgr_1.add_emp(dev2)
print(mgr_1.print_employees())

print(isinstance(mgr_1,Manager))
print(isinstance(mgr_1,Employee))
print(isinstance(mgr_1,Developer))
print(issubclass(Manager,Employee))
print(issubclass(Manager,Developer))


