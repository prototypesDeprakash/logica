package JavaFundaMentalsProject.Calculator;

public class calculator {
    public static int Add(int a , int b){
            return a+b;
    }
    public int Sub(int a , int b){
            return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a , int b){
        return a/b;
    }


}

class mainmethod{
    public  void main(String[] args) {
        main m = new main();
       m.System.out.println( calculator.Add(1, 3));
        calculator c = new calculator();
       System.out.println( c.Sub(2, 1));
       System.out.println(c.div(5, 5));
       System.out.println(c.mul(4, 353));

    }
}
