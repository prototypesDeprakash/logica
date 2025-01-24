package neetcodeBAsics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupanagrams2 {

    private static void sol1(String[]arr){
        HashMap<String,List<String>> mymap = new HashMap<>();
        for(String s :arr){
            char[]ch  = s.toCharArray();
            Arrays.sort(ch);
            String sotrted = new String(ch);
            mymap.putIfAbsent(sotrted, new ArrayList<>());
            
            mymap.get(sotrted).add(s);
        }
        System.out.println(mymap.values());
    }
    public static void main(String[] args) {
        String[]s={"act","pots","tops","cat","stop","hat"};
        sol1(s);
    }
}
