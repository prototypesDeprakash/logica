package Dailysum.DigitalBasics;

import java.util.Arrays;
import java.util.HashSet;

import Shit_Skillrack.display;

public class CountDaysWithoutMeetings {

    private static int sol1(int days,int[][]arr){
       
        HashSet <Integer> mySet = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int starting = arr[i][0];
            int ending = arr[i][1];

           for(int x=starting;x<=ending;x++){
            mySet.add(x);
           }

        }
        return days-mySet.size();
    }
    public static void main(String[] args) {
        int[][]arr={{5,7},{1,3},{9,10}};
        //sol1(10, arr);
        Arrays.sort(arr , (a,b)->Integer.compare(a[0], b[0]));
        display.display2D(arr);
    }
}
