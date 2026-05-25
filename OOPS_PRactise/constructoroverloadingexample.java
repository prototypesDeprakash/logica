
class summy{

    //constructor over loading
    summy(int a , int b){
        System.out.println(a+b);
    }
    summy(){
        System.out.println("no value to sum");
    }
    summy(int a , int b  , int c){
        System.out.println(a+b+c);
    }
}

public class constructoroverloadingexample {


    public static void main(String[] args) {
        summy s = new summy();
        summy  s2= new summy(1,2,3);
        summy s3 = new summy(1,2);
    }
}
