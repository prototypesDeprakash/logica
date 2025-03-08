package Dailysum.march;

import Dailysum.feb.maximumAscendingSubarray;

public class minimumrecolorstogetkblacks {

    private static int sol1(String blocks,int k ){
        int maxneed=0;
        int c=0;
        if(blocks.length()==k){
            for(int i=0;i<k;i++){
                if(blocks.charAt(i)=='W'){
                    c++;
                }
            }
            return c;
        }
        for(int i=0;i<blocks.length()-k;i++){
            for(int j=i;j<k+i;j++){
               // System.out.println(blocks.charAt(j));
                if(blocks.charAt(j)=='W'){
                    c++;
                }
                //System.out.println(c);
            }
            maxneed=Math.min(maxneed,c);
            c=0;
        }
        return maxneed;
    }

    public static void main(String[] args) {
        String blocks = "BWWWBB";
        int k=6;
       // System.out.println(sol1(blocks, k));
       sol1(blocks, k);
    }
}