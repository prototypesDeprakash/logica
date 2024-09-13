package Array;

public class numberwithevennoofdigit {
    private static int count(int a){
        int c=0;
        while (a!=0) {
            c++;
            a=a/10;
        }
        return c;
    }
    public static void main(String[] args) {
       int[]nums={12,345,2,6,7896};
       int res=0;
       for (int a: nums){
        if(count(a)%2==0){
            res++;
        }
       }

       System.out.println(res);
    }
}
