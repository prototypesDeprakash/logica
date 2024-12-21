package Dailysum.dailysolved.December;
import java.util.HashMap;

public class dec10 {

private static boolean issame(String s){
    for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)!=s.charAt(i+1)){
            return false;
        }
        
    }
    return true;
}
    private static int sol1(String s){
      
        HashMap <String , Integer> mymap=new HashMap<>();
       int res=-1;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
            String substring = s.substring(i, j);
            if(issame(substring)){
                mymap.put(substring, mymap.getOrDefault(substring, 0)+1);
                if(mymap.get(substring)>=3){
                    res=Math.max(res, substring.length());
                }
            }

            }
        }
      


       return res;
    }

    public static void main(String[] args) {
        String s = "abcdef";
        sol1(s);
    }
}