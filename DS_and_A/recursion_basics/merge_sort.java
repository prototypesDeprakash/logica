public class merge_sort {
    
    private static void mergesort(int[] arr){
        int length = arr.length;
        int middle = length/2;
        if(length<=1)return;
        int[] leftarray = new int[middle];
        int[] rightarray = new int[length-middle];
        int i =0; //leftarray pointer
        int j=0; //rightarray pointer
        for(;i<length;i++){
            if(i<middle){
                leftarray[i]=arr[i];
            }
            else{
                rightarray[j]=arr[i];
                j++;
            }
        }
        mergesort(leftarray);
        mergesort(rightarray);
        merge(leftarray, rightarray, arr);

    }
    private static void merge(int[] leftarray ,int[] rightarray,int[] array ){
        int leftSize = array.length/2;
        int rightSize=array.length-leftSize;
        int i=0;
        int l=0;
        int r =0;
        while (l<leftSize && r<rightSize) {
            if(leftarray[l]<rightarray[r]){
                array[i]=leftarray[l];
                i++;
                l++;
            }
            else{
                array[i]=rightarray[r];
                r++;
                i++;
            }
        }
        while (l<leftSize) {
            array[i]=leftarray[l];
            i++;
            l++;
        }
        while (r<rightSize) {
            array[i]=rightarray[r];
            i++;
            r++;
        }
    }
    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1};
        mergesort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
