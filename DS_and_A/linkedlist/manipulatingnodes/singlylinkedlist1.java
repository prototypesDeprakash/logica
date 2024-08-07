package manipulatingnodes;

import java.util.List;

public class singlylinkedlist1 {
    private static class Listnode{ //must be a private static class
        int data;
        Listnode next;
        public  Listnode(int data){ 
            this.data=data;
            this.next=null;
        }


    }
    private static Listnode head;  //head instancs

 //insert at top
    public void insertbegining(int n ){
        Listnode newnode = new Listnode(n);
        newnode.next=head;
        head=newnode;
    }
//insert at bottom
    public void insertend(int n){
        Listnode newnode = new Listnode(n);
        if(head==null){
            head=newnode;
            return;
        }
        else{
            Listnode currntnode= head;
            while (currntnode.next!=null) {
                currntnode = currntnode.next;
            }
            currntnode.next=newnode;
        }
    }

//insert at given position
    public void insertatposition(int pos , int data){
        Listnode newnode = new Listnode(data);
        int length=0;
        //calcualting the lenght of the linked list
        if(pos==1){ 
            newnode.next=head;
            head=newnode;
        }
        Listnode current = head;
        while (current!=null) {
            length++;
            current=current.next;
        }
        if(pos>length || pos < 0 ){
            return;
        }
        else{
            
            Listnode c = head;
            Listnode prev=null;
            for(int i =0;i<pos;i++){
                prev=c;
                c=c.next;
            }   

            prev.next=newnode;
            newnode.next=c;
        }
        
    }
//delete first node 
    public Listnode deletefirstnode(){
        if(head==null){
            return null;
        }
        Listnode cur = head;
        head=head.next;
        cur.next=null;
        return cur;
    }


    public static void main(String[] args) {
        singlylinkedlist1 sll = new singlylinkedlist1();
        sll.head=new Listnode(10);
        Listnode secondnode= new Listnode(20);
        Listnode thirdnode = new Listnode(30);
        Listnode fourthnode = new Listnode(40);
        sll.head.next=secondnode;
        secondnode.next=thirdnode;
        thirdnode.next=fourthnode;

        sll.insertbegining(300); // inserting in the begining
        sll.insertbegining(200);
        sll.insertbegining(100);
        sll.insertend(999);
        sll.insertend(333);
        sll.insertatposition(3,876);
        sll.insertatposition(1,888);
        
        System.out.println(sll.deletefirstnode().data+ " deleted ");
        System.out.println(sll.deletefirstnode().data+ " deleted ");

        System.out.println(sll.deletefirstnode().data+ " deleted ");

        System.out.println(sll.deletefirstnode().data+ " deleted ");

        

        Listnode current = sll.head;
        while (current!=null) {
            System.out.print(current.data +" --> ");
            current=current.next;
        }
        System.out.print("null");
    }
}
