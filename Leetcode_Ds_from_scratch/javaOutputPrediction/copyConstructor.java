package Leetcode_Ds_from_scratch.javaOutputPrediction;

class complex{
    int x;
    int y;
    complex(){
        
        x=10;
        y=10;
    }
    public String toString(){
        return "("+x+" y= "+y;
    }
     complex(complex c) { 
        x = c.x; 
        y = c.y; 
    } 
}

public class copyConstructor {
    private static void res(Object o){
        System.out.println("object");
    }
    private static void res(String s){
        System.out.println("string");
    }
    private static void res(int s ){
        System.out.println("int");
    }
    public static void main(String[] args) {
    
        res(null);
        
    }
}
