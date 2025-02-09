package javaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaystoIterateOverList {
    public static void main(String[] args) {
        List<String> mylit =Arrays.asList("C#","python","java","C++","React");
        
        //for loop 
        for(int i=0;i<mylit.size();i++){
           // System.out.println(mylit.get(i));
        }
        
        //for each
        for (String s : mylit) {
           // System.out.println(s);
        }
        //basic loop with iterator
        for(Iterator iterator = mylit.iterator();iterator.hasNext();){
            String s = (String)iterator.next();
            //System.out.println(s);
        }
        //iterator with while loop
        Iterator iterator = mylit.iterator();
        while (iterator.hasNext()) {
            String s = (String)iterator.next();
            System.out.println(s);
        }

        //stream + lambda
        mylit.stream().forEach(mycourse->System.out.println(mycourse));
        //foreach+lambda
        mylit.forEach(c->System.out.println(c));
    }
}
