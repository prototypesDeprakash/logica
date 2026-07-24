/**
 * CreatingAnArray
 */
package A_Product_company_prep.HowToArray;

class Array{
        private int[]arr;
        private int size;
        private int capacity;


        public Array(int capacity){
            this.capacity = capacity;
            arr=new int[capacity];
            size=0;
        }   

        public int get(int index){
            if(index<0 || index>size){
                System.out.println("Get failed : invalid index");
                return -1;
            }
            return arr[index];
        }
    }


public class CreatingAnArray {
public static void main(String[] args) {
   Array a = new Array(5);
    System.out.println();
}
    
}