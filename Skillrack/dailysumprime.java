package Skillrack;

import java.util.ArrayList;

public class dailysumprime {

    private static void sol1(int n){
        int []nums={2,0,0};
     while (n!=0) {
        
     }
     
      ArrayList <Integer> allpossible= new ArrayList<>();
      String res1 ="";
      String res2 ="";
      String res3 ="";
      
        for(int j=0;j<=9;j++){
            res1= Integer.toString(j)+ Integer.toString(nums[1])+ Integer.toString(nums[2]);
            res2=Integer.toString(nums[0])+ Integer.toString(j)+ Integer.toString(nums[2]);
           res3=Integer.toString(nums[0])+ Integer.toString(nums[1])+ Integer.toString(j);
            allpossible.add(Integer.parseInt(res1));
            allpossible.add(Integer.parseInt(res2));
            allpossible.add(Integer.parseInt(res3));
        }
        System.out.println(allpossible);
      
    
    }
    public static int countDigits(int number) {
        if (number == 0) {
            return 1; // Special case for 0
        }

        int count = 0;
        while (number != 0) {
            number /= 10; // Remove the last digit
            count++;
        }
        return count;
    }
    private static boolean isprime(int n){
        if(n<=1){
            return false;
        }
       
        for(int i=2;i<=Math.sqrt(n);i++){
            if((n%i )==0){
                return false;
            }
        }
        return true;
    }

    private static boolean sol2(int n){
       
        String nu = Integer.toString(n);
       
    
        
        for(int i=0;i<nu.length();i++){
        
            for(int j=0;j<=9;j++){
                StringBuilder res = new StringBuilder(nu);
                int solnum = Integer.parseInt((res.replace(i, i+1, Integer.toString(j))).toString());
                System.out.println(solnum);
                if(isprime(solnum)){
                    return false;
                }
                
            }
        }
       return true;
        
        
    }
public static void main(String[] args) {
System.out.println(sol2(14));
    
}
}