public class merge_sort_2 {
    
    private static void merge_sort(int[]array){ //splitting left,right and then function call 
        
        int length=array.length;
        int middle= length/2;
        if(length<=1)return; //base case is important to stop the looping recursion
        int[] leftarrray = new int[middle];
        int[] rightarray = new int[length-middle];
        int i=0;
        int j=0;
        for(;i<length;i++) {
            if(i<middle){
            leftarrray[i]=array[i];
            }
            else{
                rightarray[j]=array[i];
                j++;
            }
        }
        merge_sort(leftarrray);
        merge_sort(rightarray);
        merge(leftarrray, rightarray, array);
    }
    private static void merge(int[] leftarray,int[] rightarray,int[]array){
        int leftarraysize = leftarray.length;
        int rightarraysize = rightarray.length;
        int i =0;
        int l =0 ;
        int r =0;
        //for sorting by combining left and right with the original array
        while (l<leftarraysize && r<rightarraysize) {
            if(leftarray[l]<rightarray[r]){
                array[i]=leftarray[l];
                i++;
                l++;
            }
            else{
                array[i]=rightarray[r];
                i++;
                r++;
            }
        }
        while (l<leftarraysize) {
            array[i]=leftarray[l];
            i++;
            l++;
        }
        while (r<rightarraysize) {
            array[i]=rightarray[r];
            i++;
            r++;
        }

    }
   public static void main(String[] args) {
    int[] a = {10,9,8,7,6,5,4,3,2,1};
    merge_sort(a);
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
   }


}
