package Leetcode_Ds_from_scratch.array_and_string;

import Skillrack.display;

public class InversionCountOptimalMergesort {


    private static int merge_sort(int[]arr){
        int length = arr.length;
        int middle= arr.length/2;
        if(length<=1)return 0;
        int i=0;
        int j=0;
        int[]leftarr= new int[middle];
        int[]rightarr= new int[length-middle];

        //splitting into left and right
        for(;i<length;i++){
            if(i<middle){
                leftarr[i]=arr[i];
            }else{
                rightarr[j]=arr[i];
                j++;
            }
        }
      int leftinversion = merge_sort(leftarr);
      int rightinversion = merge_sort(rightarr);

      int mergeInversion = merge(leftarr,rightarr,arr);

      return leftinversion+rightinversion+mergeInversion;

    }
    private static int merge(int[]leftarr,int[]rightarr , int[]arr){
        int leftlength = leftarr.length;
        int rightlength = rightarr.length;
        int i=0;
        int r =0;
        int l=0;
        int count =0;
        while (l<leftlength && r<rightlength) {
            if(leftarr[l]<=rightarr[r]){
                arr[i]=leftarr[l];
                i++;
                l++;
               
            }else{
                arr[i]=rightarr[r];
                i++;
                r++;
                 count += (leftlength - l);
            }
        }
        while (l<leftlength) {
            arr[i]=leftarr[l];
            i++;
            l++;
        }
        while (r<rightlength) {
            arr[i]=rightarr[r];
            i++;
            r++;
        }
        return count;
    }


    public static void main(String[] args) {
        int[]arr={10 ,1 ,2, 3, 4};
System.out.println(merge_sort(arr));  //   display.display1D(arr);
    }
}
