

public class finvar {
    public static void main(String[] args) {
        final int a=10;
        a=20; //error because once assigned final variables cannot be changed
        System.out.println(a);
    }
}
