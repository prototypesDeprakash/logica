import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        
        int[] array = new int[10];  
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i =0 ;i <n;i++){
            array[i]=sc.nextInt();
        }
       

        System.out.println("array value");
        for(int i =0 ;i <n;i++){
            System.out.println(array[i]);
        }
    }
}
