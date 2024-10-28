/**
 * oop
 */


 class first{ //accedd with object
    public  void sm(){
        System.out.println("Fuck");
    }
 }
 class second{ //access directly without object
    static void sm2(){
        System.out.println("fuck2");
    }
 }
public class oop {
    public static void main(String[] args) {
        first f = new first();
        f.sm();
        second.sm2();

        String obj="abcd";
        System.out.println(obj.getChars(0, 3, null, 0););
    }
}