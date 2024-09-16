package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class minimumdifference {
    //time format = "23:59"
    private static int findhm(String time){
        int hours=Integer.parseInt(time.substring(0,2));  
        int minutes = Integer.parseInt(time.substring(3, 5));   
        return hours*60+minutes;   
    }
    
    private static int findMinDiff(List<Integer> times){
       Collections.sort(times);
       int minDiff=Integer.MAX_VALUE;
       //difference between consecutive time ;
       for (int i = 0; i < times.size() - 1; i++) {
        minDiff = Math.min(minDiff, times.get(i + 1) - times.get(i));

    }
    minDiff = Math.min(minDiff, (1440 - times.get(times.size() - 1) + times.get(0)));

    return minDiff;
    }
    public static void main(String[] args) {
       
       String[] timePoints = {"03:05", "23:05", "12:05", "00:35"};
       ArrayList <Integer>myarr = new ArrayList();

     for(String s : timePoints){
    
      
        myarr.add(findhm(s));
     }
     int mindiff = findMinDiff(myarr);
     System.out.println(mindiff);
    



        
    }
}
