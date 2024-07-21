import java.util.LinkedList;
import java.util.Queue;

public class queu {
    public static void main(String[] args) {
        Queue <String> que = new LinkedList<>();
        que.add("Hello");
        que.offer("fuck you");
        System.out.println(que);
    }
}
