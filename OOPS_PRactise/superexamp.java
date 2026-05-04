public class superexamp {
    superexamp(){
        System.out.println("Parent class called");
    }
}
class child extends superexamp{
    child(){
        super();
        System.out.println("Child class called");
    }
}
