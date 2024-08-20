package basic_insertionanddelete;



public class singlylinkedlist {
    private static ListNode head;
    public static class ListNode{
        int data;
        ListNode next;
        private ListNode(int data){
            this.data=data;
            this.next=null;

        }

    }
//function to display the linked list
public void display(){
    ListNode current = head;
    while (current!=null) {
        System.out.print(current.data+" --> ");
        current=current.next;

    }
    System.out.print("Null");
}
//inset begining of linked list
public void insertbeg(int data){
    ListNode newnode = new ListNode(data);
    //main logic
    newnode.next=head;
    head=newnode;

}

//delete at begining
public void deletebeg(){
    if(head==null){
        return;
    }
    head=head.next;
}
//insert end
public void insertend(int data){
    ListNode newnode = new ListNode(data);
    //edge case:
    if(head==null){
        head = newnode;
        return;

    }
    ListNode current = head;
    while (current.next!=null) {
        current=current.next;
    }
    current.next=newnode;
}
//delete end
public void deleteend(){
    //if no element
    if(head==null){
        return;
    }
    //if only two element
    if(head.next==null){
        head=null;
        return;
    }
    //traversing to second last node 

    ListNode current = head;
    ListNode prev =null;
    while (current.next!=null) {
        prev=current;
        current=current.next;

    }
    if(prev!=null){
        prev.next=null;
    }
}
//insert at specific position
public void insertatpos(int data, int pos){
    ListNode current = head;
    ListNode temp;
    for(int i =0;i<pos-1;i++){
        
        
        current=current.next;
    }
    ListNode newnode = new ListNode(data);
    temp=current;
    current=current.next;
    temp.next=newnode;
    newnode.next=current;



}
    public static void main(String[] args) {
        singlylinkedlist sll = new singlylinkedlist();
        // sll.head=new ListNode(10);
        // ListNode secondnode= new ListNode(20);
        // ListNode thirdnode= new ListNode(30);
        // ListNode fourthnode = new ListNode(40);

        // //basic node link
        // sll.head.next=secondnode;
        // secondnode.next=thirdnode;
        // thirdnode.next=fourthnode;

        

        //insert begining
       // sll.insertbeg(0);
        //sll.deletebeg();
        sll.insertend(200);
        //sll.deleteend();
        //sll.insertatpos(500, 3);

        //displaying the linked list
        sll.display();

    }
}
