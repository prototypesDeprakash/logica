package zoho_patterns;

/**
 * p1263pattern
 */
public class p1263pattern {
public static void main(String[] args) {
    int n = 5 ;
     for (int i=1;i<=n;i++){
        int num=i;
        for(int j =1;j<=i;j++){
            System.out.print(num+" ");
            num=num+n-j;
        }
        System.out.println();

      }
}
    
}