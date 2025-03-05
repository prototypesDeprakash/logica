package Dailysum.DigitalBasics;

public class primeNumber {
    private static void bruitforcemethod(int n){
        int flag=0;
        
        for(int i=2;i<n;i++){
            if(n==1){
                flag=2;
                break;
            }
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Not a prime number");
        }else if(flag==2){
            System.out.println("neither prime nor composit");
        }
        else{
            System.out.println("prime number");
        }
    }
    public static void main(String[] args) {
        bruitforcemethod(1);
    }
}
