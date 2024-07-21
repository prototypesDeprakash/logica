import java.awt.*;
import java.awt.event.*;

public class ButtonClickAWTExample {

    public static void main(String[] args) {
        // Create a new Frame (window)
        Frame frame = new Frame("Button Click AWT Example");
        frame.setSize(400, 300);
        frame.setLayout(null); // No layout manager
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Create a new Button
        Button button = new Button("Click Me");
        button.setBounds(150, 100, 100, 40); // Set position and size

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This code will be executed when the button is clicked
                Dialog dialog = new Dialog(frame, "Dialog", true);
                dialog.setLayout(new FlowLayout());
                dialog.setSize(200, 100);
                Label label = new Label("Button was clicked!");
                dialog.add(label);
                Button okButton = new Button("OK");
                okButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog.setVisible(false);
                    }
                });
                dialog.add(okButton);
                dialog.setVisible(true);
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}
