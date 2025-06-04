package Leetcode_Ds_from_scratch.linkedlist;

public class LinkedListBasic {
    static class Node{
        int data; //4 bytes
        Node next; //12  bytes

        Node(int data){
            this.data=data;

        }
    }
    //Head 
   private Node head = null;
   //Insert at begining
   public void insertAtBeg(int data){
        Node newNode  = new Node(data);
        newNode.next=head;
        head=newNode;
   }

   public static void main(String[] args) {
     LinkedListBasic list = new LinkedListBasic();
     list.insertAtBeg(10);
   }

}
