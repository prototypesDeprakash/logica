    package Leetcode_Ds_from_scratch.array_and_string;

    import java.util.ArrayList;
    import java.util.Arrays;
import java.util.List;

import Shit_Skillrack.display;

    public class mergeIntrvals {

        private static void merge(int[][]arr){
            ArrayList<ArrayList<Integer>> mylist = new ArrayList<>();
            for(int i=1;i<arr.length;i++){
                if(arr[i-1][1] >= arr[i][0]){
                ArrayList<Integer> interval=new ArrayList<>();

                    interval.add(arr[i-1][0]);
                    interval.add(arr[i][1]);

                    mylist.add(interval);
                }else{
            ArrayList<Integer> interval=new ArrayList<>();
                    interval.add(arr[i][0]);
                    interval.add(arr[i][1]);
                    mylist.add(interval);
                }

            }
            System.out.println(mylist);

        
        }

        private static int[][] mergeintervals(int[][]arr){

            if(arr.length<=1){
                return arr;
            }
            List<int[]>result = new ArrayList<>();
            int[]newInterval = arr[0];
            result.add(newInterval);
            for(int[]interval : arr){
                if(interval[0]<=newInterval[1]){
                    //overlapping
                    newInterval[1]=Math.max(newInterval[1], interval[1]);
                }
                else{
                    newInterval=interval;
                    result.add(newInterval);
                }
            }
            return result.toArray(new int[result.size()][]);
        }


        private static int[][] mergeI(int[][]arr){
            Arrays.sort(arr,(a,b)->Integer.compare(a[0], b[0]));
            int[]newInterval = arr[0];
            List<int[]> myresult = new ArrayList<>();
            for(int[]interval : arr){
                if(interval[0]<=newInterval[1]){
                    newInterval[1]=Math.max(newInterval[1], interval[1]);
                }else{
                    newInterval=interval;
                    myresult.add(newInterval);
                }
            }
            return myresult.toArray(new int[myresult.size()][]);

        }
        public static void main(String[] args) {
            int[][]arr={{1,3},{8,10},{15,18},{2,6}};
          //  int[][]arr={{1,4},{4,5}};
            Arrays.sort(arr,(a,b)->Integer.compare(a[0], b[0]));
            display.display2D(mergeintervals(arr));
        // display.display2D(arr);
        }   
    }
