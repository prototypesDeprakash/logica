package Dailysum.april;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesome {

    private  static void optimal(int[]arr){
        int maxneeded=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxneeded=Math.max(maxneeded, arr[i]);
        }
        int lessneeded= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            lessneeded=Math.min(lessneeded, arr[i]);
        }
        int finalmax=0;

        for(int i=0;i<arr.length;i++){
            finalmax=Math.max(finalmax, (maxneeded - lessneeded)*arr[i]);
        }
        System.out.println(finalmax);
    }

    private static void sol1(int[]arr){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
            
        
        
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] ==0){
                       List<Integer> nl = Arrays.asList(arr[i], arr[j], arr[k]);
                       if(!list.contains(nl)){
                        list.add(nl);
                       }

                    }
                }
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[]arr={1, 1, 0, -1 ,-2};
        //sol1(arr);
        optimal(arr);
    }
}
