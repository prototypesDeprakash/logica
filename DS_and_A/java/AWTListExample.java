
import java.awt.*;
import java.awt.event.*;

public class AWTListExample extends Frame implements ActionListener {
    // Create List component
    List fruitList;

    // Constructor to initialize the GUI components
    public AWTListExample() {
        // Set layout to FlowLayout
        setLayout(new FlowLayout());

        // Initialize List component
        fruitList = new List(4, true); // 4 visible rows, multi-select enabled

        // Add items to the List
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Cherry");
        fruitList.add("Grape");
        fruitList.add("Orange");

        Choice c = new Choice();
        c.add("Hello");
        c.add("bro");
        add(c);

        // Add List to the frame
        add(fruitList);

        // Add action listener to handle events
        fruitList.addActionListener(this);

        // Set frame properties
        setTitle("AWT List Example");
        setSize(300, 200);
        setVisible(true);

        // Handle window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // ActionPerformed method to handle list item selection
    public void actionPerformed(ActionEvent e) {
        // Get selected items
        String[] selectedFruits = fruitList.getSelectedItems();

        // Display selected items
        System.out.println("Selected fruits:");
        for (String fruit : selectedFruits) {
            System.out.println(fruit);
        }
    }

    // Main method to start the application
    public static void main(String[] args) {
        new AWTListExample();
    }
}
