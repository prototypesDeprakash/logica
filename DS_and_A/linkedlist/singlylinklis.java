public class singlylinklis {
private Listnode head;
private static class Listnode{
int data;
private Listnode next;
public Listnode(int data){
    this.data=data;
    this.next=null  ;
}
}
public void insertbeg(int n){
Listnode newnode = new Listnode(n);
newnode.next=head;
head=newnode;
}

public static void main(String[] args) {
    singlylinklis sll = new singlylinklis();
    sll.head=new Listnode(10);
    Listnode secondn = new Listnode(20);
    Listnode thirdlist = new Listnode(30);
    sll.head.next=secondn;
    secondn.next=thirdlist;

    Listnode current =sll.head;
    sll.insertbeg(300);
    while (current!=null) {
        System.out.println(current.data);
        current=current.next;
    }
}
}
