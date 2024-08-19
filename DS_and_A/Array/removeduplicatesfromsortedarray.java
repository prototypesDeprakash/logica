package Array;

public class removeduplicatesfromsortedarray {
    public static void main(String[] args) {
        int [] a = {1,1,1,2,2,2,3,3,3};
        int i=0;
        int j=1;
        
        while (j<a.length) {
            
            if(a[j]!=a[i]){
                i++;
                a[i]=a[j];
                
            }
            j++;
            
            //j++;
        }
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]);
        }
    }
}
