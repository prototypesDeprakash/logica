package BasicPattern.twopoinandslidwinfow;

public class longestsubarraywiththegivensum {
    private static void bruitforcesolution(int[] arr ,int k){
            for(int i =0;i<arr.length;i++){
                for(int j =i;j<arr.length;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        int[]arr ={2,3,5};
        int k =5;
        bruitforcesolution(arr, k);


    }
}
