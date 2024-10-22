package BasicPattern.twopoinandslidwinfow;

public class maximumpointsobtainfromcard {

    private static int sumupto(int k , int[]arr){
        int res=0;
        for(int i =0;i<k;i++){
            res+=arr[i];
        }
        return res;
    }
    private static void solution1(int[]arr,int k){
        int x = sumupto(k, arr);
        int maxsum=x;

        int l =k-1;
        int r=arr.length-1;
        for(int i=0;i<k;i++){
          //  System.out.println(arr[l]);
            x=x-arr[l];
            x=x+arr[r];
            l--;
            r--;
            maxsum=Math.max(maxsum,x);
        }
        System.out.println(maxsum);
        
    }
    public static void main(String[] args) {
        int[]arr = {6,2,3,4,7,2,1,7,1};
        int k=4;
        solution1(arr, k);
    }
}
