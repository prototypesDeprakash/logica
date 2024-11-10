package Dailysum;

public class nov10contest {
    //check if there are two subarray 
    // they should be adjacent 
    /*
     * 
     * [2,5,7,8,9,2,3,4,3,1]
     */


     private static void solution1(int[]a ,int k ) {
        int endindex1=0;
        int sub1length = 0;
        int sub2length = 0;
        int endindex2=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1] && sub1length<k){
                sub1length++;
                endindex1=i+1;
            }
            else if(sub2length<k){
                sub2length++;
                endindex2=i+1;
            }
            else{
                if (sub1length == k && sub2length == k) {
                    break; // We found two adjacent subarrays
                } else if (sub1length == k) {
                    // Reset for the second subarray
                    sub2length = 0;
                    endindex2 = -1;
                } else {
                    // Reset completely if no valid subarray was found
                    sub1length = 0;
                    endindex1 = -1;
                }
            }

            
        }
        if (sub1length == k && sub2length == k && endindex2 == endindex1 + k) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        list.toArray(new String[0]);
     }
    public static void main(String[] args) {
       int[]a =  {2,5,7,8,9,2,3,4,3,1};
       int k=3;
       solution1(a, k);
    }
}
