package Leetcode_Ds_from_scratch.linkedlist;

import java.util.List;

import Shit_Skillrack.display;

public class SinglyLinkedListPractise {
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
    public static void main(String[] args) {
            SinglyLinkedListPractise sll = new SinglyLinkedListPractise();
            sll.head=new ListNode(10);
            ListNode secNode = new ListNode(20);
            ListNode thirdNode = new ListNode(30);
            ListNode fourthnode = new ListNode(40);
            sll.head.next=secNode;
            secNode.next=thirdNode;
            thirdNode.next=fourthnode;
            Insert_Begining(50);
            Insert_Begining(60);
            Insert_end(99);
            Insert_Begining(88);
            display_nodes();
            
    }
}                                                                           
