package manipulatingnodes;

import leetcode_problems.l_88ONTINUSSUBARRAYjAVA;
import leetcode_problems.merge_104_;

/**
 * findingmiddlenode
 */
public class findingmiddlenode {

private static class Listnode{
    int data;
    Listnode next;

    public Listnode(int data){
        this.data=data;
        this.next=null;
    }
  
}
private static Listnode head;

public static void display(){
    Listnode current=head;
    while (current!=null) {
        System.out.print(current.data+" --> ");
        current=current.next;

    }
    System.out.print("Null");
}
public void indertbeg(int data){
    Listnode newnode = new Listnode(data);
    if(head==null){
        head=newnode;
    }
    newnode.next=head;
    head=newnode;

}
public void findmiddleslowfast(){
    Listnode slowpointer = head;
    Listnode Fastpointer = head;
    while (Fastpointer!=null && Fastpointer.next!=null) {
        slowpointer=slowpointer.next;
        Fastpointer=Fastpointer.next.next;
    }
    System.out.println(slowpointer.data);

}
public void findmiddle(){
     //calculate the length of the linked list
        int length = 0;
        Listnode current = head;
        while (current!=null) {
            length++;
            current=current.next;
        }
        //System.out.println(length);
        length/=2;
        Listnode mid = head;
        for(int i=0;i<length;i++){
            mid=mid.next;
        }
        System.out.println(mid.data);
     
     //div by 2 

     //itereate from head to that div value


}
public static void main(String[] args) {
    findingmiddlenode fsll = new findingmiddlenode();
    fsll.head=new Listnode(10);
    Listnode secnode = new Listnode(20);
    Listnode thirdnode = new Listnode(30);
    fsll.head.next=secnode;
    secnode.next=thirdnode;

    fsll.indertbeg(100);
    fsll.indertbeg(999);
    fsll.findmiddle();
    display();

}
    
}