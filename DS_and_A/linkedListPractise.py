class node:
    def __init__(self,data):
        self.data=data
        self.next= None
        print("node created")
class linkedlist:
    def __init__(self):
        self.head=None
        print("head set to null")
    def append(self,data):
        newnode = node(data)
        if(self.head is None):
            self.head=newnode
            return
        nextnode=self.head
        while nextnode.next:
            nextnode=nextnode.next
        nextnode.next=newnode
    def print_list(self):
        x=0
        current_node = self.head
        while current_node:
            x+=current_node.data
            print(current_node.data, end=" ")
            current_node = current_node.next
        print()
        print(x)
       
ll = linkedlist()
    # Append some elements to the linked list

ll.append(1)
ll.append(2)
ll.append(3)
ll.append(4)
ll.append(5)
ll.append(6)
ll.append(7)
ll.append(8)
ll.append(9)
ll.append(10)
ll.append(11)
ll.append(12)
ll.append(13)
ll.append(14)

print("1 2 3 4 5 6 7 8 9 10 11 12 13 14 ")
ll.print_list()