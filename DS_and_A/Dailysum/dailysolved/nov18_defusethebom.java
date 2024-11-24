package Dailysum.dailysolved;

public class nov18_defusethebom {
   
private static void disp(int[]arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
}
    private static int[] sol1(int[]arr ,int k){

        int siz = arr.length;
        int res[]= new int[siz];
       
       
            for(int i =0;i<arr.length;i++){
            if(k>0){
                for (int j = 1; j <=k; j++) {
                    res[i] += arr[(i + j) % siz];
                }
            }else if(k<0){
             for(int j=1;j<=-k;j++){
                            res[i]+=arr[(i-j+siz)%siz];
                        }
                    }
            }
            return res;
        
    
    }
    
    
      
    
    public static void main(String[] args) {
        int[]arr={5,7,1,4};
        int k=-3;
        disp(sol1(arr, k));

      
    }
}
