
public class staticmethosexample {
    static int counter=0; //static variavle (allocated memory only once)
    public static void adder(){
        counter++;
    }

    public static void main(String[] args) {
        staticmethosexample.adder(); //we can directly call the class without creating the object 
    }
}
