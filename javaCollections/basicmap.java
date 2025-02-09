package javaCollections;

import java.util.TreeMap;

import neetcodeBAsics.sortcolor;

public class basicmap {

    private static void sortmap(){
        TreeMap<String , Integer> mymap = new TreeMap<>(); //bydefault it sorts using key
        mymap.put("Prakash", 100);
        mymap.put("Alan", 202);
        mymap.put("Akshai", 98);
        mymap.put("Rani", 400);
        System.out.println(mymap);
        



    }
    public static void main(String[] args) {
        sortmap();
    }
}
