class  A extends Thread{ 
    public void run(){
        synchronized(this){
            for(int i=0;i<10;i++){
                System.out.println(i);
            }
        }
    
  }
}
 class B extends Thread{
     synchronized public void run(){
        for (int j=0;j<10;j++){
            System.out.println(j);
        }
    }
    
}
public class threadsync{
    public static void main(String[] args) {
        System.out.println("Hello");
        Thread a1 = new A();
        a1.start();
        
 
    }
}
