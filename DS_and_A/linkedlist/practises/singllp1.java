package practises;


public class singllp1 {
    private static Listnode head;
    private static class Listnode{
        int data;
        Listnode next;
        public Listnode(int data){
            this.data=data;
            this.next=null;
        }

    }
    //display
    public void display(){
        Listnode current= head;
        while (current!=null) {
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.print("Null");
    }
    //insert at begeining 
    public void insertbeg(int data){
        Listnode newnode = new Listnode(data);
      
        newnode.next=head;
        head=newnode;

    }
    //insert at ending
    public void insertatend(int data){

        Listnode current=head;
        Listnode newnode = new Listnode(data);
        if(head==null){
            head=newnode;
            return;
        }
        while (current.next!=null) {
            current=current.next;
        }
        current.next=newnode;

    }

    public static void main(String[] args) {
        singllp1 sll = new singllp1();
        sll.head= new Listnode(0);
        Listnode two = new Listnode(10);
        Listnode three = new Listnode(30);
        sll.head.next=two;
        two.next=three;

        //inserting at begining
        sll.insertbeg(999);//--> inserted firse
        sll.insertbeg(998); //--> inserted on top of the last one...

        //inserting at the ending
        sll.insertatend(1010);
        sll.insertatend(2024);

        //displaying
        sll.display();
        
        
    }

}
