public class defaultconstructor {

    public defaultconstructor(){
        System.out.println("hello mf");
    }
    public defaultconstructor(Integer n1, String n){
        System.out.println("Default constructor if parameter");
        System.out.println(n1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        defaultconstructor fd = new defaultconstructor();

    }
    
}