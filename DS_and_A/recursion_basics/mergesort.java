public class mergesort {

    private static void merge_sort(int [] arr){
        int length = arr.length;
        int middle = length/2;
        if(length<=1) return;
        int[] leftarr= new int[middle];
        int [] rightarr = new int[length-middle];
        int i=0;
       int j=0;
       for(;i<length;i++){
        if(i<middle){
            leftarr[i]=arr[i];
        }
        else{
            rightarr[j]=arr[i];
            j++;
        }
       }
      merge_sort(leftarr);
      merge_sort(rightarr);
      merge(leftarr , rightarr , arr);
               
    }
    private static void merge(int[]leftarr,int[]righarray,int[]array){
        int leftsixe =leftarr.length;
        int rightsize = righarray.length;
        int i=0;
        int l=0;
        int r=0;
        while (l<leftsixe && r< rightsize) {
                if(leftarr[l]<righarray[r]){
                    array[i]=leftarr[l];
                    i++;
                    l++;

                }
                else{
                    array[i] = righarray[r];
                    i++;
                    r++;

                }

        }
        while (l<leftsixe) {
            array[i]=leftarr[l];
            i++;
            l++;
        }
        while (r<rightsize) {
            array[i]=righarray[r];
            i++;
            r++;
        }
    }
    public static void main(String[] args) {
        int arr[]={4,231,66,44,7,23,95,2,1};
        merge_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
