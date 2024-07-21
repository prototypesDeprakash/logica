
import java.awt.*;

public class Awtbasic {
    public static void main(String[] args) {
        // Create components
        Frame f = new Frame("My Frame");
        Button b = new Button("Click me");
        TextField tf = new TextField();
        TextArea ta = new TextArea();
        Label lb = new Label("This is text area");
        Checkbox checkbox1 = new Checkbox("C++");    
        checkbox1.setBounds(100, 100,  50, 50);    
        Checkbox checkbox2 = new Checkbox("Java", true);    
        
        // Layout setting
        f.setLayout(null);
        
        // Setting bounds and position for each component
        b.setBounds(90, 90, 100, 50);
        tf.setBounds(90, 150, 500, 30);
        lb.setBounds(100, 190, 100, 20);
        ta.setBounds(120, 300, 500, 100);
        checkbox1.setBounds(90, 10, 100, 20);
        
        // Adding components to the frame
        f.add(b);
        f.add(tf);
        f.add(lb);
        f.add(ta);
        f.add(checkbox1);
        
        // Frame visibility and size
        f.setSize(800, 600);
        f.setVisible(true);
        //adding evenet
       
    }
}
