package Dailysum.feb;

public class anag {
    private static void sol1(){
        int n=-2;
        int[]arr = {-1,-2,3,4,-3,1};
        for(int i=0 ;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == n){
                    System.out.println(arr[i]);
                    System.out.println(arr[j]);
                    System.out.println("true");
                }
            }
        }
    }

private static boolean sol2(String s1, String s2){
    if(s1.length()!=s2.length()){
        return false;
    }
    int[]freqarr1=new int[26];
    int[]freqarr2=new int[26];
    for(int i=0;i<s1.length();i++){
        freqarr1[s1.charAt(i)-'a']++;  //light
        freqarr2[s2.charAt(i)-'a']++;  //ightl
    }
    for(int i=0;i<freqarr1.length;i++){
        if(freqarr1[i]!=freqarr2[i]){
            return false;
        }
    }
    return true;

}
    public static void main(String[] args) {
       
       System.out.println(sol2("solid","lir43os"));    }

       //abc   bac 
       //a=13 . b=2 . c=3
}
