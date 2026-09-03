package A_Product_company_prep.HowToArray;


public class Myarray {

    private int[] arr;
    private int size;
    private int capacity;

    //initializing the array based on the constructor
    public Myarray(int capacity){
        this.capacity= capacity;
        arr= new int[capacity];
        size=0;
    
    }


    public void display_array(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public int get(int index){
        return arr[index];
    }
    public void set(int index , int value){
        arr[index]=value;
        
    }
    public int size(){
       
        return size;
    }
    public int Capacity(){
        return capacity;
    }
   


    
    public static void main(String[] args) {
         Myarray arr = new Myarray(10);
         arr.set(0,99);
         arr.set(1,100);
         arr.set(2,101);
         arr.set(3,102);
         //System.out.println(arr.get(0));
         arr.display_array();
         System.out.println(arr.size());
         System.out.println(arr.Capacity());
         
    }



}