package neetcodeBAsics;

public class containerwithmostwater {

    private static int sol1(int[]arr){
        int l =0;
        int r=arr.length-1;
        int currentlength=arr.length-1;
        int maxcapacity=0;
        while (l<r) {
            maxcapacity=Math.max(maxcapacity,currentlength*(Math.min(arr[l], arr[r])));
            if(arr[l]<arr[r]){
                l++;
            }else{
                r--;
            }
            currentlength--;
        }
       return maxcapacity;
    }
    public static void main(String[] args) {
        int[]  height = {1,1};
        sol1(height);
    }
}
