package linkedlist;

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
                
    // 0 -> 1 -> 2- > 3 -> 4 ->5
//insert at sepcifi position 
private static void insertatpos(int pos , int n){
    if(head==null){
        System.out.println("Cant fucking insert !");
        return;

    }
    Listnode newnode = new Listnode(n);
    Listnode current  = head;
    Listnode prev = current;
    for(int i=0;i<pos;i++){
        prev = current;
        current=current.next;
    }
    prev.next=newnode;
    newnode.next=current;
    
}

// NEEW -> 1->2->3
// 2--1

//insert begining
private static void insertbeg(int n){
    Listnode newnode = new Listnode(n);
    if(head==null){
        head=newnode;
        return;
    }
    newnode.next=head;
    head=newnode;

}
//insert end 
private static void insertend(int n ){
    Listnode newnode = new Listnode(n);
    Listnode current = head;
    if(head==null){
        head=newnode;
        return;
    }
    //1->2->4->5
    while (current.next!=null) {
        current=current.next;
    }
    current.next=newnode;
}

//traversing and displaying 

    private static void display(){
        Listnode current =head;
        while (current!=null) {
            System.out.print(current.data+ " ---> ");
            current=current.next;
        }
        System.out.print("Null");

    }

    //linear search a element;
    private static void search(int target){
        Listnode current = head;
        int i=0;
        while (current!=null) {
            i++;
            if(current.data==target){
                System.out.println("element found at "+ i);
                return;
            }
            current=current.next;
        }
        System.out.println("element not found");
    }

    private static void reverseLinkedList(){

    }

    public static void main(String[] args) {
      // Listnode head = new Listnode(0);
       llrec ll =  new llrec();
     //  ll.head=new Listnode(0);
       //Listnode two = new Listnode(1);
       //Listnode three = new Listnode(2);
       //head.next=two;
       //two.next=three;

       //insert data
       
       insertbeg(999);
       insertbeg(998);
       insertbeg(997);
       insertend(1);
       insertatpos(3, 0);
       search(1);
       display();
    }
}
