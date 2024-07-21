// Java program to show working of user defined
// Generic functions

class test{
    static <T> void displayanyvalue(T value){
        System.out.println(value);
    }
}
/**
 * genericeinjava
 */
public class genericeinjava {

    public static void main(String[] args) {
        test t = new test();
        t.displayanyvalue("hello");
    }
}