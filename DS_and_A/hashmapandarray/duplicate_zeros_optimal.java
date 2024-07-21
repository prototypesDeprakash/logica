package DS_and_A.hashmapandarray;
public class duplicate_zeros_optimal {
    public static void main(String[] args) {
        int arr[]={1,0,2,3,0,4,5,0};
        int zerocount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zerocount+=1;
            }
        }
        
        
        
        for (int i = arr.length-1, j = arr.length+zerocount-1;i>=0;i--,j-- ){
            if(j<arr.length){
                arr[j]=arr[i];
            }
            if(arr[i]==0){
                j--;
               if(j<arr.length){
                arr[j]=0;
               }
            }
        }
        for (int i:arr){
            System.out.print(i);
        }
    }
}
