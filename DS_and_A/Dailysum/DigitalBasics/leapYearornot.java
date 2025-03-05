package Dailysum.DigitalBasics;

public class leapYearornot {

    private static void sol1(int year){

        // if divisible by 400 then its direclty a leap year
        //if not diviible by 400 but divisible by 100 then not a leap year
        // if not divisible by 400, 100 but divisible by 4 then its leap year
        if(year%400 ==0){
            System.out.println("Leap Year ");
        }else if(year%100 ==0){
            System.out.println("Not  a Leapyear");
        }else if(year%4==0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not  a leap Year");
        }
    }
    public static void main(String[] args) {
        
    }
}