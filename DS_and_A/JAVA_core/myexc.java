
class myexception extends Exception{
    myexception(String message){
        super(message);
    }
}

public class myexc {
    static void checkage(int age) throws myexception
{
    if(age>100){
        throw new myexception("how the fuck");
    }
    else{
        System.out.println("good , you are normal but die soon");
    }
}
    public static void main(String[] args) {
        try{
            checkage(1001);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
