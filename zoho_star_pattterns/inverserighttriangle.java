package zoho_star_pattterns;

public class inverserighttriangle {
    public static void main(String[] args) {
        int n=5;
        //int temp=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
                
            }
            //temp--;
            System.out.println();
        }
    }
}
