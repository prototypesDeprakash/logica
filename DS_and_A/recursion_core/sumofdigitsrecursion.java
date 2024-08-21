package recursion_core;



public class sumofdigitsrecursion {
 
    public static int sumofdigits(int n,int temp){
        if(n==0)return temp;
        temp=(temp*10)+n%10;
        return sumofdigits(n/10,temp);
    }
    public static void main(String[] args) {
            System.out.println(sumofdigits(123,0));
           // System.out.println(temp);
    }
}
