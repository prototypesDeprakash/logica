package Dailysum.DigitalBasics;

import Skillrack.display;

public class rotatearra {

    private static int  sol1(int[]arr,int k){
        int temp=arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
            
        }
        arr[0]=temp;
        //display.display1D(arr);
        return sol1()
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        int k=3;
        sol1(arr);
        
    }
}