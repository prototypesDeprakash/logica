
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.io.FileReader;
/**
 * exceptioninjava
 */

class A extends Thread{
    public void run(){
        System.out.println("This is a thread");
    }
}

class B {
    void disp(){
        System.out.println("making illegals tate exception");
    }
}
public class exceptioninjava {

    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("myfile.txt"); //filenotfound
        }catch(FileNotFoundException  e){
            System.out.println(e);
        }

        try{
            ArrayList<String>list=new ArrayList<>() ; //index out of range 
            list.remove(0);
                
            
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        try{
            Thread A = new Thread(); //Illegal thread state exception
            A.start();
            A.start();
        }catch(IllegalThreadStateException e){
            System.out.println(e);
        }
        try{
            Scanner sc = new Scanner(System.in); //illegal state exception
            sc.close();
            int x = sc.nextInt();
        }catch(IllegalStateException e){
            System.out.println(e);
        }
    }
    
}