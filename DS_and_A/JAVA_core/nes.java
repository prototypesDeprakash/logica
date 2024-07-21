
class a {
    static class b{
        void disp(){
            System.out.println("hello");
        }
    }
}

public class nes {
    public static void main(String[] args) {
        a a1 = new a();
        a.b b1 = new a.b();
        b1.disp();
    }
}
