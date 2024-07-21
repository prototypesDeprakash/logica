import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;

import javax.swing.*;  
public class Simple {  
JFrame f; 
 
Simple(){  
f=new JFrame();//creating instance of JFrame  

          
JButton b=new JButton("click");//creating instance of JButton  
JPasswordField pf=new JPasswordField();
JSpinner sp = new JSpinner();
JProgressBar jp=new JProgressBar();
JLabel jl = new JLabel("Hello guys");
JRadioButton rb = new JRadioButton();

rb.setBounds(230,300,200,40);
jl.setBounds(100,100,200,40);
b.setBounds(130,100,100, 40);  
pf.setBounds(230,200,200,40);
sp.setBounds(230,300,200,40);
jp.setBounds(430,400,100,40);

f.add(b);//adding button in JFrame  
f.add(pf);
f.add(sp);
f.add(jl,BorderLayout.NORTH);
f.add(jp);

f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
  
public static void main(String[] args) {  
new Simple();  
}  
}  