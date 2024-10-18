package Dailysum.dailysolved;

/**
 * removemiddleelelmentfronll
 */
public class removemiddleelelmentfronll {
    private static ListNode head;
    public static class ListNode{
        int data;
        ListNode next;
        private ListNode(int data){
            this.data=data;
            this.next=null;

        }

    }
    private static int countll(){
        ListNode curr=head;
        int total=0;
        while (curr.next!=null) {
            total++;
            curr=curr.next;
        }
        return total;
    }



    public static void main(String[] args) {
        
        System.out.println(countll());
    }
    
}