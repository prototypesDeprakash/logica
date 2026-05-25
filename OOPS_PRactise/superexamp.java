public class superexamp {
    superexamp(){
        System.out.println("Parent class called");
    }

    public static void main(String[] args) {
        child c = new child();
    }
}
class child extends superexamp{
    child(){
        super();
        System.out.println("Child class called");
    }
}

