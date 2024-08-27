package recursion_core;



public class oneton {
    private static void printer(int n){
    if(n==0)return;
    else{
        printer(n-1);
        System.out.println(n);
        
    }
    }
    public static void main(String[] args) {
        System.out.println("one to n");
        printer(10);
    }
}
