package Leetcode_Ds_from_scratch.linkedlist;

public class deleteKthnode {
     static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static ListNode head;

    private static void Insert_end(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    private static void display_nodes() {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("Null");
    }

    private static void deleteKthNode(int k) {
        if (k <= 0) {
            System.out.println("Invalid position");
            return;
        }

 
        if (k == 1) {
            if (head != null) {
                head = head.next;
            }
            return;
        }

        ListNode curr = head;
        // Move to (k-1)th node
        for (int i = 1; i < k - 1 && curr != null; i++) {
            curr = curr.next;
        }


        if (curr == null || curr.next == null) {
            System.out.println("Position out of bounds");
            return;
        }

        curr.next = curr.next.next;
    }

    public static void main(String[] args) {
        Insert_end(10);
        Insert_end(20);
        Insert_end(30);
        Insert_end(40);
        Insert_end(50);

        System.out.println("Original List:");
        display_nodes();

        deleteKthNode(3); 

        System.out.println("After Deleting 3rd Node:");
        display_nodes();
    }
}
