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



    private static void solution1(int[] arr,int k){
        int l =0;
        int r =0;
        int sum=0;
        int maxlen=0;
        int n = arr.length;

        while (r<n) {
            sum+=arr[r];

            //what if the sum is > than k
            while (sum>k) { //to optimize change while to if
                sum-=arr[l];
                l++;

            }

            if(sum<=k){
                maxlen=Math.max(maxlen, r-l+1);//we need the length so the formula to find lenth
                // is sub l  from r and add 1


            }
            r++;
        }
        System.out.println(maxlen);
        
    }
    private static void product(int[] arr,int k){
        int l =0;
        int r =0;
        int sum=0;
        int maxlen=0;
        int n = arr.length;

        while (r<n) {
            sum+=arr[r];

            //what if the sum is > than k
            while (sum>k) {
                sum-=arr[l];
                l++;

            }

            if(sum<=k){
                maxlen=Math.max(maxlen, r-l+1);//we need the length so the formula to find lenth
                // is sub l  from r and add 1


            }
            r++;
        }
        System.out.println(maxlen);
        
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int k=4;
        solution1(arr, k);
        
    }
}
