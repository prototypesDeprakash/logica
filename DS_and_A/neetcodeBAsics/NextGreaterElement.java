package neetcodeBAsics;

public class NextGreaterElement {

    private static void display(int []n){
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }
    }
    private static int[] sol1(int[]nums1 , int[] nums2){
        int [] res = new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
        res[i]=-1;
        boolean found = false;
        for(int j=0;j<nums2.length;j++){
           // System.out.println(nums1[i]+" "+nums2[j]);
            if(nums1[i]==nums2[j]){
               if((j+1)<nums2.length){
                if(nums2[j+1]>nums1[i]){
                    res[i] = nums2[j+1];
                            found = true;
                            break;
                }
               // System.out.println();
               }
              
            }
            
        }
       }
      
        return res;
    }
    public static void main(String[] args) {
        int[]nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        sol1(nums1, nums2);
    }
}
