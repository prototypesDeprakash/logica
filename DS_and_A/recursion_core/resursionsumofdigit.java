package recursion_core;

/**
 * resursionsumofdigit
 */
public class resursionsumofdigit {

    private static int sumofdigit(int n,int temp){
        if(n==0)return temp;
        temp+=n%10;
        return sumofdigit(n/10, temp);


        


    }
public static void main(String[] args) {
    System.out.println(sumofdigit(123, 0));
}
}