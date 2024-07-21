package DS_and_A.hashmapandarray;


/*Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4] */

public class duplicate_zeros {
    public static void main(String[] args) {
        int arr[]={1,0,2,3,0,4,5,0};
        int zerocount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zerocount+=1;
            }
        }
        int l = arr.length+zerocount;
        int arr2[]= new int[l];
        int p1=0;
        int p2=0;
        
        while (p1<arr.length) {
            arr2[p2]=arr[p1];
            if(arr[p1]==0){
                arr2[p2]=0;
                p2+=1;
                arr2[p2]=0;
                
            }
            p1+=1;
            p2+=1;
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=arr2[i];
        }
        
        
    }
}
