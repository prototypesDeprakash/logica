package HashMapFull;
import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        int[]  ac ={2,2,1};
        int res=0;
        for (int i : ac) {
            if(a.contains(i)){
                a.remove(i);
            }
            else{
                a.add(i);
            }
            
        }
        Integer[] array = a.toArray(new Integer[0]);
        System.out.println(array[0]);
      
    }
}
