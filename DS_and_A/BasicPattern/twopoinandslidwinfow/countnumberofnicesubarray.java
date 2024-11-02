package BasicPattern.twopoinandslidwinfow;

public class countnumberofnicesubarray {
    private static int solutionworking1(int[]arr , int k){ //time limit exceededs
        int c=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]%2!=0){
                    sum+=1;
                }
                if(sum==k){
                    c++;
                }
            }
        }
        return c;
    }
    private static void solution1(int[]arr , int k){
        int c=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]%2!=0){
                    sum+=arr[j];
                }
                if(sum==k){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        int[]arr ={2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        solution1(arr, k);
    }
}
