package Leetcode_Ds_from_scratch.patterns;

public class patternBasic {
 private static void spiralMatrix(int n){ // without 2d array
      
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            int layer = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
            int start = layer;
            int end = n - 1 - layer;

            // Count numbers before current layer
            int countBeforeLayer = 0;
            for (int l = 0; l < layer; l++) {
                int sideLength = n - 2 * l;
                if (sideLength == 1) {
                    countBeforeLayer += 1;
                } else {
                    countBeforeLayer += 4 * (sideLength - 1);
                }
            }

            int offset = 0;
            if (i == start) {
                // top row
                offset = j - start;
            } else if (j == end) {
                // right column
                offset = (end - start) + (i - start);
            } else if (i == end) {
                // bottom row
                offset = 2 * (end - start) + (end - j);
            } else {
                // left column
                offset = 3 * (end - start) + (end - i);
            }

            int value = countBeforeLayer + offset + 1;
            System.out.printf("%3d ", value);
        }
        System.out.println();
    
}

 }
   
 private static void printline(){
        System.out.println("-----------------------------------------------");
    }
    private static void SquarePattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
    private static void HollowPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void zoho_1stPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j||i==n-j-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void rightAngleTriange(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void rightAngleHollowTriange(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0|| j==i || i==n-1    ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void zeroOneFiller(int n){
        boolean f=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(f){
                    System.out.print("1 ");
                    f=false;
                }
                else if(!f){
                    System.out.print("0 ");
                    f=true;
                }
            }
            System.out.println();
        }
    }
    private static void LeftAngleTriange(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){

               System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("*");
            }

        System.out.println();
            
        }
    }
   
    public static void main(String[] args) {
    //    SquarePattern1(5);
    //    printline();
    //    HollowPattern(5);
    //    zoho_1stPattern(5);
    //    rightAngleTriange(10);
    //    rightAngleHollowTriange(10);
    //    zeroOneFiller(5);
    //    spiralMatrix(5);

    LeftAngleTriange(10);
    int c =3;
    System.out.println(Integer.hashCode(111));
        



    }


}



