package Dailysum;

public class nov12 {

    //2d array sort based on item arr[0][0]
    private static int[][] sort2d(int[][]arr){
        int maxy=0;

        for(int i=0;i<arr.length-1;i++){
            int[][]temp = new int[1][1];
            int[][] temp2=new int[1][1];
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j][0]>arr[j+1][0]){
                    temp[0][0]= arr[j][0]; //swappitn item
                    temp2[0][0] = arr[j][1];  //swapping beauty

                    arr[j][0]=arr[j+1][0];
                    arr[j][1]=arr[j+1][1];

                    arr[j+1][0]=temp[0][0];
                    arr[j+1][1]=temp2[0][0];
                }
            }
            
        }
        return arr;

    }
    private static int[] sort(int[]arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }


    //2d arry display , just for debugging
    private static void array2ddisplay(int[][] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+" "+ arr[i][1]);
        }
    }
    //array display for debugging 
    private static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }



    //optimal solution 
    private  static int[] solution2(int[][] items , int[]queries){

        int[] ans = new int[queries.length];
        
        
        for(int i=0;i<queries.length;i++){
            int curmax=0;
            for(int j =0;j<items.length;j++){
                if(items[j][0] <= queries[i]){
                    curmax=Math.max(curmax, items[j][1]);
                }
            }
            ans[i]=curmax;
        }
        return ans;

    }

    //bruitforce solution ,, - TIME LIMIT EXCEEDED :( 
    private static int[] solution1(int[][] items ,int[] queries ){
        int[] ans = new int[queries.length];
        
        for(int i=0;i<queries.length;i++){
            int curmax=0;
            for(int j =0;j<items.length;j++){
                if(items[j][0] <= queries[i]){
                    curmax=Math.max(curmax, items[j][1]);
                }
            }
            ans[i]=curmax;
        }
        return ans;

        
    }

    public static void main(String[] args) {
        int[][] items ={{1,2},{3,2},{2,4},{5,6},{3,5}};
         int[] queries = {1,2,3,4,5,6};

       //  System.out.println(findmax(items));
       //System.out.println(solution1(items, queries));
        display(solution2(sort2d(items), sort(queries)));
       //display(sort(queries));
    }
}