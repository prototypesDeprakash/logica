import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class bytestreamexample {
    public static void main(String[] args) {
        String sourcefile= "source.txt";
        String Destinationfile="dest.txt";

        try(FileInputStream fis = new FileInputStream(sourcefile);
            FileOutputStream fos = new FileOutputStream(Destinationfile); //FileWriter
        ){
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) { //read
                fos.write(buffer, 0, bytesRead);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
