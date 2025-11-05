package DSARestart_TCS_PRep;

public class bordertraversal {

    private static void sol1(int[][]arr){
        int m = arr.length;
        int n = arr[0].length;
        
            
        for(int j=0;j<n;j++){
            System.out.print(arr[0][j]+" ");
        }         
        
        for(int k=1;k<m;k++){
                System.out.print(arr[k][n-1]+" ");
            }
        for(int l =n-2;l>=0;l--){
            System.out.print(arr[m-1][l]+" ");
        }
        for(int o = m-2;o>0;o--){
            System.out.print(arr[o][0]);
        }
        
    }
    public static void main(String[] args) {
        int[][]arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        sol1(arr);

    }
}
