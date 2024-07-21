import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        // Create a Frame (window) with FlowLayout
        Frame frame = new Frame("FlowLayout Example");
        frame.setLayout(new FlowLayout());

        // Add buttons to the frame
        frame.add(new Button("Button 1"));
        frame.add(new Button("Button 2"));
        frame.add(new Button("Button 3"));
        frame.add(new Button("Button 4"));
        frame.add(new Button("Button 5"));

        // Set frame properties
        frame.setSize(300, 150); // Set size of the frame
        frame.setVisible(true); // Make the frame visible

        // Handle window closing event
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
