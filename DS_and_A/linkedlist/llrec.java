public class llrec {
    private static Listnode head;
    private static class Listnode {
        int data;
        Listnode next;

        private Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }

    private static void display(){
        Listnode current =head;
        while (current!=null) {
            System.out.println(current.data);
            current=current.next;
        }

    }

    public static void main(String[] args) {
       // Listnode head = new Listnode(0);
       llrec ll =  new llrec();
       ll.head=new Listnode(0);
       Listnode two = new Listnode(1);
       Listnode three = new Listnode(2);

       head.next=two;
       two.next=three;
       display();





    }
}
