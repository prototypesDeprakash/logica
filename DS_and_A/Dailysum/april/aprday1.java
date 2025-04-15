package Dailysum.april;

public class aprday1 {

    private static int sol1(int[][]arr){
        int mx=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j+=arr[j][1]+1){
                //System.out.print(arr[j][0]);
                c+=arr[j][0];
               
            }
            mx=Math.max(mx,c);
            c=0;
            //System.out.println();
        }
        return mx;
    }
//top down approach
            private static int dp_top_down(int i,int[][]arr){
                int[]cache = new int[arr.length];
                if(i>=arr.length) return 0;
                if (cache[i]!=0) {
                    return cache[i];
                }
                int points = arr[i][0];
                int brainpower = arr[i][1];
                cache[i] =Math.max(dp_top_down(i+1, arr), points+dp_top_down(brainpower+i+1, arr));
                return cache[i];
            }
    public static void main(String[] args) {
        
        int[][]questions = {{1,1},{2,2},{3,3},{4,4},{5,5}};
        //int[][]questions = {{3,2},{4,3},{4,4},{2,5}};

        System.out.println(dp_top_down(0, questions));
        //System.out.println("Hello world");
    }
}