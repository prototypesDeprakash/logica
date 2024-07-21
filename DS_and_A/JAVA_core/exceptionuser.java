
import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionuser {
    public static int divide(int divisor , int divident){
        if(divident==0){
            throw new IllegalArgumentException("do not divide with 0 bro!");
        }
        return divident/divisor;
    }
    public static void main(String[] args) {
        try{
            int result = divide(11,10);
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            Scanner sc = new Scanner(System.in);//nput mismatch 
            int a = sc.nextInt();
            
            System.out.println(a);
        }catch(InputMismatchException e ){
            System.out.println(e);
        }
    }
}
