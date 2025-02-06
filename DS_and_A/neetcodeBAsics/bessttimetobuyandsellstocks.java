package neetcodeBAsics;

public class bessttimetobuyandsellstocks {

    private static int sol1(int []arr){
        int l=0;
        int r=1;

        int best=0;
        while (r<arr.length) {
            if(arr[l]<arr[r]){
                best = Math.max(arr[r]-arr[l], best);
                r++;
            }else{
                l++;
                r++;
            }
        }
        return best;

    }
    public static void main(String[] args) {
        int[]prices = {7,1,5,3,6,4};
        sol1(prices);

    }
}