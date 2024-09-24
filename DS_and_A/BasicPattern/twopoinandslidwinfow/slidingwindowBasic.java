package BasicPattern.twopoinandslidwinfow;


public class slidingwindowBasic {
    public static void main(String[] args) {
        int [] arr ={-1,2,3,4,-1};
        int k=4;
        int l=0;
        int r =k-1;
        int sum = 0;
        int maxsum = 0;
        //calculation g first window
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        maxsum=sum;

        while (r<arr.length-1) {
                sum-=arr[l];
                l++;
                r++;
                sum+=arr[r];
                maxsum=Math.max(maxsum,sum);
        }

        System.out.println(maxsum);
    }
}
