package Dailysum.jan25;

public class minnoofoperationtomoveballs {

    private static void disp(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    private static int[] sol1(String s ){
        int[]arr = new int[s.length()];
        int x =0;
        for(char c : s.toCharArray()){
            if(c=='0'){
                arr[x]=0;
            }else{
                arr[x]=1;
            }
            x++;
        }

        int[]res = new int[s.length()];
        

        for(int i=0;i<s.length();i++){
            int ans=0;
            for(int j=0;j<s.length();j++){
                if(arr[j]!=0){
                    ans+=Math.abs(i-j);
                }
            }
            res[i]=ans;
        }
        return res;

    }

    public static void main(String[] args) {
        String s ="110";
        disp(sol1(s));

    }
}