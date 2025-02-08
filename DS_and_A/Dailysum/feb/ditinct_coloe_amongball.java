package Dailysum.feb;

import java.util.ArrayList;
import java.util.HashMap;

public class ditinct_coloe_amongball {

    private static void sol1(int[][]arr){
        ArrayList<Integer> finalres= new ArrayList<>();
        HashMap<Integer,Integer> mymap= new HashMap<>();
        int x=1;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][1]);
            if(mymap.containsKey(arr[i][0])){
                x++;
            }
            finalres.add(x);
            mymap.put(arr[i][0], arr[i][1]);


        }
        System.out.println(finalres);
    }
    public static void main(String[] args) {
        int[][]arr={{1,4},{2,5},{1,3},{3,4}};
        sol1(arr);
    }
}