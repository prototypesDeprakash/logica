package linkedlist;



public class llrec {
    private static ListNode head;
    private static class ListNode {
        int data;
        ListNode next;

        private ListNode(int data){
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
    ListNode newnode = new ListNode(n);
    ListNode current  = head;
    ListNode prev = current;
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
    ListNode newnode = new ListNode(n);
    if(head==null){
        head=newnode;
        return;
    }
    newnode.next=head;
    head=newnode;

}
//insert end 
private static void insertend(int n ){
    ListNode newnode = new ListNode(n);
    ListNode current = head;
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
        ListNode current =head;
        while (current!=null) {
            System.out.print(current.data+ " ---> ");
            current=current.next;
        }
        System.out.print("Null");

    }

    //linear search a element;
    private static void search(int target){
        ListNode current = head;
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

    private static void deletebeg(){
        ListNode current = head;
        head=current.next;
        if(head ==null){
            return;
        }
    }
    private static void deleteend(){
        ListNode current = head;
        ListNode prev = current;
        while (current.next!=null) {
            prev=current;
            current=current.next;
           
        }
        prev.next=null;
    }

    private static void reverseLinkedList(){


    }

    private static int llegth(){
        int l=0;
        ListNode current = head;
        while (current!=null) {
            current=current.next;
            l++;
        }
        return l;
    }
    private static void removeratpos(int pos){
        ListNode currListNode =head;
       int c=0;
       ListNode prev = null;
       if(pos==0){
       
     //head=currListNode.next;
     return;
       }
       while (c!=pos) {
        prev=currListNode;
        currListNode=currListNode.next;

        c++;
       }
       prev.next=currListNode.next;

    }

    private static void removenthnodefromendd(int k){
        //Remove Nth Node From End of List
    
       
        int rem = llegth()-k;
        removeratpos(rem);
    

    }

    public static void main(String[] args) {
      // ListNode head = new ListNode(0);
       llrec ll =  new llrec();
     
    //   insertbeg(999);
     // insertbeg(998);
 //  insertbeg(997);
      insertend(1);
      insertbeg(2);
      insertbeg(999);
    //    insertend(123);
    //    insertend(321);
    //    insertatpos(3, 0);

    //    search(1);

    //    deletebeg();
    //    deleteend();
    //  removeratpos(0);
     removenthnodefromendd(1);
       //display the current linked list
       display();

    }
}
