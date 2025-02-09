package javaCollections;

import java.util.HashMap;

public class collectionbasic {
//lesson1- limitations of array
    public static void main(String[] args) {
        int a =10;
        int b=20;
        int c=30;
        student[] arr = new student[10];
       arr[0]=new student();
       arr[1]= new student();
      //  arr[2]= new book(); -> array support only single type
      Object[] myobj = new Object[10];
      myobj[0]="hello";
      myobj[1]=1;
      for(int i=0;i<myobj.length;i++){
        try{
            System.out.println(Integer.parseInt(myobj[i].toString())+1);

        }
        catch(Exception e){
            System.out.println(myobj[i]);
            
        }
      }HashMap<String, Integer> mymap = new HashMap<>();
    mymap.put("one", 1);
    System.out.println(mymap.get("one"));

    }

   static class book{

    }
    static class student{

    }
}