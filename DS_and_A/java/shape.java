import javax.swing.*;  
class MenuExample  
{  
          JMenumenu submenu;  
          JMenuItemi1,i2,i3,i4,i5;  
          MenuExample(){  
          JFramef=newJFrame("MenuandMenuItemExample");  
          JMenuBarmb=newJMenuBar();  
          menu=newJMenu("Menu");  
          i1=newJMenuItem("circle");  
          i2=newJMenuItem("Rectangle");  
          i3=newJMenuItem("Line");  
          i4=newJMenuItem("Diagonale of the rectangle");

          menu.add(i1);menu.add(i2);menu.add(i3);  
          menu.add(i4);  
          I1.addActionListener(this);    
         I2.addActionListener(this);    
         I3.addActionListener(this);    
        I4.addActionListener(this);  
          mb.add(menu);  
          f.setJMenuBar(mb);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);  
}
 publicvoidactionPerformed(ActionEvente){    
if(e.getSource()==i1)  
{  Circle a=new Circle(20,20);}   
if(e.getSource()==i2)
 {   
Rectangle r=new Rectancle(20,25});
 if(e.getSource()==i3)    
{Line l=new Line(10,20,30,40);}
 if(e.getSource()==i4)    
   Diagnalofrecatnle=  new     Diagnalofrecatnle(20,45);
 }       publicstaticvoidmain(Stringargs[])  
{  
newMenuExample();  
}} 