package Dailysum.march;

public class prob1 {
    private static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static int[] movezeros(int[]arr){
       int z=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            z++;
       }
       }
       int[]temp = new int[arr.length];
       for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            temp[i]=arr[i];

        }
       }
       return temp;

    }
    private static int[] sol1(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                arr[i]*=2;
                arr[i+1]=0;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        display(movezeros(sol1(arr)));
        //display(sol1(arr));
       // movezeros(sol1(arr));

    }
}
