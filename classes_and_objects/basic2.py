class Car:
    def __init__(self):
        print("car calss created")
    def names(self,name):
        self.name=name
        print("the car name is "+ name)
car = Car()
car.names("Ferari")
