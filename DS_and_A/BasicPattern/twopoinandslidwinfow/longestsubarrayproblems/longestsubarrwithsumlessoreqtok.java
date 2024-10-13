package BasicPattern.twopoinandslidwinfow.longestsubarrayproblems;

public class longestsubarrwithsumlessoreqtok {
    

    private static void bruitforce(int[]arr,int k){
        int sums=0;
        int maxsums=0;
        for(int i=0;i<arr.length;i++){
            for(int j =i;j<arr.length;j++){
                sums=0;
                for(int y=i;y<=j;y++){

                    System.out.print(arr[y]+" ");
                    sums+=arr[y];
                }
                if(sums<=k){
                    maxsums=Math.max(maxsums,sums);
                }
            
            System.out.println();
        

            }
        }
        System.out.println(sums+"ans");
    }
    public static void main(String[] args) {
        int[]arr={2,5,1,7,10};
        int k=8;
        bruitforce(arr, k);
    }
}
