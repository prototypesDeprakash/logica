

/**
 * Singlylinkedlist_1
 */
public class Singlylinkedlist_1 {

    private Listnode head;
     private static class Listnode{
        int data;
        private Listnode next;
        public  Listnode(int data){
            this.data=data;
            this.next=null;
        }

     }
     // insert at end 
     public void insertend(int n ){
      Listnode current = head;
      while (current.next!=null) {
         current=current.next;
      }
      Listnode newnode = new Listnode(n);
      current.next=newnode;
     }
     //inserting node on start

     public void insertbeg(int n){
        
        Listnode element = new Listnode(n);
        element.next=head; //assigning element next to head 
        head = element; //assigning top element as head
        
     }
     //displaying the linked list

     public void display(){
        Listnode current = head;
        while (current!=null) {
            System.out.print(current.data+" ---> ");
            current=current.next;
        }
        System.out.print("null");
        
     }
     //finding the lenght of the linked list

     public void findlength(){
        Listnode current= head;
        int count=0;
        while (current!=null) {
            count++;
            current=current.next;
        }
        System.out.println("\nLinkedList size = "+ count);
        
     }

     public static void main(String[] args) {
        Singlylinkedlist_1 sll = new Singlylinkedlist_1();
        sll.head=new Listnode(10);
        Listnode second = new Listnode(20);
        Listnode third = new Listnode(30);

        sll.head.next=second;
        second.next=third;
        sll.insertbeg(50);
        sll.insertbeg(34);
        sll.insertend(222);
        sll.insertend(123);
        sll.display();
        sll.findlength();
        

     }
}