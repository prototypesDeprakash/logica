package neetcodeBAsics;

import java.util.List;

//inner class variation

public class LinkedList2 {
    private static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    private static ListNode head;

    private static void print(){
        ListNode cur = head;
        while (cur!=null) {
            System.out.print(cur.data+"-->");
            cur=cur.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        head = new ListNode(0);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        head.next=second;
        second.next=third;
        print();

    }
}
