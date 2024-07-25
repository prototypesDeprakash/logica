public class Singlylinkedlist3 {
    
    private static class Listnode{
        int data;
        Listnode next;
        public Listnode(int data){
            this.data=data;
            this.next=null;
        }

    }

    private Listnode head;

    public static void main(String[] args) {
        Singlylinkedlist3 ssl3 = new Singlylinkedlist3();
        ssl3.head= new Listnode(10);
        Listnode second = new Listnode(20);
        Listnode third = new Listnode(30);
        ssl3.head.next= second;
        second.next=third;
        Listnode current=ssl3.head;
        while (current!=null) {
            System.out.println(current.data);
            current=current.next;
        }
    }
}
