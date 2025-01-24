package neetcodeBAsics;

public class productofarrayexcept {


    private static int[] sol1(int[]arr){
        int[]prefix = new int[arr.length];
        int[]suffix = new int[arr.length];
        int[]res = new int[arr.length];
        prefix[0]=1;
        suffix[arr.length-1]=1;
        for(int i =1;i<arr.length;i++){
            prefix[i]=prefix[i-1]*arr[i-1];
        }
        for(int i=arr.length-1;i>0;i--){
            suffix[i]=suffix[i+1]*arr[i+1];
        }
        for(int i =0;i<arr.length;i++){
            res[i]=prefix[i]*suffix[i];
        }
        return res;

    }
    public static void main(String[] args) {
        
    }
}