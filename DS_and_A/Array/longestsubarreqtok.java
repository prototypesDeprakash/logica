package Array;

public class longestsubarreqtok {
    private static void bettersolution(int[]arr,int target){
        int sum;
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    if(sum==target){
                        c++;
                    }
                }
                
            }

        }
        System.out.println(c-1);

    }
    public static void main(String[] args) {
        int k =  10, array[] = {2,3,5,1,9};
bettersolution(array, k);
    }
}
