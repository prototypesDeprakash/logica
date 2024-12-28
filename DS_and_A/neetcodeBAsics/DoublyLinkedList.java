//package neetcodeBAsics;

import BasicPattern.twopoinandslidwinfow.numberofsubstrcontainingall3cahr;
import recursion_core.fibbonacci;

class ListNode{
    int data;
    ListNode next;
    ListNode prev;
    public ListNode(int data){
        this.data=data;
        this.next=null;
        this.prev=null;

    }
    
}




public class DoublyLinkedList {
    private static ListNode head;
    private static ListNode prevpointer;
    private static ListNode curr;


    //for sigly linked list

    private static void printForward(){
        ListNode cur=head;
        while (cur!=null) {
            System.out.print(cur.data+"-->");
            cur=cur.next;
        }     
        System.out.print("null");
    }

    //for sigly linked list
    private static void insertbegining(int n){
        ListNode newNode = new ListNode(n);
        newNode.next=head;
        head=newNode;
    }
    //for sigly linked list

    private static void  insertEnd(int n){
        ListNode newNode = new ListNode(n); // just creating the node , node.next = null be default
        ListNode cur = head;
        while (cur.next!=null) {
            cur=cur.next;
        }
        cur.next=newNode;

    }

    //-----------------------------------------------------------------------------------------------
    //insert begining for doubly linked list
    private static void InsertbeginingDoublyLinked(int n){
        ListNode newNode = new ListNode(n);
        if(head!=null){
            newNode.next=head;
            head.prev=newNode;
        }
     
        head=newNode;
    }
    private static void InsertEndDoublyLinkedList(int n){
        ListNode newNode = new ListNode(n);
        //ListNode previousNode = head; - unnecessary
        ListNode currentNode = head;
        if(head==null){
            head=newNode;
            return;
        }
        while (currentNode.next!=null) {
            currentNode=currentNode.next;
           // previousNode = currentNode; 

        }
        currentNode.next=newNode;
        newNode.prev=currentNode;
    }
    //delete first doublyinkedlist
    private static void DeleteFirstNodeDoublyLinkedList(){
        if(head==null){
            return;
        }
        ListNode  cur = head.next;
        if(cur!=null){//if there is a second node
            cur.prev=null; //set its prev to null
        }
        head.next=null;
        head=cur;

    }
    private static void doubleConnection(){
        head = new ListNode(0);
        ListNode sec = new ListNode(1);
        ListNode thi = new ListNode(2);
        ListNode fou = new ListNode(3);
        // forward connection
        //0-->1-->2-->3
        head.next=sec;
        sec.next=thi;
        thi.next=fou;
        //backward connection
        //0<--1<--2<--3
        sec.prev=head;
        thi.prev=sec;
        fou.prev=thi;
        

    }
    public static void main(String[] args) {
        // head = new ListNode(0);
        // ListNode second = new ListNode(1);
        // ListNode third = new ListNode(2);
        // head.next=second;
        // second.next=third;
        // insertbegining(-1);
        // insertEnd(3);
        // insertEnd(4);

        // printForward();

    }

}
