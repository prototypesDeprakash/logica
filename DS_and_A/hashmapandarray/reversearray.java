package DS_and_A.hashmapandarray;

public class reversearray {
    public static void main(String[] args) {
        int[]arr ={8,3,4,1,2,44,56,9,3,2};
        int i =0;
        int j =arr.length-1;
        while (i<j){
            int y = arr[i];
            arr[i]=arr[j];
            arr[j]=y;
            i++;
            j--;
        }
        for(int c: arr){
            System.out.print(c+" ");
        }

    }
}
