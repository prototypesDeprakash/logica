package DS_and_A.craking_CI.chapter1_array;

/**
 * removeduplicatecharacter
 */
public class removeduplicatecharacter {
   public static boolean uniqchar(String s) {
    boolean[] charset = new boolean[256];
    for(int i=0;i<s.length();i++){
     int num = s.charAt(i);
     if(charset[num]){ //check if value is already in the valueth index
        return false;
     }
     charset[num] = true;
    

    }
    return true;
   }

   public static void main(String[] args) {
    System.out.println(uniqchar("afbcdef"));
   }

}