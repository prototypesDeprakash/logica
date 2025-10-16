import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class maxfrequenct22_09_2025 {

    private static int myres(int[]arr){
        HashMap<Integer,Integer> mymap = new HashMap<>();

        for(int i =0;i<arr.length;i++){
            mymap.put(arr[i], mymap.getOrDefault(arr[i], 0)+1);
        }
      //  System.out.println(mymap);

        ArrayList<Integer> mylist = new ArrayList<>();
        for (int i : mymap.values()){
            mylist.add(i);
        }

        int maxval= Collections.max(mylist);
        int res=0;
        for(int x:mylist){
            if(x==maxval){
                res+=x;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,3,4,5};
        System.out.println(myres(arr));
    }
}