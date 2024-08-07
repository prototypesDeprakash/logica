package manipulatingnodes;

import java.util.List;

import org.w3c.dom.stylesheets.LinkStyle;

public class singlylinkedlist3 {
    private static Listnode head;
    public static class Listnode {
    int data;
    Listnode next;
    private Listnode(int data){
        this.data=data;
        this.next=null;
    }

        
    }

    public static void main(String[] args) {
        singlylinkedlist3 sll3 = new singlylinkedlist3();
        sll3.head=new Listnode(10);
        Listnode secondnode= new Listnode(20);
        Listnode thirdnode = new Listnode(30);
        Listnode fourthnode = new Listnode(40);
        sll3.head.next=secondnode;
        secondnode.next=thirdnode;
        thirdnode.next=fourthnode;
        Listnode current = head;
        while (current!=null) {
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.print("null");

    }
}
