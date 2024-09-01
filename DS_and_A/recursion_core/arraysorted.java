package recursion_core;

import javax.sound.midi.SysexMessage;

public class arraysorted {
 private static int check(int[]arr,int i){

    if(arr[i]>arr[i+1])return -1;
    if(i==arr.length-2)return 1;
    if(arr[i]>arr[i+1])return -1;

    return check(arr, i+1);

    
 }
 public static void main(String[] args){
    int[] arr = {1,2,3,4,5,8};
    if(check(arr, 0)==1){
        System.out.println("array is sorted");
    }
    else{
        System.out.println("Array is not sorted");
    }

}
}
