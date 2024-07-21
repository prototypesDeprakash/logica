/**
 * acitionlist
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class acitionlist extends Frame implements ActionListener{
    Frame f;
    Color c = new Color(224,53,32);
    acitionlist(){
        f = new Frame();
        f.setLayout(null);
        Button b = new Button("helo");

        b.setBounds(100,200,30,40);
        b.addActionListener(this);
        f.add(b);


        f.setVisible(true);
        f.setSize(800,600);
    }
    public void actionPerformed(ActionEvent e){

        f.setBackground(c);
    }


    public static void main(String[] args) {
        new acitionlist();
    }
}