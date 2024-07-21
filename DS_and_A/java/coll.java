package java;
/**
 * coll
 */
import java.util.*;
public class coll {
public static void main(String[] args) {
    List<Integer> test = new ArrayList<>();
    test.add(1);
    test.add(2);
    test.add(3);
    boolean x= test.contains(2);
    System.out.println(x);
    

    //set
    // Map<Integer,String> test2= new HashMap();
    // test2.put(1,"Prakash");
    // test2.put(2,"raj");
    // String s =test2.get(2);
    // System.out.println(s);
    // test2.remove(2);
    // System.out.println(test2);
    Iterator <Integer> ho =  test.iterator();  
    while (ho.hasNext()) {
        System.out.println(ho.next());
    }  
    TreeSet<Integer> t = new TreeSet<>();
    t.add(15);
    t.add(10);
    t.add(15);
    t.add(20);
    System.out.println(t);
    System.out.println("print elements from 10 "+t.tailSet(10));
    System.out.println("elements lower than 15 "+t.lower(15));
    System.out.println("Removed  10 "+t.remove(10));


    
}
    
}