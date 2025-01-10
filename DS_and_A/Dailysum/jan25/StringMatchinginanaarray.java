package Dailysum.jan25;

import java.util.ArrayList;
import java.util.HashSet;

public class StringMatchinginanaarray {

    private static ArrayList sol1(String[]arr){
        HashSet <String> myset = new HashSet();
        
            for(int i =0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if( i != j && arr[i].contains(arr[j])){
                        myset.add(arr[j]);
                    }
                }
            }
           ArrayList <String> s= new ArrayList<>();
          
            for(String u : myset){
                s.add(u);
            }
            return s;
    }
    public static void main(String[] args) {
        String[]words = {"mass","as","hero","superhero"};
        sol1(words);
    }
}