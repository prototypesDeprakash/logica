package Dailysum.DigitalBasics;

public class findUnique {

    
    public static void main(String[] args) {
        int[]arr={1,1,2,4,4,5,2,5,11};
        int uniq_ele=0;
        for(int i=0;i<arr.length;i++){
            uniq_ele^=arr[i];
        }
        System.out.println(uniq_ele);
    }

}