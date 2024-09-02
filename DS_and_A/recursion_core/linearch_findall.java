package recursion_core;

import java.util.ArrayList;

public class linearch_findall {
     
    private static ArrayList search(int[]arr , int i , int target,ArrayList a){
        if(i==arr.length)return a;
        if(arr[i]==target) a.add(i);
        return search(arr, i+1, target,a);
    }
    public static void main(String[] args){
        int[]arr = {1,2,3,4,5,6,4,2,4};
        ArrayList<Integer> a = search(arr, 0, 0, new ArrayList<>()); // we can return anything 
        search(arr, 0, 4,a);
        System.out.println(a);
        

    }
}
