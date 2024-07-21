
import java.awt.*;

public class CheckboxGroupExample {
    public static void main(String[] args) {
        // Create a new frame
        Frame f = new Frame("Checkbox Group Example");

        // Create a CheckboxGroup
        CheckboxGroup cbGroup = new CheckboxGroup();

        // Create checkboxes with the CheckboxGroup
        Checkbox  cb1 = new Checkbox("Option 1", cbGroup, false);
        Checkbox cb2 = new Checkbox("Option 2", cbGroup, false);
        Checkbox cb3 = new Checkbox("Option 3", cbGroup, false);

        // Set layout manager to null for absolute positioning
        f.setLayout(null);

        // Set bounds for each checkbox
        cb1.setBounds(50, 100, 100, 30);
        cb2.setBounds(50, 150, 100, 30);
        cb3.setBounds(50, 200, 100, 30);

        // Add checkboxes to the frame
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);

        // Set frame size and make it visible
        f.setSize(300, 300);
        f.setVisible(true);
       

        // Add a window listener to close the window properly
        
    }
}
