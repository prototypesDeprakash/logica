package recursion_core;

import java.util.ArrayList;

public class linearsearchnoarg {
     static ArrayList ls(int[]arr , int i , int target){
        ArrayList<Integer> a  = new ArrayList<>();
            if(i==arr.length-1)return a;
            if(arr[i]== target)a.add(i);
            ArrayList<Integer> ansfromall = ls(arr, i+1, target);
            a.addAll(ansfromall);
            return a;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,6,7,7,8,89,9,9,8};
        System.out.println(ls(arr, 0, 9));
    }
}
