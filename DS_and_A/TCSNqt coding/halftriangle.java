public class halftriangle {

    private static void pat1(int n){
        
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pat2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    private static void pat3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(('A'-1)+j)+" ");
            }
            System.out.println();
        }
    }
    private static void pat4(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    private static void pat5(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    private static void fullPyramid(int n){
        
    }
    public static void main(String[] args) {
       pat5(5);
       

    }
}