package Leetcode_Ds_from_scratch.linkedlist;

public class reverseSll {
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
//reverse 
private static void reverseList(){
    ListNode prev = null;
    ListNode cur = head;
    while (cur!=null) {
        ListNode next = cur.next;
        cur.next=prev;
        prev=cur;
        cur=next;
    }
    head=prev;
}

    private  static void display_nodes(){
        ListNode currListNode =head;
        while (currListNode!=null) {
            System.out.print(currListNode.data+" -> ");
            currListNode=currListNode.next;
        }
        System.out.println("Null");
    }


public static void main(String[] args) {
    
}
}
