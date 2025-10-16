package Leetcode_Ds_from_scratch.javaOutputPrediction;
import static java.lang.System.*;
public class CONSTRUCTORcalls {
    class students{
        String name;
        int age;
        students(){
            this("noone", 0);
            System.out.println("hello default constructor here");
        }
        students(String name, int age){
            this.name=name;
            this.age=age;
            System.out.println("parametrized constructors "+name+" "+age);
        }
        void hello(){
            System.out.println("helo");
        }
    }
    public static void main(String[] args) {
        CONSTRUCTORcalls cs = new CONSTRUCTORcalls();
       students s = cs.new students();
        out.println("no static required");
        //System.err.println(s.age);
    }
}
