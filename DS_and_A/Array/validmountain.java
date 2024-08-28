package Array;

public class validmountain {
    private static int findpos(int[] arr , int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr = {2,1};
        int maxinarr=0;
        
        
        for(int i=0;i<arr.length;i++){
           maxinarr= Math.max(maxinarr,arr[i]);
        }
     
        int pos = findpos(arr, maxinarr);
        System.out.println(pos);
        if(arr.length<2)System.out.println("f");
        if(arr[pos-1]< arr[pos] && arr[pos+1]<arr[pos]){
            System.out.println("tue");
        }
        System.out.println("fls");
    }
}
