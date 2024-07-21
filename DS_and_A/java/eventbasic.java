import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;  // Import for WindowEvent
import java.util.concurrent.ThreadLocalRandom;

public class eventbasic {

    public static int score=0;
    
    public static void main(String[] args) {
        Frame f = new Frame("Event Handling Example");
        Button b = new Button("Click me");
        f.setLayout(null);
        b.setBounds(90, 90, 100, 50);
        f.add(b);
       

        
        // Action listener for the button
        

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello world");
                
                int x = ThreadLocalRandom.current().nextInt(100, 500);
                int y = ThreadLocalRandom.current().nextInt(100, 500);
                b.setBounds(x, y, 100, 50);
                
                f.add(b);
                f.validate();
                f.repaint();
               // updateScore();
                Label l = new Label("Score "+score);
                l.setBounds(100, 50, 200, 30);
                f.add(l,BorderLayout.NORTH);
            }
        });
      
        // Window listener for closing the window
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setSize(800, 600);
        f.setVisible(true);
        
    }
    

}
