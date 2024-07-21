class node:
    def __init__(self,value) :
        self.value=value
        self.next=None
class LinkedList:
    def __init__(self,value):
        new_node= node(value)
        self.head=new_node
        self.tail=new_node
    def append(self,value):
        new_node=node(value)
        if self.head is None: #if there is no previous node
            self.head=new_node
            self.tail=new_node
        else:
            self.tail.next=new_node
            self.tail=new_node
    def printvalue(self):
        temp=self.head
        while temp is not None:
            print(temp.value)
            temp=temp.next
myll= LinkedList(4)
myll.append(10)
myll.printvalue()