package Dailysum.DigitalBasics;

import java.util.HashSet;

public class removeDuplicates {

    private void sol1(int[]arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        
    }
    public static void main(String[] args) {
        
    }
}