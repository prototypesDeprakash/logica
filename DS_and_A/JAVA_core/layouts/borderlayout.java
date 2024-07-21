import java.awt.*;;
public class borderlayout {
    public static void main(String[] args) {
        Frame f = new Frame("main window");
        Button b1 =new Button("Click me! ");

        f.add(b1,BorderLayout.SOUTH);
        f.setSize(800,600);
        f.setVisible(true);

    }
}
