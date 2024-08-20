public class sumofnnumber {
    public static int recursivesummation(int n){
        if(n<=1)
            return n;
        return n+ recursivesummation(n-1);
    }
    public static void main(String[] args) {
        int a=4;
        System.out.println(recursivesummation(a));
    }
}
