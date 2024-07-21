package java;
import java.io.*;
import java.nio.channels.FileChannel;

public class filehand {
    public static void main(String[] args) {
        try{
            FileInputStream myfilestream = new FileInputStream("test.txt");
            // FileReader  fr = new FileReader("test.txt");
            //BufferedReader myfilestream = new BufferedReader(fr);
            FileChannel fc = myfilestream.getChannel();
            FileDescriptor fd = myfilestream.getFD();
            System.out.println(fc);
            System.out.println(fd);
            int byteread;
            while ((byteread=myfilestream.read() )!=-1) {
                System.out.println((char)byteread);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
