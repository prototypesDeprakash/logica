package DS_and_A.hashmapandarray;

public class removeeven {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,9,11};
        int oddcount=0;
        for (int i:arr){
            if(i%2!=0){
                oddcount++;
            }
        }
        int[] res = new int[oddcount];
        int j=0;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]%2!=0){

                res[j]=arr[i];
                j++;
            }
        }

        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
