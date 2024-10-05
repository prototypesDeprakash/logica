package Dailysum.dailysolved;

public class removefromend {


    private static ListNode head;
    private static class ListNode {
        int data;
        ListNode next;

        private ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
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
    private static void removeratpos(int pos){
        if(pos==0){
     // head=currListnode.next;
     return ;
     }
      ListNode currListnode =head;
     int c=0;
     ListNode prev = null;
   
     while (currListnode != null && c != pos) {
      prev=currListnode;
      currListnode=currListnode.next;

      c++;
     }
     if (currListnode != null) {
          prev.next = currListnode.next;
      }
      
  }
private static int llegth(ListNode head){
      int l=0;
      ListNode current = head;
      while (current!=null) {
          current=current.next;
          l++;
      }
      return l;
  }
  private static void removenthnodefromendd(int k){
      //Remove Nth Node From End of List
      ListNode curr = head;
     
      int rem = llegth(head)-k ;
      removeratpos(rem);
  

  }
  public static void main(String[] args) {
    insertbeg(1);
    insertbeg(2);
    insertbeg(3);
    removenthnodefromendd(3);
    display();
  }
}
