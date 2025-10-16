package Leetcode_Ds_from_scratch.javaOutputPrediction;



abstract class  parent {
abstract void show();
    

void eat(){
    System.out.println("hello");
}
    
}

class Child extends parent{
    
    void show(){
        System.out.println("Showing form child");
        
    }
     void eat(){
        show();
        System.out.println("eating from child");
    }
}
public class abstractstudy {


    public static void main(String[] args) {
        parent p = new Child() ;
        p.eat();
            
        
    }
}