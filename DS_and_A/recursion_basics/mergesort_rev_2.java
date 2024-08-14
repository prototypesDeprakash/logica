import leetcode_problems.primenumber;

/**
 * mergesort_rev_2
 */
public class mergesort_rev_2 {

    private static void merge_sort(int[] arr){
        int length = arr.length;
        int middle= length/2;
        if(length<=1)return; // base case;
        int [] leftarr=new int[middle];
        int [] rightarr=new int[length-middle];
        int i=0;
        int j=0;
        for(;i<length;i++){
            if(i<middle){
                leftarr[i]=arr[i];
            }else{
                rightarr[j]=arr[i];
                j++;
            }
        }
        merge_sort(leftarr);
        merge_sort(rightarr);
        merge(leftarr,rightarr,arr);
        

    }
    private static void merge(int[]leftarr,int[] rightarr,int[] arr){
        int leftsize= leftarr.length;
        int righsize = rightarr.length;
        int i =0;
        int l=0;
        int r=0;
        while (l<leftsize && r<righsize) {
            if(leftarr[l]<rightarr[r]){
                arr[i]=leftarr[l];
                i++;
                l++;

            }else{
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
        while (r<righsize) {
            arr[i]=rightarr[r];
            r++;
            i++;
        }
    }
    public static void main(String[] args) {
        int [] a ={98,7,6,5,4,3,3,223,2,1};
        merge_sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}