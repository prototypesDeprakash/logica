package Dailysum.april;

import java.util.ArrayList;
import java.util.Arrays;

public class threesum {

    private static ArrayList sol1(int[]arr){
        Arrays.sort(arr);
        ArrayList<ArrayList> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]){ //skip if number repeat
                continue;
            }
            int left=i+1;
            int right =arr.length-1;
            while (left<right) {
                int threesum = arr[i]+arr[left]+arr[right];
                if(threesum>0){
                    right--;
                }else if(threesum<0){
                    left++;
                }
                else{
                    ArrayList<Integer>threepair = new ArrayList<>();
                    threepair.add(arr[i]);
                    threepair.add(arr[left]);
                    threepair.add(arr[right]);
                    res.add(threepair);
                    left++;;
                    while (arr[left] == arr[left-1] && left<right) {
                        left++;
                    }

                }
            }
            
        }
        return res;
    }
    public static void main(String[] args) {
        int[]arr={-1,0,1,2,-1,-4};
        System.out.println(sol1(arr));
    }
}