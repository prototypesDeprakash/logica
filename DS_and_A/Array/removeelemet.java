package Array;

public class removeelemet {
    public static void main(String[] args) {
        int [] a ={2,2,2,2,2,2,2,2,2,2,1,1,1,1,1};
        int target=2;
        int l=0;
        int r=a.length-1;
        int c=0;
        while (l<=r) {
            if(a[l]==target && a[r]!=target){
                c++;
                int temp=a[r];
                a[r]=a[l];
                a[l]=temp;
                l++;
                r--;
            }
           else if(a[l]==target){
            r--;
           }
           else{
            l++;
           }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.println(c);
    }
}
