class Node:
    def __init__(self,value):
        self.value=value
        self.next=None
class LinkedList:
    def __init__(self,value):
        new_node=Node(value)
        self.head=new_node
        self.tail=new_node
        self.length=1
    def append(self,value):
        new_node=Node(value)
        if(self.head is None):
            self.head=new_node
            self.tail=new_node
        else:
            self.tail.next=new_node
            self.tail=new_node
        self.length+=1
    def popend(self):
        temp = self.head
        prev=self.head
        while(temp.next is not None):
            prev=temp
            temp=temp.next
        self.tail=prev
        self.tail.next=None
        self.length-=1
    def prepend(self,value):
        new_node=Node(value)
        if(self.length==0):
            self.head=new_node
            self.tail=new_node
        else:
            new_node.next=self.head
            self.head=new_node
        self.length+=1
    def pop_first(self):
        if(self.length==1):
            return False
        else:
            temp=self.head
            self.head=self.head.next
            temp.next=None
            self.length-=1
    def printlist(self):
        temp = self.head
        while(temp is not None):
            print(temp.value)
            temp=temp.next
            

myll= LinkedList(4)
myll.append(5)
myll.append(10)
myll.popend()
myll.prepend(1)
myll.prepend(2)
myll.pop_first()
myll.printlist()