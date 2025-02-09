package javaCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class collection_use {

    private static void sol1(){
        Collection<String>myCollection =  new ArrayList<>(); 
        List<String> mylist = new ArrayList<>();     
        myCollection.add("hello");
        mylist.add("one");
        mylist.add("two");
        mylist.set(1, "three"); //can only replace existing index
        System.out.println(mylist);
                              
    }

    public static void main(String[] args) {
        sol1();
    }
}