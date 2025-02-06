package Dailysum.feb;

import linkedlist.linkedlistPractise.likiedlistalgos;

public class strictlyIncreasingordecreasing {

    private static int sol1(int[]arr){
        int increasing=1;
        int decreasing=1;

        int longest=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                increasing++;
                decreasing=1;
            }else if(arr[i]<arr[i-1]){
                increasing=1;
                decreasing++;
            }else{
                increasing=1;
                decreasing=1;
            }
            longest=Math.max(decreasing, increasing);
        }
        

        return longest;
    }
    public static void main(String[] args) {
        int[]nums={1,4,3,3,2};
        sol1(nums);
    }
}