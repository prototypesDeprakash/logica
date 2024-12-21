public class DynamicArray {

    private int[] arr;
    private int length;
    private int capacity;

    DynamicArray(int capacity){
        this.capacity=capacity;
        this.length=0;
        this.arr=new int[this.capacity];
    }
    private int get(int i){
        return arr[i];
    }
    private void set(int i , int n){
        arr[i]=n;
    }
    private void pushback(int n ){
        if(length==capacity){
            resize();
        }
        arr[length]=n;
        length++;
    }
    private int popback(){

        if(length>0){
            length--;
        }
        return arr[length];
    }
    private void resize(){
        capacity*=2;
        int[] newarr= new int[capacity];
        for(int i=0;i<arr.length;i++){
            newarr[i]=arr[i];
        }
        arr=newarr;
    }
    private int getSize(){
        return arr.length;
    }
    private int getCapacity(){
        return capacity;
    }


    public static void main(String[] args) {
        
    }
}