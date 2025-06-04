package Leetcode_Ds_from_scratch.linkedlist;
 
    public class SinglyLinkedList {
        Node head = null;

        class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=next;
        }
        
    }
      
        //insert element
        public  void insertAtBegining(int n){
        Node newNode = new Node(n);
             newNode.next=head; // connect new node to current node (THAT IS HEAD)
             head=newNode; // the new node is the new head btw
        }
        //traverse and display the element
         public void traverse(){
            Node currentNode =head;
            
            while (currentNode!= null) {
                System.out.print(currentNode.data+" --> ");
                currentNode=currentNode.next;
        }
        System.out.print("Null");


    }

   
    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.insertAtBegining(10);
        sl.insertAtBegining(20);
        sl.insertAtBegining(30);
        sl.insertAtBegining(40);
        sl.insertAtBegining(50);
        sl.insertAtBegining(60);
        sl.insertAtBegining(70);
        sl.insertAtBegining(80);
        sl.insertAtBegining(90);
        sl.insertAtBegining(100);
        sl.traverse();
        
    }
}
