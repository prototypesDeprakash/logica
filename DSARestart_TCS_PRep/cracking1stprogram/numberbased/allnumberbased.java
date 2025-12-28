package DSARestart_TCS_PRep.cracking1stprogram.numberbased;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Dailysum.DigitalBasics.leapYearornot;
import Dailysum.feb.badpairs;

import java.io.IOException;
public class allnumberbased {

    private static void positive_or_negative() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        
        if(n<0){
            System.out.println("Negative Number");
        }if(n>0){
            System.out.println("Positive Number");
        }
    }
    private static void Leap_year_or_not() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if((n%400==0 && n%100==0 )  || (n%400==0)){
            System.out.println("Leapyear");
        }else{
            System.out.println("Not a Leapyear");
        }
    }

        private static void sieveOfEratosthenes(){
            boolean[]arr = new boolean[20];
            for(int i=0;i<20;i++){
                arr[i]=true;
            }
            arr[0]=false;
            arr[1]=false;
        //Main logic
        for(int i=2 ;i<=(int)Math.sqrt(arr.length);i++){
            if(arr[i]){
                for(int j=i*i;j<arr.length;j+=i){
                    arr[j] = false;
                }
            }
        }
            
            

        }


private static boolean prime_number(int n) throws IOException{
    //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //int n = Integer.parseInt(reader.readLine());
    int flag=0;
    if(n==1){
        System.out.println("Neither prime nor composit");
        return false;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            flag=1;
            return false;
        }
    }
    if(flag==0){
        System.out.println("PrimeNumber");
         return true;
    }else{
        System.out.println("Not a PrimeNumber");
        return false;
       
    }
}
private static void prime_number_withinRange() throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int start = Integer.parseInt(reader.readLine());
    int end = Integer.parseInt(reader.readLine());
    for(int i=start;i<=end;i++){
        if(prime_number(i)){
            System.out.print(i+" ");
        }
    }
}


//sum of digits of a number
private static void sum_of_digits() throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    int rs=0;
    while (n!=0) {
        rs+=n%10;
        n=n/10;
    }
    System.out.println(rs);
}
private static void reverse_a_number()throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    int rev=0;
    while (n!=0) {
        rev=rev*10+n%10;
        n=n/10;
    }
    System.out.println(rev);
}



//Amstrong number

    private static void Amstrong_Number() throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    int count_number=0;
    int finres=0;
    int n2=n;
    //count digits first
    while (n2!=0) {
        n2=n2/10;
        count_number++;
    }
    n2=n;
    while (n!=0) {
        finres+=Math.pow(n%10, count_number);
        n=n/10;
    }
    if(finres ==n2){
        System.out.println("Its an Amstrong Number");
    }else{
        System.out.println("Its not an Amstrong Number");
    }
    }

    private static void fibbonaci_series() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int a =0;
        int b =1;
        for(int i=0;i<10;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
    //fibbonaci of nth term
    private static int fibbonaci_nth_term(int n) throws IOException{
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         //n = Integer.parseInt(reader.readLine());
        if(n==0)return 0;
        if(n==1)return 1;
        return fibbonaci_nth_term(n-1)+fibbonaci_nth_term(n-2);
        }

    // power of  a number
    private static void power_of_a_numer() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number= Integer.parseInt(reader.readLine());
        int power = Integer.parseInt(reader.readLine());

        int res=1;
        for(int i=0;i<power;i++){
            res*=number;
        }
        System.out.println(res);
        
    }
    public static void main(String[] args) {
        try{
            //positive_or_negative();
            //Leap_year_or_not();
            //prime_number();
            //prime_number_withinRange();
            //sum_of_digits();
            //sieveOfEratosthenes();
            //reverse_a_number();
            //Amstrong_Number();
            //fibbonaci_series();
            //System.out.println(fibbonaci_nth_term(3));
            power_of_a_numer();

        }catch(Exception e){

        }
    }
}