package BasicPattern.twopoinandslidwinfow;

public class binarysubarrywithsumequaltok {

    private static void solution1(int[]arr,int k){
        int c=0;
        int  sum=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
    
    public static void main(String[] args) {
        int[]arr={1,0,1,0,1};
        int k=2;
        solution1(arr, k);
    }
}
