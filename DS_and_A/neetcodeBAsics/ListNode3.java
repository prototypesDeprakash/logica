package neetcodeBAsics;


//so its default
class mynode{

    int data;
    mynode next;
 
    public mynode(int data){
        this.data=data;
        this.next=null;
    }
}

public class ListNode3 {
    private static mynode head;

    private static void print(){
        mynode cur = head;
        while (cur!=null) {
            System.out.print(cur.data+"-->");
            cur=cur.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
       head= new mynode(0);
       mynode sec = new mynode(1);
       mynode third = new mynode(2);
       head.next=sec;
       sec.next=third;
       print();
    }
}
