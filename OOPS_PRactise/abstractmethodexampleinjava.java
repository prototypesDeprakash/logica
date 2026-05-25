

abstract class shape {

abstract void draw ();
void display(){
    System.out.println("This is a shape");
}    

}

class circle extends shape{
    @Override
    void draw(){
        System.out.println("Drawing circle");
    }
}
public class abstractmethodexampleinjava {
    public static void main(String[] args) {
        shape s = new circle();
        s.draw();
        s.display();
    }
}
