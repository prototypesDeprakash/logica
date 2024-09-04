/**
 * sep2chalksum
 */
public class sep2chalksum {

    public static void main(String[] args) {
        int[] chalk = {5,1,5};
        int k=22;
        int i=0;
        while ( (true)) {
            if(k<chalk[i]){
                
                break;
            }
           
            k=k-chalk[i];
            i++;
            if(i==chalk.length){
                i=0;
            }
            
          //  System.out.println("i value = "+ i);
            
        }
        //int result = (i == 0) ? i : i - 1;
        System.out.println( i);
        
    }
    
}