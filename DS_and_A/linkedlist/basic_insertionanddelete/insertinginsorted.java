package basic_insertionanddelete;

public class insertinginsorted {
    private static Listnode head;
    public static class Listnode{
        int data ;
        Listnode next ;
        private Listnode(int data){
            this.data=data;
            this.next=null;
        }
    } 
    public void insertinsorted(int data){
        Listnode curr =head;
        Listnode temp = null;
        Listnode newnode = new Listnode(data);
        while (curr.next!=null && curr.data<newnode.data) {
            temp=curr;
            curr=curr.next;
        }
        newnode.next=curr;
        temp.next=newnode;
    }

    public static void main(String[] args) {
        insertinginsorted sll =new insertinginsorted();
        sll.head=new Listnode(10);
        Listnode secondnode = new Listnode(20);
        Listnode thirdnode = new Listnode(30);
        sll.head.next=secondnode;
        secondnode.next=thirdnode;

        Listnode curren=head;
        sll.insertinsorted(25);
        sll.insertinsorted(26);
        while (curren!=null) {
            System.out.print(curren.data+" --> ");
            curren=curren.next;
        }
        System.out.print("Null");
    
    }
}
