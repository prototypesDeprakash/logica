package DS_and_A.craking_CI.chapter1_array;

import java.util.ArrayList;

public class zerosumarray {
    public static void main(String[] args) {
        int n=5;
        int prefixsum=0;
        ArrayList <Integer> myarr = new ArrayList<>();
        for(int i=1;i<n;i++){
            prefixsum+=i;
            myarr.add(i);

        }
        myarr.add(-prefixsum);
        System.out.println(myarr);
        
    }
}
