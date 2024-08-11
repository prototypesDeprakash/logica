package basic_insertionanddelete;
//removing duplicates from a sorted linked list 
public class removedup {
    private static Listnode head;
    public  static class Listnode{
        int data ;
        Listnode next;
        private Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
public void removeduplicate(){
    Listnode current=head;
    while (current.next!=null && current!=null) {
        if(current.data==current.next.data){
            current.next=current.next.next;

        }
        else{
            current=current.next;
        }
    }
}
public void insertbeg(int data){
Listnode newnode = new Listnode(data);
if(head==null){
    head=newnode;

}
newnode.next=head;
head=newnode;
}
    public void display(){
        Listnode current = head;
        while (current!=null) {
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
    removedup sll = new removedup();
    sll.head=new Listnode(1);
    Listnode secnode = new Listnode(1);
    Listnode thListnode = new Listnode(2);
    Listnode fourthnode =new Listnode(3);
    Listnode fivenode = new Listnode(3);
    sll.head.next=secnode;
    secnode.next=thListnode;
    thListnode.next=fourthnode;
    fourthnode.next=fivenode;
    //inserting a node
    sll.insertbeg(1);
    sll.insertbeg(99);
    sll.insertbeg(99);
    //remove duplicates
   sll.removeduplicate();
    //displaying data
    sll.display();

    }
}
