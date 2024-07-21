
/**
 * basic
 */
package matrix;

import java.util.ArrayList;

public class basic {

    public static void main(String[] args) {
    ArrayList<Integer> result = new ArrayList<>();
       int a[][]={{1,2,3,4},{2,3,4,5},{2,3,4,5}};
       int n=a.length;
       int m = a[0].length;

        int up = 0;
        int down = n-1;
        int left = 0;
        int right = m-1;

        while (result.size()<m*n ){
            for(int i=left;i<=right && result.size()<n*m;i++){
                result.add(a[up][i]);
            }
            up++;
            for(int i=up+1;i<=down-1 && result.size()<n*m;i++){
                result.add(a[i][right]);
            }
            right--;

            for(int i=right;i>=left && result.size()<n*m;i++){
                result.add(a[down][i]);
            }
            down--;
            for(int i=down-1;i>=up+1&& result.size()<n*m;i++){
                result.add(a[i][left]);
            }
            left++;
            
        }
        System.out.println(result);

       }
    }
