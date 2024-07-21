
class Printer<T>{
    T thingstoprint;
    public Printer(T thingstoprint){
        this.thingstoprint=thingstoprint;
    }
   public void prints(){
        System.out.println(thingstoprint);
    }
}

public class genclas {
    public static void main(String[] args) {
        Printer<String>  prin = new Printer<>("hello");
        Printer<Integer> prin2 = new Printer<>(123);
        prin.prints();
        prin2.prints();
    }
    
}
