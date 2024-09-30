package linkedlist.myllag;


public class llpract {
    private static  Listnode2 head;
    private static class Listnode2 {
    int data;
    Listnode2 next;
    private Listnode2(int data) {
        this.data=data;
        this.next=null;
    }        
    }

    private static void display(){
        Listnode2 current =head ;
        while (current!=null) {
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.print("Null");

    }

    //insert data;
    private  void Insertbeg(int data){
        
        Listnode2 newnode = new Listnode2(data);
        if(head==null){
            head=newnode;
        }
        newnode.next=head;
        head=newnode;
    }
    private void InsertEnd(int data){
        Listnode2 newnode= new Listnode2(data);
        Listnode2 current = head;
        if(head==null){
            head=newnode;
        }
        while (current.next!=null) {
            current=current.next;
        }
        current.next=newnode;
    }

    private void InsertAtagivenpoint(int data , int pos){
        Listnode2 newnode = new Listnode2(data);
        Listnode2 current  = head;
        Listnode2 prev =current ;
        int c =0;
        if(head==null){
            head=newnode;
        }
        while (c!=pos) {
            prev=current;
            current=current.next;
            ;
            c++;

        }
        prev.next=newnode;
        newnode.next=current;
        
    }


    public static void main(String[] args) {
        llpract mylink = new llpract();
         head = new Listnode2(0);
         Listnode2 sec = new Listnode2(1);
         Listnode2 thir = new Listnode2(2);
         Listnode2 four = new Listnode2(3);
         head.next = sec;
         sec.next=thir;
         thir.next=four;

         mylink.Insertbeg(999);
         mylink.Insertbeg(1000);
         mylink.InsertEnd(8);
         mylink.InsertEnd(99);
         mylink.InsertAtagivenpoint(777, 8);

        display();
    }


}
