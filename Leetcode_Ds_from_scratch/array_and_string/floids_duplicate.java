package Leetcode_Ds_from_scratch.array_and_string;

public class floids_duplicate {
    private static int floidAlgorithm(int[]arr){
        int slow =0;
        int fast =0;
        while (true){
            slow=arr[slow];
            fast=arr[arr[fast]];
            if(slow ==fast){
                break;
            }

        }
        //phase2
        int slow2=0;
        while (true) {
            slow=arr[slow];
            slow2=arr[slow2];
            if(slow==slow2){
                return slow;
            }

        }
        
    }

    private static int floid(int[]arr){
        int slow =0;
        int fast=0;
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];

        }while(slow!=fast);

         slow =0;
        while (slow!=fast) {
            slow=arr[slow];
            fast=arr[fast];
            
        }
        return slow;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,2};
        System.out.println(floid(arr));
    }
}
