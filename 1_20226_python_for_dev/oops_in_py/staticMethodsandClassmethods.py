import datetime

class Employee:
    num_of_employee=0
    Raise_amount=1.04

    # regular method and class takes self as a first argument
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
    
    # def set_raise_amount_inst(self,amount):
    #     Employee.Raise_amount=amount

    # creating class method
    @classmethod
    def set_raise_amount(cls , amount):
        cls.Raise_amount=amount
    
    @classmethod
    def from_string(cls,emp_string):
        first, last,pay=emp_string.split('-')
        return cls(first,last,pay)
    
    #regular method passes self as first argument
    #static method passes nothing as first argument
    #class method passes cls as first argument

    @staticmethod
    def is_work_day(day):
        if(day.weekday()==5 or  day.weekday()==6):
            return False
        return True




emp1_str_1='Prakash-Raj-50000'
emp2_str_2='test-user-10000'
emp3_str_3='john-davis-45000'

new_emp_1=Employee.from_string(emp3_str_3)
print(new_emp_1.__dict__)

mydate=datetime.date(2016,7,10)
print(Employee.is_work_day(mydate))