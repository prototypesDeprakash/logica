package BasicPattern.twopoinandslidwinfow;


public class simpleproblem1 {
    private static void solution1(int[]arr,int k){ ///not working
        int tot = arr.length-k-1;

        int l=0;
        int r=k-1;
        int sum=0;
        int maxsum=0;

        for(int i =0;i<tot;i++){
            l=i;
            for(int j=l;j<r;j++){
                sum+=arr[j];
                System.out.print(arr[j]+" ");
            }
            maxsum=Math.max(sum,maxsum);
            System.out.println();

        }
        System.out.println(maxsum);

    }

    private static void solution2(int[]arr,int k){//not working
        int i=0;
        int r=arr.length-k;
        int sums=0;
        int maxsum=0;
        while (i<arr.length-k) {
          for(int j=i;j<r;j++){
            sums+=arr[j];
          }
          r++;
          maxsum=Math.max(maxsum,sums);
        }
        System.out.println(maxsum);
    }
    private static void ConstantSlidingwindowTemplate(int []arr,int k ){
       int l=0;
       int r=k;
       int sum=0;
       int maxsum=0;
       while (r<=arr.length) {
        for(int i =l;i<r;i++){
            sum+=arr[i];
        }
        maxsum=Math.max(maxsum, sum/k);
        sum=0;
        l++;
        r++;
       }
       System.out.println(maxsum);

    }
    
    public static void main(String[] args) {
        //the first problem is to find the sum (by adding 4 consecutive elements from the array)
        int[]arr={-1,2,3,3,4,5};
        ConstantSlidingwindowTemplate(arr, 4);
    

    }
}
