

class myexcep extends Exception{
    public myexcep(String message){
        super(message);
    }
}

public class excepusd2 {
   public static void checkage(int age) throws myexcep{
        if(age>10)  {
            throw new myexcep("you are not a pedo");
        }
        else{
            System.out.println("wtf ! you are a pedo");
        }
    }
    
    public static void main(String[] args) {
        try{
           checkage(9); 
        }catch(myexcep e){
            System.out.println(e);
        }
    }
}
