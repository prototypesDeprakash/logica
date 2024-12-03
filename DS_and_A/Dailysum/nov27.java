public class nov27 {

   
    private static int sol1(int[][]arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
           
                res+=arr[i][i]+arr[i][arr.length-1-i];
            
        }
        if(arr.length%2==1){
            res-=arr[arr.length/2][arr.length/2];
        }
      return res;
    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
    
        }

}