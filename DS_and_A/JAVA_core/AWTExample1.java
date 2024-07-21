/**
 * AWTExample1
 */
import java.awt.*;

import javax.swing.border.Border;

public class AWTExample1 {

   public static void main(String[] args) {
      
      Frame f = new Frame("My frame");
      //f.setLayout(new BorderLayout() );
      f.setLayout(null);
      Button b = new Button("My button");
      b.setBounds(30, 100, 80, 30);
      Button b2 = new Button("My button2");
      b2.setBounds(50, 150, 80, 30);
      Button b3 = new Button("My button3");
      b3.setBounds(70, 200, 80, 30);

      CheckboxGroup cbg = new CheckboxGroup();
      Checkbox cb = new Checkbox("hi",cbg,true);
      Checkbox cb2 = new Checkbox("hi2",cbg,false);
      cb.setBounds(70, 400, 80, 30);
      cb2.setBounds(70, 420, 80, 30);
     Font ff = new Font("serif",Font.BOLD,24);
     b.setFont(ff);
     Color c = new Color(234,32,11);
          b2.setBackground(c);

          
      
      f.add(cb);
      f.add(cb2);
      
      
      f.add(b);
      f.add(b2);
      f.add(b3);
      f.setVisible(true);

      
      f.setSize(800,800);
      
   }
}