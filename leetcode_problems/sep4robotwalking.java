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

/*
 * A robot on an infinite XY-plane starts at point (0, 0) facing north. The robot can receive a sequence of these three possible types of commands:

-2: Turn left 90 degrees.
-1: Turn right 90 degrees.
1 <= k <= 9: Move forward k units, one unit at a time.
Some of the grid squares are obstacles. The ith obstacle is at grid point obstacles[i] = (xi, yi). If the robot runs into an obstacle, then it will instead stay in its current location and move on to the next command.

Return the maximum Euclidean distance that the robot ever gets from the origin squared (i.e. if the distance is 5, return 25).

Note:

North means +Y direction.
East means +X direction.
South means -Y direction.
West means -X direction.
There can be obstacle in [0,0].
 
 */