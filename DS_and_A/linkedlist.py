#class for creating node
class node:
    def __init__(self,data):
        self.data=data
        self.next = None
        print("node created")
#class for linking nodes
class linkedlist:
    def __init__(self):
        self.head= None
        print("head set to none")
    def append(self,data):
        newnode=node(data)
        
        if(self.head is None):
            self.head=newnode
            print("new node")
            return
        lastnode= self.head
        while lastnode.next:
            lastnode=lastnode.next
        lastnode.next=newnode
        

    def print_list(self):
        current_node = self.head
        while current_node:
            print(current_node.data, end=" ")
            current_node = current_node.next
        print()

    # Create a linked list object
ll = linkedlist()

    # Append some elements to the linked list
ll.append(1)
ll.append(2)
ll.append(3)
ll.append(4)
ll.append(5)
ll.append(6)

    # Print the linked list
ll.print_list()
