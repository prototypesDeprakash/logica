package listalgorithms;




public class linkedlistbase {
    private static ListNode head;
    public static class ListNode{
        int data;
        ListNode next; 
        private ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    private static void display(){
        ListNode currNode = head;
        while (currNode!=null) {
            
            System.out.print(currNode.data+ " --> ");
            currNode=currNode.next;
        }
        System.out.print("Null");
    }

    //reverse linked list 
    private static void Reverseinkedlist(){
        

    }
    public static void main(String[] args) {
         linkedlistbase sll = new linkedlistbase();
        sll.head = new ListNode(10);
        ListNode secodnode = new ListNode(20);
        ListNode thirdnode = new ListNode(30);
        ListNode fourthnode = new ListNode(40);

        //connection 
        sll.head.next=secodnode;
        secodnode.next=thirdnode;
        thirdnode.next=fourthnode;



        //displaying the thing 
        sll.display();

    }

}
