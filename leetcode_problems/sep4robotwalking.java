package leetcode_problems;

import java.util.Arrays;

public class sep4robotwalking {

    private static boolean obsfinder(int[][] obstaclearr , int[] target){
        for (int[] subArray : obstaclearr) {
            // Use Arrays.equals to compare the two arrays element by element
            if (Arrays.equals(subArray, target)) {
               return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        // coordinates

        int x =0, y=0 ;
        int[][] direct = {{0,1} ,  {1,0} , {0, -1},{-1,0}};
        int direction=0;
        int[] commands = {4,-1,4,-2,4};
        int[][]obstacles = {{2,4}};
        int dx,dy; // coordinates
        int res=0;
        // -2 = turn left  [left , right] // if -2 change left 
        //-1 = turn right  [left , right] //if -1 change right
        for (int c :commands){
            if(c==-1){
                direction=(direction+1)%4;
            }
            else if(c==-2){
                direction=(direction-1)%4;
            }
            else{
                dx = direct[direction][0];
                dy = direct[direction][1];

                for (int i=0;i<c;i++){
                int[] target = {x+dx,y+dy};


                    if(obsfinder(obstacles, target)){
                        break;
                    }
                    x+=dx;
                    y+=dy;

                }

            }
            res = (int) Math.max(res, x*x + y*y);
            

        }
        System.out.println(res);
        


    }
}