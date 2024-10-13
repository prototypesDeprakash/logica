package BasicPattern.twopoinandslidwinfow.longestsubarrayproblems;
import java.math.BigDecimal;
public class maximumavgsubarray {
    private static double ConstantSlidingwindowTemplate(int []arr,int k ){
        int l=0;
        int r=k;
        double sum=0;
        double maxsum=0;
        int z=1;
        while (r<=arr.length) {
         sum=0;

         for(int i =l;i<r;i++){
             sum+=arr[i];
         }
         if(sum<0){
             z=-1;
         }else{
             z=1;
         }
         double avg = sum / (double) k;  // Ensure division is done as double
        // maxsum = Math.max(maxsum, Math.abs(avg));
         maxsum=Math.max(maxsum,Math.abs(avg) );
         maxsum*=z;
         l++;
         r++;
        }
       return maxsum;
 
     }
     private static double workingsolution(int[]arr,int k){
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];

        }
        double maxsum=sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            maxsum=Math.max(maxsum,sum);
        }
       return maxsum=maxsum/k;
     }

     public static void main(String[] args) {
        int []nums={493,593,1446,-6013,2163,8450,3008,-1328,6195,4102,-6242,-9971,-8327,4480,-4972,-8305,-1644,2320,331,2465,2955,-8386,-7580,1759,-9576,-8088,-9446,-2916,-3600,923,1412,-5390,4492,9458,-9336,-4754,-3455,9597,-324,-5628,4242,4076,8159,-2423,-3449,6744,9029,-9231,2283,6118,-200,3610,-7566,-6976,2519,9532,2221,-5167,-2370,1861,-1558,-9815,-1186,2021,7050,-4504,4926,8362,7805,-8274,-351,5826,7623,-5520,-2395,-8466,-8461,3261,-3197};
        int k=7;
    System.out.println(ConstantSlidingwindowTemplate(nums, k));
    System.out.println(workingsolution(nums, k));
     }
}
