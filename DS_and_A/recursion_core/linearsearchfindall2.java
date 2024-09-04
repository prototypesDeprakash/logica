package recursion_core;

import java.util.ArrayList;

public class linearsearchfindall2 {
    

    private static void ls(int[] arr , int  i , int target , ArrayList a){
        if(arr[i]==target)a.add(i);
        if(i==arr.length-1)return;
        ls(arr, i+1, target, a);
    }

    public static void main(String[] args) {

        ArrayList<Integer> a =  new ArrayList<>();
        int[] arr = {12,3,4,5,5,6,7,8};
        int target = 5;
        ls(arr, 0, target, a);
        System.out.println(a);
    }
}
