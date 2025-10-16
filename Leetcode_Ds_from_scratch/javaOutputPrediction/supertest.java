package Leetcode_Ds_from_scratch.javaOutputPrediction;


abstract class test{
   void  play(){};   
}
 class test2 extends test{
   void play(){};
}
class A{
    void show(){
        System.out.println("Showing from A");
    }
}
class B extends A{
   
    void show(){
        super.show();
        System.out.println("Showing form B");
    }
}
class c extends B{
    
    void show(){
        super.show();
        System.out.println("Showing from C");
    }
}
public class supertest {
    public static void main(String[]args){
        A a =new c();
        a.show();
        float f = 3.3f;
        double d = 32.32;
        System.out.println(d);
       
    }
}
