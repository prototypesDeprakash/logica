package Dailysum;

public class nov26 {
    private static void display(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    private static void solution1(int[][]arr, int[][]res ){
        for(int i=0;i<arr.length;i++){
            for(int j=arr[0].length-1;j>=0;j--){
                if(arr[i][j]==0){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=0;
                   // System.out.println(j);
                }
                res[i][j]=(arr[i][j]);

                res[i][arr[0].length - 1 - j] = (arr[i][j] == 0) ? 1 : 0;
                
            }
        }
        
    }
    public static void main(String[] args) {
        int[][]arr={{1,1,0},{1,0,1},{0,0,0}};
        int m =arr.length;
        int n =arr[0].length;
        int[][] res = new int[m][n];

        solution1(arr,res);
        display(res);
       
    }
}