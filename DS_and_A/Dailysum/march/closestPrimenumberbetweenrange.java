package Dailysum.march;

import java.util.ArrayList;
import java.util.Comparator;

import Skillrack.display;

public class closestPrimenumberbetweenrange {

    private static boolean isprimenumber(int n){
        int flag=0;
        
        for(int i=2;i<n;i++){
            if(n==1){
                flag=2;
                break;
            }
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
           return false;
        }else if(flag==2){
            return false;
        }
        else{
           return true;
        }
    }

    private static int[] sol1(int left , int right){
        ArrayList<Integer> pnums= new ArrayList<>();
        for(int i=left ;i<=right;i++){
            if(isprimenumber(i)){
                pnums.add(i);
            }
        }

       // pnums.sort(Comparator.naturalOrder());
        int[]pair = new int[2];
        if (pnums.size() < 2) {
            return new int[]{-1, -1};
        }
        int min=Integer.MAX_VALUE;
        int diff=0;
        for(int i=0;i<pnums.size()-1;i++){
            diff=pnums.get(i+1)-pnums.get(i);
            if(diff<min){
                min=diff;
                pair[0]=pnums.get(i);
                pair[1]=pnums.get(i+1);
            }
        }
        
    public static void main(String[] args) {
        int left=10;
        int right=19;
        sol1(left, right);
    }
}