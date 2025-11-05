package DSARestart_TCS_PRep;

class Node{
    int value;
    Node next;
    Node(int value){
        this.value=value;
        this.next=null; 
    }
}
class LinkedList_my1{
    Node head;
    public void insert_from(int value){
        Node newNode = new Node(value);
        newNode.next=head;
        head = newNode;
    }
    public void display_ll(){
        Node current  = head;
        while (current!=null) {
            System.out.print(current.value+"->");
            current=current.next;
        }
    }
    public void deleteNode(int value){
        if(head ==null)return;
        if(head.value ==value){
            head=head.next;
            return;
        }
        Node current = head;
        while (current.next!=null) {
            if(current.next.value == value){
                current.next=current.next.next;
                return;
            }
            current=current.next;
        }
    }
}
public class deletenodefromLinkedList {
public static void main(String[] args) {
LinkedList_my1 ll = new LinkedList_my1();
ll.insert_from(99);
ll.insert_from(21);
ll.display_ll();
    
}
    
}