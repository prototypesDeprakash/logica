package basic_insertionanddelete;

public class elementsearch {
    private static Listnode head;
    public static class Listnode {
        int data;
        Listnode next;
        private  Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {


        elementsearch es = new elementsearch();

        es.head = new Listnode(20);
        Listnode secnode = new Listnode(19);
        Listnode third = new Listnode(8);
        Listnode four = new Listnode(9);
        es.head.next=secnode;
        secnode.next= third;
        third.next=four;
        int searchele = 9;
        Listnode cur = head;
        boolean flag=false;
        int pos=0;
        while (cur!=null) {

            if(cur.data==searchele){
            
                flag=true;
            }
            pos++;
            cur=cur.next;
        }
        if(flag){
            System.out.println(searchele +" Found at "+pos+" th position");
                
        }
        else{
            System.out.println(searchele +" Not Found ");

        }
    }
}
