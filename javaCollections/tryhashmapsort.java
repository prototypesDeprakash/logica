package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class tryhashmapsort {

    private static void sol1(){
        HashMap<String ,Integer> mymap  = new HashMap<>();
        mymap.put("Prakash", 99);
        mymap.put("Alan", 100);
        mymap.put("Jyothi", 89);
        mymap.put("Jaya",93);
        System.out.println(mymap);
       // System.out.println(mymap.values().stream().toList().get(0));
       // Collections.sort(mymap.values().stream().toList(),(e1,e2)->(int)(mymap.values().stream().toList().get(0) - mymap.values().stream().toList().get(1)) );
        //System.out.println(mymap);
        List<Integer> value = new ArrayList<>(mymap.values());
        Collections.sort(value, (e1,e2)->e2-e1);
        System.out.println(value);
          List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(mymap.entrySet());
          System.out.println(sortedEntries);

    }
    public static void main(String[] args) {
        sol1();
    }
}
