
class animal{
    String name;
    animal(String name){
        this.name=name;
    }
    void displaysound(){
        System.out.println(name);
    }
}
 class dog extends animal {
    String breed;
    dog(String name , String breed){
        super(name);
        this.breed = breed;
    }

    void display(){
        System.out.println("Dog name"+ name+" breed "+ breed);
    }

    void displaysound(){
        super.displaysound();
        System.out.println("editing the superclass method");
    }

public static void main(String[] args) {
   dog d = new dog("Begal", "begal breed");
   d.displaysound();
   
    
}
    
}
