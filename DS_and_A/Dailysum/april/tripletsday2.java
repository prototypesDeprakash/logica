package Dailysum.april;

public class tripletsday2 {

    private static int sol1(int[]arr){
        int mymax=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if((i<j)&&(j<k)&&(i<k)){
                        mymax=Math.max(mymax, (arr[i]-arr[j])*arr[k]) ;
                    }
                }
            }
        }
        return mymax;
    }
    private  static void optimal(int[]arr){
        int maxneeded=Integer.MIN_VALUE;
        int maxIndex=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxneeded) {
                maxneeded = arr[i];
                maxIndex = i; // Store the index of the maximum value
            }
        }
        int lessneeded= Integer.MAX_VALUE;

        int maxIndex2=-1;
        if (maxIndex2 == -1) return 0; // No valid `j`
        for(int i=maxIndex+1;i<arr.length;i++){
            if(arr[i]<lessneeded){
                lessneeded=arr[i];
                maxIndex2=i;
            }
            //lessneeded=Math.min(lessneeded, arr[i]);
        }
        int finalmax=0;

        for(int i=maxIndex2+1;i<arr.length;i++){
            finalmax=Math.max(finalmax, (maxneeded - lessneeded)*arr[i]);
        }
        System.out.println(finalmax);
        
    }

    public static void main(String[] args) {
        int[]arr ={1,10,3,4,19};
            if(sol1(arr)>0){
                System.out.println(sol1(arr));
            }else{
                System.out.println(0);
            }
            optimal(arr);
    }
}