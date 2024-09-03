package recursion_core;

public class mersor {
    private static void merge(int[]arr){
        int length = arr.length;
        int middle = length/2;
        if(length<=1)return;


        //split into left and right arry 
        int [] leftarr  =  new int[middle];
        int[] rightarr= new int[length-middle];
        int  i=0;
        int j = 0;
        for(;i<length;i++){
            if(i<middle){
                leftarr[i]=arr[i];

            }
            else{
                rightarr[j]=arr[i];
                j++;

            }
        } 
        merge(leftarr);
        merge(rightarr);
        merge_sort( leftarr, rightarr , arr);
        
    }
    private static void merge_sort(int[]leftarr , int[] rightarr,int[] arr){
    int leftsize = leftarr.length;
    int rightsize = rightarr.length;
    int i =0;
    int l =0;
    int r = 0;

    while (l<leftsize && r<rightsize) {
        if(leftarr[l]< rightarr[r]){
            arr[i] = leftarr[l];
            i++;
            l++;
        }
        else{
            arr[i]=rightarr[r];
            i++;
            r++;

        }
       
        
    }

    while (l<leftsize) {
        arr[i]=leftarr[l];
        i++;
        l++;

    }
    while (r<rightsize) {
        arr[i]=rightarr[r];
        i++;
        r++;
    }


    }
    public static void main(String[] args) {
        int [] arr  = {9,8,7,6,5,4,3,2,1};
        merge(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
