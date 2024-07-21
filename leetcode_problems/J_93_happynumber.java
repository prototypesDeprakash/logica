
public class J_93_happynumber {

   
    public static void main(String[] args) {
        
            System.out.println(sumofDsquares(10));
    }
}
 static int sumofDsquares(int n){
    int temp= n;
    int res=0;
    while(n!=0){
        temp=n%10;
        res+=temp;
        n=n/10;
    }
    return res;
    }
 