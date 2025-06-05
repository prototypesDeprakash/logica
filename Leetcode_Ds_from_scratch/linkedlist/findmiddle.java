package Leetcode_Ds_from_scratch.linkedlist;

public class findmiddle {
      static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
       
    } 

    private static ListNode head;
private static void Insert_Begining(int data){
    ListNode newNode  = new ListNode(data);
    newNode.next=head;
    head=newNode;
}
private static void Insert_end(int data){
    ListNode newNode = new ListNode(data);
    ListNode currNode= head;
    while (currNode.next!=null) {
        currNode=currNode.next;
    }
    currNode.next=newNode;
    
    
}


    private  static void display_nodes(){
        ListNode currListNode =head;
        while (currListNode!=null) {
            System.out.print(currListNode.data+" -> ");
            currListNode=currListNode.next;
        }
        System.out.println("Null");
    }


    private static void findMiddleNode(){
        if(head==null) return;
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.print("Middle Emement is: "+slow.data);
    }
    public static void main(String[] args) {
        findmiddle fm = new findmiddle();
        fm.Insert_Begining(10);
        fm.Insert_Begining(20);
        fm.Insert_Begining(30);
        fm.Insert_Begining(40);
        fm.Insert_Begining(50);
        fm.Insert_Begining(50);
        fm.display_nodes();
        fm.findMiddleNode();
    }
}
