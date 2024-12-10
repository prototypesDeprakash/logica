package Dailysum.dailysolved.December;



public class dec9 {



    private static boolean torf(int[]arr , int start , int end){
        boolean res=true;
        for(int i =start;i<end;i++){
            if(arr[i]%2!=arr[i+1]%2){
                res=true;
            }else{
                return false;
                
            }
        }
        return res;
        
    }


    private static boolean[] sol1(int[]arr , int[][] queries){
        boolean[]res=new boolean[queries.length];
        for(int i=0;i<queries.length;i++){
            res[i]=torf(arr, queries[i][0], queries[i][1]);
        }

        return res;

    }


    private static void testdisp(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    /*
     * for(int j=i;j<queries[0].length;j++){
                res[0]=torf(arr, queries[j][0], queries[j][1]);
                System.out.println(queries[j][0] +" "+queries[j][1] );
            }
     */


     private static int[] prefixarr(int[]arr){
        int[]pref=new int[arr.length];
       pref[0]=1;
        for(int i=1;i<arr.length;i++){
            if ((arr[i] &1)==(arr[i-1]&1)) {
                pref[i]=1;
            }else{
                
                pref[i]=1+pref[i-1];
            }
        }
        return pref;
     }
private static boolean[] prefixsumsol(int[]arr , int[][]querry,int[]prefix){
    boolean []res =new boolean[querry.length];
    for(int i=0;i<querry.length;i++){
        int start = querry[i][0];
        int end= querry[i][1];
        int siz = end-start+1;
        if(prefix[end]>=siz){
            res[0]=true;
        }else{
            res[0]=false;
        }

    }
    return res;

}
    public static void main(String[] args) {
        int[]arr={7,3,4,3,2,9,5,6,3,6,8,5};
        int [][]queries= {{1,3},{0,3},{2,4}};
        //sol1(arr, queries);
        //System.out.println(torf(arr, 2, 4));
        testdisp(prefixarr(arr));
    }
}