



class myexception extends Exception{
public myexception(String message){
    super(message);
}


}


public class exceptionuserdefined {
   public static void checkpedos(int age) throws myexception{
        if(age<10){
            throw new myexception("you pedo");
        }
        else{
            System.out.println("good boi");
        }
    }
    public static void main(String[] args) {
        try{
            checkpedos(9);
        }catch(myexception e){
            System.out.println(e);
        }
    }
}
