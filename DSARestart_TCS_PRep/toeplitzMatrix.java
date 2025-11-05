package DSARestart_TCS_PRep;

public class toeplitzMatrix {

    private static boolean sol1(int[][]arr){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] != arr[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}