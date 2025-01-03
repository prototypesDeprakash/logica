package Dailysum.jan25;

public class wordandquerry {
    
    private static boolean isVovel(String s){
    int start =0;
    int end= s.length()-1;

    if((s.charAt(start)=='a'||s.charAt(start)=='e'||s.charAt(start)=='i'||s.charAt(start)=='o'||s.charAt(start)=='u') && s.charAt(end)=='a'||s.charAt(end)=='e'||s.charAt(end)=='i'||s.charAt(end)=='o'||s.charAt(end)=='u'){
        return true;
    }
    return false;

    }
    private static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void prefixsum(String[]words , int[][] queries){

        int[]prefixsumarr = new int[words.length+1];
        prefixsumarr[0]=0;
        for(int i=0;i<words.length;i++){
            if(isVovel(words[i])){
                prefixsumarr[i+1]=1+prefixsumarr[i];
            }else{
                prefixsumarr[i+1]=prefixsumarr[i];
            }
        }

        //display(prefixsumarr);
        int[] res = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            int resval = prefixsumarr[end+1]-prefixsumarr[start];
            res[i]=resval;
        }
       // display(res);
    }
    private static int[] sol1(String[]words , int[][] queries){
        int start =0;
        int end=0;
        int[]arr = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            start=queries[i][0];
            end=queries[i][1];

            for(int j=start;j<=end;j++){
                if(isVovel(words[j])){
                    arr[i]++;
                }
                //System.out.print(words[j]+" ");
            }
            //System.out.println("-------");


        }
        return arr;
    }
    public static void main(String[] args) {
      //  String[] words  =   {"bzmxvzjxfddcuznspdcbwiojiqf","mwguoaskvramwgiweogzulcinycosovozppl","uigevazgbrddbcsvrvnngfrvkhmqszjicpieahs","uivcdsboxnraqpokjzaayedf","yalc","bbhlbmpskgxmxosft","vigplemkoni","krdrlctodtmprpxwditvcps","gqjwokkskrb","bslxxpabivbvzkozzvdaykaatzrpe","qwhzcwkchluwdnqjwhabroyyxbtsrsxqjnfpadi","siqbezhkohmgbenbkikcxmvz","ddmaireeouzcvffkcohxus","kjzguljbwsxlrd","gqzuqcljvcpmoqlnrxvzqwoyas","vadguvpsubcwbfbaviedr","nxnorutztxfnpvmukpwuraen","imgvujjeygsiymdxp","rdzkpk","cuap","qcojjumwp","pyqzshwykhtyzdwzakjejqyxbganow","cvxuskhcloxykcu","ul","axzscbjajazvbxffrydajapweci"};
       // int[][] quereis = {{4, 4},{6, 17},{10, 17},{9, 18},{17, 22},{5, 23},{2, 5},{17, 21},{5, 17},{4, 8},{7, 17},{16, 19},{7, 12},{9, 20},{13, 23},{1, 5},{19, 19}};
    String[]words = {"aba","bcb","ece","aa","e"};
    int[][] queries ={{0,2},{1,4},{1,1}};
        prefixsum(words, queries);
       // System.out.println(isVovel(words[4]));
       //display(sol1(words, quereis));
    }
}
