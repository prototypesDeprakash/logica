package Dailysum.jan25;

import java.util.HashSet;

public class StringMatchinginanaarray {

    private static void sol1(String[]arr){
        HashSet <String> myset = new HashSet();
            for(int i =0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if( (arr[i].contains(arr[j]) ) && !arr[i].equals(arr[j])){
                        myset.add(arr[j]);
                    }
                }
            }
            System.out.println(myset);
    }
    public static void main(String[] args) {
        String[]words = {"mass","as","hero","superhero"};
        sol1(args);
    }
}