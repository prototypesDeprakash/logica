package Leetcode_Ds_from_scratch.Mathematics;

public class greatestCommonDivisor {
    private static int gcd(int a,int b){
        int res = Math.min(a,b);
        while (res>0) {
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }

    private static int euclidean(int a , int b){
        while (a!=b) {
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(gcd(10, 15));
        System.out.println(euclidean(10, 15));
    }
}
