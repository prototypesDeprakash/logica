package BasicPattern.twopoinandslidwinfow;

public class subarraysumequaltok {

    private static void bruteforcesolution(int[] arr,int target){
        int sum;
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum==target){
                    c++;
                }
            }

        }
        System.out.println(c);
    }
    private static void optimizedsolution(int[] arr , int target){
        
    }

    private static void bettersolution(int[]arr,int target){
        int sum;
        int c=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];

                if(sum==target){
                    c++;
                }
            }
        }
        System.out.println(c);

    }
    public static void main(String[] args) {
        int[]arr={1,2,3};
        int target=3;

        bruteforcesolution(arr,target);
        bettersolution(arr, target);
    }
}




/*
 * int k=2;
        int l=0;
        int r=0;

        int sum=0;
        int c=0;

        while (r<arr.length) {
        if(sum<k){
            sum+=arr[r];
            r++;
        }
        if(sum>k){
            sum-=arr[l];
            l++;
        }
        if(sum==k){
           c++;
           sum=0;
        }
        
        
        }
        System.out.println(c);
 */