package Dailysum.feb;

import java.util.HashMap;

public class badpairs {


    private static long  sol1(int[]arr){
        long c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((i<j) && ((j-i) != arr[j]-arr[i])){
                    c++;
                }
            }
        }
        return c;
        }

        private static long sol2(int[]arr){
            HashMap<Integer,Integer>mymap= new HashMap<>();
           int n=arr.length;
            int gp=0;
            for(int i=0;i<arr.length;i++){
               
                    if(mymap.containsKey(i-arr[i])){
                        gp+=mymap.get(i-arr[i]);
                    }
                    mymap.put(i-arr[i], mymap.getOrDefault(i-arr[i], 0)+1);
                
            }
            long badPairs = n * (n - 1) / 2 - gp;
            return badPairs;
        }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3};
        sol2(arr);           
    }
}