package Leetcode_Ds_from_scratch.Mathematics;

public class leastCommonDivisor {
    private static int gcd(int a , int b){
        int res = Math.min(a, b);
        while (res>0) {
            if((a%res==0)&&(b%res==0)){
                break;
            }
            res--;
        }
        return res;
    }
    private static int Gcd_Eucledian(int a , int b ){
        while (a!=b) {
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }

        }
        return a;
    }

    private static int lcm(int a, int b){
        int res = Math.max(a,b);
        while (true) {
            if(res%a ==0 && res%b==0){
                return res;
            }
            res++;
        }

        

    } 
    private static int lcm_optimal(int a , int b ){
        return (a*b)/gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println(lcm(10, 15));
        System.out.println(gcd(10, 15));
        System.out.println(Gcd_Eucledian(10, 15));
        System.out.println(lcm_optimal(10, 15));
    }
}