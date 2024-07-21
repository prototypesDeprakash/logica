package DS_and_A.hashmapandarray;

public class missing_number {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9};
        int n = 9;
        int total_no=n*(n+1)/2;
        int we_got=0;
        for(int i=0;i<arr.length;i++){
            we_got+=arr[i];
        }
        int res=total_no-we_got;
        System.out.println(res);
    }
}
