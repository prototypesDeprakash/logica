package neetcodeBAsics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupanagrams3 {

    private static void sol1(String[]arr){
        HashMap<String,List<String>>  mymap  = new HashMap<>();
        for(String s:arr){
            char[]a = s.toCharArray();
            Arrays.sort(a);
            String sortedString = new String(a);
            mymap.putIfAbsent(sortedString, new ArrayList<>());
            
            mymap.get(sortedString).add(s);
            
        }
    System.out.println(mymap);

    }
    public static void main(String[] args) {
        String[]s = {"act","pots","tops","cat","stop","hat"};
        sol1(s);
    }
}