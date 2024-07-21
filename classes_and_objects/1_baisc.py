# class myclass(object):#class
#     def __init__(self,name): #constructor method
#         self.name=name
#         print("automatically called hello "+self.name)
#     def say(self):
#         print("man1ually called hello "+self.name)
#
# obj=myclass("prakash")
# obj.say()
#
#
#linking list

#this class creates a single node
class node:
    def __init__(self,data):
        self.data=data
        self.next=None

class linkedlist:
    #in the begining there is only one elemnet so the head is linked to none
    def __init__(self):
        self.head=None
    def append(self,data):
        newnode=node(data)
        if self.head == None:
            self.head = newnode
            return
        lastnode=self.head
        while lastnode.next:
            lastnode= lastnode.next
        lastnode.next=newnode