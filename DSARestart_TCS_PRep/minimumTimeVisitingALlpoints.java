package DSARestart_TCS_PRep;

import java.util.ArrayList;

public class minimumTimeVisitingALlpoints {
private static int sol1(int[][]arr){
  
    int res=0;
    for(int i=1;i<arr.length;i++){
       int x = Math.abs(arr[i-1][0] - arr[i][0]);
       int y = Math.abs(arr[i-1][1]-arr[i][1]);
       res+=Math.max(x, y);

    }
    return res;
    
}
    public static void main(String[] args) {
        int[][]arr={{1,1},{3,4},{-1,0}};
        System.out.print(sol1(arr));
    }
}