public class manyconstructor {
    String Name;
    int age;


    public manyconstructor(String Name ){
        this.Name = Name;
    }
    //Default constructor 
    public manyconstructor(){
    
        this("DefaultName");
        System.out.println(this.Name);
    }
    public static void main(String[] args) {
        manyconstructor c=new manyconstructor();
    }
}
