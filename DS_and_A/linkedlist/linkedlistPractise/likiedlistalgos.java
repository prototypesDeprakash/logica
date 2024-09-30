package linkedlist.linkedlistPractise;

/**
 * likiedlistalgos
 */

 public class likiedlistalgos {

    private static Listnode head;
    private static class Listnode{
        int data;
        Listnode next ;
        private Listnode (int data){
            this.data=data;
            this.next=null;

        }
    }

        //print the node 

        private static void Display(){
            Listnode current  = head;
            while (current!=null) {
                
                System.out.print(current.data+"-->");
                current=current.next;
            }
            System.out.print("Null");
        }
    public static void main(String[] args) {
        likiedlistalgos l1 = new likiedlistalgos();
        l1.head = new Listnode(0);
        Listnode node1 = new Listnode(1);
        Listnode node2 = new Listnode(2);
        Listnode node3 = new Listnode(3);
        l1.head.next=node1;
        node1.next=node2;
        node2.next=node3;
       Display();


    }
}



