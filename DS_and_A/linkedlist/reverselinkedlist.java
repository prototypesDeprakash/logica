public class reverselinkedlist {
    private Listnode head;
    private static class Listnode{
        int data;
       private Listnode next;
        public Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void main(String[] args) {
        reverselinkedlist rll = new reverselinkedlist();
        rll.head = new Listnode(10);
        Listnode secnode = new Listnode(20);
        Listnode thirdnode = new Listnode(30);
        rll.head.next= secnode;
        secnode.next=thirdnode;
        
        

        Listnode previous = null;
        Listnode curr = rll.head;
        Listnode nexttemp;
        while (curr!=null) {
            nexttemp=curr.next;
            curr.next=previous;
            previous=curr;
            curr= nexttemp;
            

        }
      


       
    }
}
