package DSARestart_TCS_PRep;

public class array_min_max_basic {
    
    public static void main(String[] args) {
        int[]arr = new int[]{-1,-2,-3,-4,-5,-6};
        int m  = arr[0];
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>m){
                m=arr[i];
            }
        }
        System.out.println(m);

        
    }
}
