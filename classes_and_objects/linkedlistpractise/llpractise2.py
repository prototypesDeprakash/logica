class node:
    def __init__(self,value):
        self.value= value
        self.next= None

class LinkedList:
    def __init__(self,value):
        new_node = node(value)
        self.head=new_node
        self.tail=new_node
        self.length=1
        
    def append(self,value):
        new_node = node(value)
        if self.head is None:
            self.head=new_node
            self.tail = new_node
        else:
            self.tail.next=new_node
            self.tail=new_node
        self.length+=1

    def popp(self):
        if self.length==1:
            print("Cannot pop , length is 1")
        pre = self.head
        temp=self.head
        while(temp.next is not None):
            pre=temp
            temp=temp.next
        self.tail=pre
        self.tail.next=None
        
    def printlist(self):
        temp = self.head
        while temp is not None:
            print(temp.value)
            temp=temp.next

myll= LinkedList(90)
myll.append(10)
myll.append(42)
myll.append(12)
myll.append(47)
myll.append(78)
myll.append(69)

myll.popp()


myll.printlist()