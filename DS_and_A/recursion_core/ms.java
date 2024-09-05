package recursion_core;

public class ms {
    private static void merge_sort(int[]arr){
        int length = arr.length;
        int midd = length/2;
        if(length<=1)return;
        int[] leftarr = new int[midd];
        int[]rightarr = new int[length-midd];
        int i=0;
        int j=0;
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
        merge_sort(leftarr,rightarr,arr);
    }
    private static void merge_sort(int[]leftarr , int[]rightarr , int[]arr ){
        int leftsize =leftarr.length;
        int rightsize = rightarr.length;
        int i=0;
        int l=0;
        int r=  0 ;
        while (l<leftsize && r<rightsize) {
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
        while (l<leftsize) {
            arr[i]=leftarr[l];
            i++;
            l++;
        }
        while (r<rightsize) {
            arr[i]=rightarr[r];
            i++;
            r++
            ;
        }

    }
    private static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        merge_sort(arr);
        display(arr);
    
    }
}
