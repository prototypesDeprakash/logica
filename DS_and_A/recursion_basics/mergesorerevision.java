

public class mergesorerevision {
    private static void merge_sort(int[] arr){
        int lenght= arr.length;
        int middle=lenght/2;
        if(lenght<=1)return;
        
        int [] leftarray = new int[middle];
        int [] rightarray = new int[lenght-middle];
        int i=0;
        int j=0;
        for(;i<lenght;i++){
            if(i<middle){
                leftarray[i]=arr[i];
            }
            else{
                rightarray[j]=arr[i];
                j++;
            }
        }
        merge_sort(leftarray);
        merge_sort(rightarray);
        merge(leftarray,rightarray,arr);
    }
    private static void merge(int[] leftarr , int[]rightarray ,int[]arr){
        int leftarrsize = leftarr.length;
        int rightarraysize = rightarray.length;
        int i=0;
        int l=0;int r=0;
        while (l<leftarrsize && r <rightarraysize) {
            if(leftarr[l]<rightarray[r]){
                arr[i]=leftarr[l];
                i++;
                l++;
            }
            else{
                arr[i]=rightarray[r];
                i++;
                r++;
            }


        }
        while (l<leftarrsize) {
            arr[i]=leftarr[l];
            i++;
            l++;

        }
        while (r<rightarraysize) {
            arr[i]=rightarray[r];
            i++;
            r++;
        }

    }
    public static void main(String[] args) {
        int [] arr={9,3,5,65,443,2,445,243,1,23,46,3};
        merge_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
