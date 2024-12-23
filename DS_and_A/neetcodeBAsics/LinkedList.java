package neetcodeBAsics;


public class LinkedList {
private static Listnode head; 

private static class Listnode{
    int data;
    Listnode next;

    Listnode(int data){
        this.data=data;
        this.next=null;
    }

}
private static void InsertElementsBegining(int n){
    Listnode newNode= new Listnode(n);
    newNode.next=head;
    head=newNode;
}
private static void printElement(){
    Listnode curr = head;
    while (curr!=null) {
        System.out.print(curr.data+" --> ");
        curr=curr.next;
    }
    System.out.print("Null");
}
private static void reverse(){
    Listnode curr=head;
    Listnode next=null;
    Listnode prev = null;

    while (curr!=null) {
        next= curr.next;
        curr.next=prev; // here prev is null in starting 
        prev = curr;//after that prev becomes curr;
        curr=next;
    }

}
public static void main(String[] args) {
   
    head= new Listnode(0);
    Listnode first = new Listnode(1);

    head.next=first;
    InsertElementsBegining(9);
    InsertElementsBegining(8);
    InsertElementsBegining(7);
    InsertElementsBegining(6);
    InsertElementsBegining(5);


    reverse();
    printElement();
    
}
    
}