import java.util.Arrays;

/**
 * subarray_101
 */
public class subarray_101 {

    public static void main(String[] args) {
        int[]a1={10, 5, 2, 23, 19};
        int  a2[]={19, 5, 3};
        Arrays.sort(a1);
        Arrays.sort(a2);
        int n= a1.length;
        int m = a2.length;
        int i=0;
        int j =0;
        while (i<n && j <m) {
            if(a1[i]<a2[j]) {//no problem
                i++;
            }
            else if(a1[i]==a2[j]){ //no problem
                i++;
                j++;
            }
            else{//a1[i]>a2[j] means the value is not there
                System.out.println("No");
                System.exit(0);
            }
        }

        if(j==m){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}