package java;
import java.util.Collection;
public class insertingitem {
public static void main(String [] args){
    int[] intArray = new int[6];
    for(int i=0;i<3;i++){
        intArray[i]=i;
    }
    for (int i=0;i<intArray.length;i++){
        System.out.println(intArray[i]);
    }
}
}