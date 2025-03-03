package Dailysum.march;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class merge2darray {

    
    private static void sol1(int[][]arr1 , int[][] arr2){
        ArrayList<int[]> res = new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i][0] ==  arr2[j][0]){
                    arr1[i][0]+=arr2[j][0];
                  res.add(arr1[i]);             
                }
            }
        }
       

    }
    private static void sol2(int[][]arr1,int[][]arr2){
        HashMap<Integer,Integer> mymap = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(mymap.containsKey(arr1[i][0])){
                mymap.put(arr1[i][0], arr2[i][1]+mymap.get(arr1[i][1]));
            }
            else{
                mymap.put(arr1[i][0], arr1[i][1]);
            }
           
        }
        System.out.println(mymap);
    }

    private static void try3(int[][]arr1,int[][]arr2){
        ArrayList<int[]> res = new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i][0]==arr2[i][0]){
                    arr1[i][1]+=arr2[i][1];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][]arr1 = {{1,2},{2,3},{4,5}};
        int[][]arr2 ={{1,4},{3,2},{4,1}};
     //   System.out.println(arr1[0][0]);
     //sol1(arr1, arr2);
     sol2(arr1, arr2);

    }
}