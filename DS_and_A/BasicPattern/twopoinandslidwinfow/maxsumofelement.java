package BasicPattern.twopoinandslidwinfow;

public class maxsumofelement {
    public static void main(String[] args) {
        int[]arr = {-1,2,3,4,5,-1};
        int k =4;
        int n = arr.length;
        int l =0;
        int r=k-1;
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        // first find the sum upto k 
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        maxsum=sum;


        while (r<n-1) {
           //in each iteration , remove first element
            sum-=arr[l];
            l++;
            r++;
            // and add last element.....
            sum+=arr[r]; 
            maxsum=Math.max(maxsum, sum);


            
        }
        System.out.println(maxsum);
        
    }
}
