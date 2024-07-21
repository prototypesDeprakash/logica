package DS_and_A.craking_CI.chapter1_array;

import java.util.ArrayList;

public class zerosumanother {
    public static void main(String[] args) {
        int n=7;
        ArrayList <Integer> myarr=new ArrayList<>();
        Boolean oddoreven=n%2==0;
        for(int i=0;i<n;i++){

        
        if(oddoreven){
            myarr.add(n);
            myarr.add(-n);
            
        }
        else{
          
            myarr.add(n);
            myarr.add(-n);
            myarr.add(0);
            n-=1;
        }
    }
        
        System.out.println(myarr);
       
    }
}
