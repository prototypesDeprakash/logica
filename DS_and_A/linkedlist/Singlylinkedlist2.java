public class Singlylinkedlist2 {
    private static class Listnode {
        private int data;
        private Listnode next;

        public Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void insertFront(int n){
        Listnode newnode = new Listnode(n);
        if(head==null){
            head = newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void insertlast(int n){
        Listnode newnode = new Listnode(n);
        if(head==null)
        {
            head=newnode;
            return;
        }
        Listnode current = head;
        while (current.next!=null) {
            current=current.next;
        }
        current.next=newnode;
    
    }

    public void displayList(){
        int count=0;
        Listnode current = head;
        while (current!=null) {
            System.out.print(current.data+" -->");
            current=current.next;
            count++;
        }
        System.out.print("null");  
        System.out.println("\nsize = "+count); 
    }
    private Listnode head;

    public static void main(String[] args) {
        Singlylinkedlist2 sll2 = new Singlylinkedlist2();
        //  sll2.head = new Listnode(10);
        //  Listnode secondnode = new Listnode(20);
        // Listnode third = new Listnode(30);
        //  sll2.head.next=secondnode;
        // secondnode.next= third;
        // sll2.insertFront(1);
        // sll2.insertFront(2);
        // sll2.insertFront(3);
        // sll2.insertFront(4);
        // sll2.insertFront(5);
        sll2.insertlast(99);
        sll2.insertlast(100);
        
        sll2.displayList();
        
        

    }
}
