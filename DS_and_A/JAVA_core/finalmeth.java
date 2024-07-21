

public class finalmeth {
    
     final void printanimalname(){
        System.out.println("horse");
    }
    
}

class child extends finalmeth{
    void printanimalname(){
        //error  because we cannot override final method in java 
    }
}
