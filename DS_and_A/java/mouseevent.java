import java.awt.*;
import java.awt.event.*;

public class mouseevent extends Frame implements MouseMotionListener {

    public mouseevent() {
        super("Mouse Event Example");

        // Add MouseMotionListener to this Frame
        addMouseMotionListener(this);

        setSize(800, 600);
        setVisible(true);

        // Handle window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // Override mouseMoved method from MouseMotionListener
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse moved at x=" + x + ", y=" + y);
    }

    // Unused method from MouseMotionListener
    public void mouseDragged(MouseEvent e) {
        // Do nothing for now
    }

    public static void main(String[] args) {
        new mouseevent();
    }
}
