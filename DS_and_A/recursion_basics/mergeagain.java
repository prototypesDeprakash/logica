import Dailysum.DigitalBasics.primeNumber;
import recursion_core.arraysorted;

public class mergeagain {



    private static void merge_Sort(int[]arr){
        int length=arr.length;
        int middle= length/2;
        int[]leftarray=new int[middle];
        int[]rightarray = new int[length-middle];
        int i=0;
        int j=0;
        for(;i<length;i++){
            if(i<middle){
                leftarray[i]=arr[i];
            }else{
                rightarray[j]=arr[i];
                j++;
            }

        }
        merge_Sort(leftarray);
        merge_Sort(rightarray);
        merge(leftarray,rightarray,arr);
    }
    private static void merge(int[]leftarray , int[]rightarray , int[]array){
        int leftSize =array.length/2;
        int rightSize = array.length-leftSize;
        int i=0;
        int l=0;
        int r=0;

        while (l<leftSize && r<rightSize) {
            if(leftarray[l]<rightarray[r]){
                array[i]=leftarray[l];
                i++;
                l++;
            }else{
                array[i]=rightarray[r];
                i++;
                r++;
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
    
    }
}