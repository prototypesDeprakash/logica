package Dailysum.feb;

public class numberofsubarrwithoddsum {


    private static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
   private static void sol1(int[]arr){
    int total=0;
    int evencount=1;
    int oddcount=0;
    int ps=0;
    int[]prefixsum=new int[arr.length];
    //prefixsum[0]=arr[0];
    for(int i=0;i<arr.length;i++){
       // prefixsum[i]+=arr[i]+prefixsum[i-1];
       ps+=arr[i];
        if(ps%2!=0){
            total+=evencount;
            oddcount++;      
        }else{
            total+=oddcount;
            evencount++;
        }
    }
    display(prefixsum);
    System.out.println(total);


   }
    public static void main(String[] args) {
        int[]arr ={1,3,5};
        sol1(arr);
       
    }
}