// package OOPS_PRactise;
class Car{
        String Name;
        Integer Price;

        //constructor
        public Car(String Name , Integer Price){
            this.Name=Name;
            this.Price=Price;

        }
        public void display(){
            System.out.println("Car Name is "+ Name);
            System.out.println("Car Price is "+Price);
        }
    }
public class classandobj {

    

    public static void main(String[] args) {
        Car Car1 = new Car("Buggati", 11);
        Car car2 = new Car("Lamborgini", 10);
        Car1.display();
        car2.display();


    }
}