import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        // Create a Frame (window) with GridLayout
        Frame frame = new Frame("GridLayout Example");
        
        // Create a GridLayout with 3 rows and 2 columns
        GridLayout gridLayout = new GridLayout(3, 2);
        
        // Set the layout of the frame to GridLayout
        frame.setLayout(gridLayout);
        
        // Add buttons to the frame
        frame.add(new Button("Button 1"));
        frame.add(new Button("Button 2"));
        frame.add(new Button("Button 3"));
        frame.add(new Button("Button 4"));
        frame.add(new Button("Button 5"));
        
        // Set frame properties
        frame.setSize(300, 200); // Set size of the frame
        frame.setVisible(true); // Make the frame visible
        
        // Handle window closing event
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
