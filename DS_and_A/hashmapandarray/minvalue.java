package DS_and_A.hashmapandarray;

public class minvalue {
    public static void main(String[] args) {
        int []arr={1,2,3,5,4,3,-33,-2,-232};
        int x = arr[0];
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]<x){
                x=arr[i];
            }
        }
        System.out.println(x);
    }
}
