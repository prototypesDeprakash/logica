package neetcodeBAsics;



class ListNode{
    int data;
    ListNode next;
    public  ListNode(int data){
        this.data=data;
        this.next=null;
    }
}

public class LinkedlistMerge {
private static ListNode head;
private static ListNode head2;

private static ListNode dummy;

private static void mergenode(){
//creating dummy linked list
dummy = new ListNode(0);
ListNode cur = dummy;

while (head!=null && head2!=null) {
    if(head.data>head2.data){
        cur.next= head2;
        head2=head2.next;
    }else{
        cur.next=head;
        head=head.next;
    }
    cur=cur.next;
}
if(head!=null){
    cur.next=head;
}else{
    cur.next=head2;
}
}

private static void printmergedLikedList(){
    System.out.println();
    ListNode cur = dummy;
    while (cur!=null) {
        System.out.print(cur.data+"-->");
        cur=cur.next;
    }
    System.out.print("null");
}
private static void printLinkedList1(){
    ListNode cur = head;
    while (cur!=null) {
        System.out.print(cur.data+"-->");
        cur=cur.next;   
    }
    System.out.print("null");
}
private static void printLinkedList2(){

    System.out.println();
    ListNode cur = head2;
    while (cur!=null) {
        System.out.print(cur.data+"-->");
        cur=cur.next;   
    }
    System.out.print("null");
}
public static void main(String[] args) {
    //linked list 1
    head = new ListNode(1);
    ListNode sec= new ListNode(2);
    ListNode third = new ListNode(3);
    head.next=sec;
    sec.next=third;
    //linked list 2
    head2 = new ListNode(0);
    ListNode secn = new ListNode(1);
    ListNode thirdn = new ListNode(2);
    ListNode fourth = new ListNode(3);
    head2.next=secn;
    secn.next=thirdn;
    thirdn.next=fourth;

    //printing linked list 1 & 2
    printLinkedList1();
    printLinkedList2();
    mergenode();
    printmergedLikedList();

    
}

    
}