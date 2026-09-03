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

    public boolean add(int value){
        if(size>=capacity){
            return false;
        }
        if(size<capacity){
            
            arr[size]=value;
            size++;
        }
        return true;
    }
    public boolean pop(){
        if(size==0){
            return false;
        }
        else{
            arr[--size]=0;
            
        }
        return true;
    }

    public boolean remove(int index){
        
        if(index>=size|| index<0){
            return false;
        }
        else{
            arr[index]=0;
            for(int i=index;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            size--;
            arr[size] = 0;

        }
        return true;
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
         
         //System.out.println(arr.get(0));
        // arr.display_array();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(80);
        arr.add(90);
        arr.add(100);
        //arr.add(120);
        arr.pop();
        arr.remove(8);
        arr.remove(1);
         System.out.println(arr.size());
         System.out.println(arr.Capacity());
         System.out.println("-----array Values ----");
         arr.display_array();
         
    }



}