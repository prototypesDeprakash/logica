

class animal{

    void makesound(){
        System.out.println("animal make sound");
    }
}

class dog extends animal{
    void makesound(){
        System.out.println("dog barks");
    }
}
class cat extends animal{
    void makesound(){
        System.out.println("Cat meows");
    }
}

public class dynamicdspatch {
public static void main(String[] args) {
    animal a1 = new dog();
    animal a2 =new cat();
    animal a3 = new animal();

    a1.makesound();
    a2.makesound();
    a3.makesound();
}
    
}