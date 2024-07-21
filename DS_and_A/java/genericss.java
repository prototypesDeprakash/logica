
class data <X>{
    X mydata;
    data(X mydata){
        this.mydata=mydata;
    }
    public X getdata(){
        return this.mydata;
    }
}

public class genericss {
public static void main(String[] args) {
    data <Integer> md = new data(1) ;
    System.out.println(md.getdata());

    data<String> ms = new data("Prakash");
    System.out.println(ms.getdata());
    
}}
