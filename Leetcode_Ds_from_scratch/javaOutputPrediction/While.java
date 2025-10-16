package Leetcode_Ds_from_scratch.javaOutputPrediction;

class Test1{
    Test1(int x){
        System.out.println("constructor called "+ x);
    }
}
public class While {
    Test1 t1 = new Test1(10);
    While(int i){Test1 t2= new Test1(i);}
    public static void main(String[] args) {
        While t2 = new While(20);
    }
}
