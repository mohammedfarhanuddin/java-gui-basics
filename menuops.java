import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class menuops extends JFrame 
{
menuops()
{
setTitle("menuops");
JMenuBar mb=new JMenuBar();
JMenu m1=new JMenu("FILE");
JMenu m2=new JMenu("Edit");
JMenuItem i1=new JMenuItem("NEW");
JMenuItem i2=new JMenuItem("open");
JMenuItem i3=new JMenuItem("save");
JMenuItem i4=new JMenuItem("save as");
m1.add(i1);
m1.add(i2);
m1.add(i3);
m1.add(i4);
mb.add(m1);
mb.add(m2);
setJMenuBar(mb);
setVisible(true); 
setSize(500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String []args)
{
menuops m=new menuops();
}
}