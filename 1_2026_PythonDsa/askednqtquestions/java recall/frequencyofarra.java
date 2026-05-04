import java.util.*;
public class frequencyofarra {
    public static void main(String[]args){

        HashMap<Integer, Integer> mymap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int highfreq = Integer.MIN_VALUE;
        
        for (int i : arr){
            
            mymap.put(i, mymap.getOrDefault(i,0)+1);
        }

        for(int i:arr){
            highfreq= Math.max(highfreq,mymap.get(i));
        }
         for (Map.Entry<Integer, Integer> entry : mymap.entrySet()) {
            if (entry.getValue() == highfreq) {
                System.out.print(entry.getKey() + " ");
            }
        }
        
    }
}
