package neetcodeBAsics;



public class Queue {

    private static class ListNode{
        int data ;
        ListNode next;
        public  ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    private static ListNode head;
    private static ListNode tail;

    private static void Enqueue(int n){
       
        ListNode newNode =  new ListNode(n);
        if(head==null){
            head = newNode;
            tail= newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    private static void Dequeue(){
        if(head== null){
            return;
        }
        else{
            head= head.next;
        }
    }
    public static void main(String[] args) {
        
    }
    
}