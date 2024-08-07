
package manipulatingnodes;

public class singlylinkedlist2 {
    private static Listnode head;
    public static class Listnode {
        int data;
        Listnode next;
        public Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertbegining(int n){
        Listnode newnode = new Listnode(n);
        if(head==null){
            head=newnode;
        }
       
        newnode.next=head;
        head=newnode;
    }
    public void insertend(int n){
        Listnode current=head ;
        while (current.next!=null) {
            current=current.next;
        }
        Listnode newnode = new Listnode(n);
        current.next=newnode;
        newnode.next=null;
    }

    public void deletefirstnode(){
       Listnode temp = head;
       head=head.next;
       temp.next=null;
    }
    public void deleteLastnode(){
        Listnode current=head ;
        Listnode previous=null;
        while (current.next!=null) {
            previous=current;
            current=current.next;
        }
        previous.next=null;

    }

    public static void main(String[] args) {
        singlylinkedlist2 sll2 = new singlylinkedlist2();
        sll2.head = new Listnode(10);
        Listnode secondnode = new Listnode(20);
        Listnode thirdnode = new Listnode(30);
        Listnode fourthnode = new Listnode(40);

        sll2.head.next=secondnode;
        secondnode.next=thirdnode;
        thirdnode.next=fourthnode;
        sll2.insertbegining(200);
        sll2.insertbegining(400);
        sll2.insertend(999);
        sll2.insertend(1000);
        sll2.deletefirstnode();
        sll2.deletefirstnode();
        sll2.deleteLastnode();
        sll2.deleteLastnode();
        Listnode current=head;
        while (current!=null) {
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.print("null");

    }
}
