package zoho_patterns;

import Shit_Skillrack.display;

public class sort3 {

    private static void sol1(int[]arr){
        int zero =0;
        int one=0;
        int two=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            if(arr[i]==1){
                one++;
            }
            if(arr[i]==2){
                two++;
            }
        }
        int c=0;
        for(int i=0;i<zero;i++){
            arr[c]=0;
            c++;
        }for(int j=0;j<one;j++){
            arr[c]=1;
            c++;
        }for(int k=0;k<two;k++){
            arr[c]=2;
            c++;
        }
        display.display1D(arr);
    }
    public static void main(String[] args) {
        int[]arr={1,0,2,0,1,0,2};
        sol1(arr);
    }
}
