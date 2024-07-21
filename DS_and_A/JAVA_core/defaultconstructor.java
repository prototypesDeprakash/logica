
public class defaultconstructor {
    defaultconstructor(){
        System.out.println("this is executed automatically when object is created");
       
    }
    void catname(){
        System.out.println("my cat name is pussy cat");
    }
    public static void main(String[] args) {
        defaultconstructor df = new defaultconstructor();
        df.catname();
    }
}
