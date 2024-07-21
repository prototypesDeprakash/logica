package DS_and_A.hashmapandarray;

public class secondmaxvalue {
    public static void main(String[] args) {
        int[]arr={13,34,2,34,33,1}; 
        int firstmax=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstmax){
                secondmax=firstmax;
                firstmax=arr[i];
            }
            if(arr[i]>secondmax && arr[i]!=firstmax){
                secondmax=arr[i];

            }
           
        }
        System.out.println(secondmax);

    }
}
