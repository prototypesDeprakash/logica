#creating a node class
class node:
    def __init__(self,value):
        self.value=value
        self.next=None

#creating linked list and inserting a single value in it
class LinkedList:
    def __init__(self,value):
        new_node = node(value)
        self.head =new_node
        self.tail=new_node
        self.length=1
    def printlist(self):
        temp = self.head
        while temp is not None:
            print(temp.value)
            temp=temp.next
    def append(self,value):
        new_node=node(value)
        if self.head is None:
            self.head=new_node
            self.tail=new_node
        else:
            self.tail.next=new_node
            self.tail=new_node
        self.length+=1
        return True


myll = LinkedList(4)
myll.append(5)
myll.append(10)
myll.printlist()
#print((myll.head.value))