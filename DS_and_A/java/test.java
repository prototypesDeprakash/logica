import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.ThreadLocalRandom;

public class EventBasic extends Frame {

    private int score = 0; // Instance variable for score

    public EventBasic() {
        super("Event Handling Example");

        Button b = new Button("Click me");
        b.setBounds(90, 90, 100, 50);
        add(b);

        Label l = new Label("Score " + score);
        l.setBounds(100, 50, 200, 30);
        add(l, BorderLayout.NORTH);

        // Action listener for the button
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");

                // Update score
                updateScore();
                l.setText("Score " + score); // Update label text

                // Generate random position for the button
                int x = ThreadLocalRandom.current().nextInt(100, 500);
                int y = ThreadLocalRandom.current().nextInt(100, 500);
                b.setBounds(x, y, 100, 50);

                // Repaint the frame
                validate();
                repaint();
            }
        });

        // Window listener for closing the window
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setSize(800, 600);
        setLayout(null); // Use null layout to manually set component bounds
        setVisible(true);
    }

    // Method to update the score
    private void updateScore() {
        score++;
    }

    public static void main(String[] args) {
        new EventBasic();
    }
}
