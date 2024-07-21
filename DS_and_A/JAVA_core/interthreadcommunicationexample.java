
class customer{
    int amount =1000;
    synchronized void withdraw(int amount){
        System.out.println("GO to withdrawl");


        if(this.amount<amount){
            try{
                wait();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        this.amount-=amount;
        System.out.println("withdrawed successfully");

    }
    synchronized void deposit(int amount){
        System.out.println("going to depsit");
        this.amount+=amount;
        System.out.println("successfully peopsited");
        notify();
    }


}

public class interthreadcommunicationexample {

    public static void main(String[] args) {
        customer c = new customer();
        Thread withrawl = new Thread(()->c.withdraw(2000)); 
        Thread deposits = new Thread(()->c.deposit(10000));
        withrawl.start();
        deposits.start();
        System.out.println(c.amount);
    }
}
