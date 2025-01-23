package Dailysum.jan25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupanagrams {

    private static ArrayList sol1(String[]arr){
            Map<String ,List<String>> mymap = new HashMap<>();
            for(String s : arr){
                char chararr[] = s.toCharArray();
                Arrays.sort(chararr);
                String sorted = new String(chararr.toString());
                mymap.putIfAbsent(sorted,new ArrayList<>());
                mymap.get(sorted).add(s);

            }
           return new ArrayList<>(mymap.values());
    
    }
    public static void main(String[] args) {
        char[]chararr = {'a','p','p','l','e'};

        String s = new String(chararr
        );
        System.out.println(s);
    }
}

