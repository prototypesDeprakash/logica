package BasicPattern.twopoinandslidwinfow;

public class longestsubaraybrutef {
    public static void main(String[] args) {
        //longest sub array 
        //brute force approach
        int[] arr ={ 2,5,1,7,10};
        int k=14;
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
               sum+=arr[j];
               if(sum<=k){
                maxsum=Math.max(maxsum,i-j+1);
               }
               if (sum>k){
                break;
               }
            }
            
        }
        System.out.println(maxsum);

    }
}
