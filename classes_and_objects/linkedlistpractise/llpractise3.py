class node:
    def __init__(self,value):
        self.value=value
        self.next=None

class LinkedList:
    def __init__(self,value):
        new_node = node(value)
        self.head = new_node
        self.tail=new_node
        self.length=1

    def append(self,value):
        new_node=node(value)
        if self.head is None:
            self.head=new_node
            self.tail=new_node
        else:
            self.tail.next=new_node
            self.tail=new_node
        self.length+=1
    def printList(self):
        temp = self.head
        while temp is not None:
            print(temp.value)
            temp= temp.next
    def poplist(self):
        prev=self.head
        temp=self.head
        while(temp.next):
            prev=temp
            temp=temp.next
        self.tail=prev
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




myll= LinkedList(4)
myll.append(10)
myll.append(44)
myll.poplist()
myll.prepend(1)
myll.prepend(2)
myll.printList()
            