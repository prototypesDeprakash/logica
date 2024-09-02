/**
 * sep2chalksum
 */
public class sep2chalksum {

    public static void main(String[] args) {
        int[] chalk = {3,4,1,2};
        int k=25;
        int i=0;
        while ( (true)) {
            if(k<=0){
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