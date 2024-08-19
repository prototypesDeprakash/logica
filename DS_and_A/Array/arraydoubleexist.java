package Array;

public class arraydoubleexist {
    public static void main(String[] args) {
        /*
    Input: arr = [10,2,5,3]
    Output: true
E   xplanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]


         */

         int [] a = {7,1,14,11};
         for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]*2 || a[i]*2 ==a[j]){
                    System.out.println("yes");
                }
            }
         }
    }
}
