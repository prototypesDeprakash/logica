package Dailysum.jan25;

import java.util.ArrayList;

public class spiralmatrix {

    private static int[] sol1(int[][]arr){
        int top = 0;
        int bottom = arr.length-1;
        int left=0;
        int right = arr[0].length-1;

        int direction = 0;
        ArrayList <Integer> ans = new ArrayList<>();

        while(top<=bottom && left<=right){
            if(direction==0){
                for(int i=left;i<=right;i++){
                   // System.out.println(arr[top][i]);
                    ans.add(arr[top][i]);
                }
               /// direction=1;
                top++;
            }
           
           
            if(direction==1){
                for(int i=top;i<=bottom;i++){
                   // System.out.println(arr[i][right]);
                  ans.add(arr[i][right]);
                }
                //direction=2;
                right--;
            }
            
            if(direction==2){
                for(int i=right;i>=left;i--){
                   // System.out.println(arr[bottom][i]);
                    ans.add(arr[bottom][i]);
                }
              //  direction=3;
                bottom--;
            }
           
            if(direction==3){
                for(int i=bottom;i>=top;i--){
                    //System.out.println(arr[i][left]);
                    ans.add(arr[i][left]);
                }
               // direction=0;
                left++;
            }
            direction=(direction+1)%4;

            
            
        }
        int[] finans = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            finans[i]=ans.get(i);
        }
        return finans;
    }
    public static void main(String[] args) {
        int[][]arr ={{1,2,3},{4,5,6},{7,8,9}};
        sol1(arr);
    }
}
