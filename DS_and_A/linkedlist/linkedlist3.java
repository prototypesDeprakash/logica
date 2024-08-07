public class linkedlist3 {
    private  static Listnode head;
    public static class Listnode{
        int data;
        Listnode next;
        public Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void Insertnode(int n){
        
        Listnode newlistnode = new Listnode(n);
        newlistnode.next=head;
        head=newlistnode;
    }

    public static void main(String[] args) {
        linkedlist3 ll3 = new linkedlist3();
        ll3.head= new Listnode(10);
        Listnode second = new Listnode(20);
        Listnode third = new Listnode(30);

        ll3.head.next=second;
        second.next=third;
        Insertnode(333);
        Insertnode(333);
        Insertnode(333);
        Insertnode(333);
        Listnode current= ll3.head;
        
        while (current!=null) {
            System.out.println(current.data);
            current=current.next;
        }
        
    }
}

