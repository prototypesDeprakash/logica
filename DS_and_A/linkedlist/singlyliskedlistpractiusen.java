public class singlyliskedlistpractiusen {
    private static ListNode head;
    public static class ListNode {
        int data;
        ListNode next;

        private ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    //display 
    public void display(){
        ListNode current = head;
        while (current!=null) {
            
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.print("Null");
    }
    //insert at begining 
    public void Insertbeg(int data){
        ListNode newnode = new ListNode(data);
        if(head==null){
            head=newnode;
        }
        newnode.next=head;
        head=newnode;
    }
    //insert at end;
    public void InsertAtEnd(int data){
        ListNode newnode = new ListNode(data);
        if(head==null){
            head=newnode;
            return;

        }

        ListNode currNode = head;
        while (currNode.next!=null) {
            
            currNode=currNode.next;
        }
        currNode.next=newnode;


    }
    
    public static void main(String[] args) {
        singlyliskedlistpractiusen sll = new singlyliskedlistpractiusen();
       // sll.head=new ListNode(10);
        // ListNode secondnode = new ListNode(20);
        // ListNode thirdnode =  new ListNode(30);
        // ListNode fourthnode = new ListNode(40);
        // sll.head.next=secondnode;
        // secondnode.next=thirdnode;
        // thirdnode.next=fourthnode;

        //insert at beginign
      sll.Insertbeg(999);
        sll.Insertbeg(888);
        sll.InsertAtEnd(1000);
        sll.InsertAtEnd(300);


        sll.display();

    
    }
}
