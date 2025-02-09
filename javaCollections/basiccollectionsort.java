package javaCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class basiccollectionsort {
    public static void main(String[] args) {
        List<Integer>mylist = new ArrayList<>();
        mylist.add(10);
        mylist.add(60);
        mylist.add(40);
        mylist.add(10);
        mylist.add(70);
        mylist.add(20);
        mylist.add(30);
        mylist.add(50);

        System.out.println(mylist);
        Collections.sort(mylist);
        System.out.println(mylist);
        Collections.reverse(mylist);
        System.out.println(mylist);
        



    }
}
