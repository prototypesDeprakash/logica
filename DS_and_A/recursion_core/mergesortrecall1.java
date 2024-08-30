package recursion_core;

public class mergesortrecall1 {
    private static void merge_sort(int arr[]){
            int length = arr.length;
            int  midd= length/2;
            if(length<2)return;
            int[] leftarr=new int[midd];
            int[] rightarr = new int[length - midd];
            int i = 0; int j = 0;
             
            
            for(;i<length;i++){
                if(i<midd){
                    leftarr[i]=arr[i];
                }
                else{
                    rightarr[j]=arr[i];
                    j++;
                }
            }
            merge_sort(leftarr);
            merge_sort(rightarr);
            merge(leftarr, rightarr, arr);
            

    }

    private static void merge(int[] leftarr, int[] rightarr , int[] arr){

        int leftarrsize = leftarr.length;
        int rightarrsize  = rightarr.length;
        int i=0;
        int l=0;
        int r=0;

        while (l<leftarrsize && r<rightarrsize) {
            if(leftarr[l]<rightarr[r]){
                arr[i]=leftarr[l];
                i++;
                l++;
            }
            else{
                arr[i]=rightarr[r];
                i++;
                r++;

            }
        }
        while (l<leftarrsize) {
            arr[i]=leftarr[l];
            i++;
            l++;
        }
        while (r<rightarrsize) {
            arr[i]=rightarr[r];
            i++;
            r++;
        }
    }
    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,4,3,2,1};
        merge_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
