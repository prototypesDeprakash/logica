class myclass(object):#class
    def __init__(self,name): #constructor method
        self.name=name
        print("automatically called hello "+self.name)
    def say(self):
        print("manually called hello "+self.name)

obj=myclass("prakash")
obj.say()
        
   
