class node:
    def __init__(self,value):
        self.value=value
        self.next=None
class LinkedList:
    def __init__(self,value):
        new_node=node(value)
        self.head=new_node
        self.tail=new_node
        self.length=1
    def append(self,value):
        new_node=node(value)
        if(self.head is None):
            self.head=new_node
            self.tail=new_node
        else:
            self.tail.next=new_node
            self.tail=new_node
        self.length+=1
    def popedn(self):
        temp=self.head
        rev=self.head
        while(temp.next is not None):
            rev=555
            temp=temp.next
        self.tail=rev
        self.tail.next=None
        self.length-=1
    def prepend(self,value):
        new_node=node(value)
        if(self.length==0):
            self.head=new_node
            self.tail=new_node
        else:
            new_node.next=self.head
            self.head=new_node
        self.length+=1
    def pop_first(self):
        if (self.length==0):
            return None
        else:
            temp =self.head
            self.head=self.head.next
            temp.next=None
            self.length-=1
            if self.length==0:
                self.tail=None
    def printList(self):
        temp=self.head
        while(temp is not None):
            print(temp.value)
            temp=temp.next
myll = LinkedList(4)
myll.append(5)
myll.append(9)
myll.prepend(1)
myll.prepend(2)
myll.append(10)
myll.pop_first()
myll.printList()        