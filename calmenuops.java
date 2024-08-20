import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calmenuops extends JFrame 
{
calmenuops()
{
setTitle("calulator");
setLayout(null);
JMenuBar mb=new JMenuBar();
JMenu m1=new JMenu("ARITHMETiC");
JMenuItem i1=new JMenuItem("add");
JMenuItem i2=new JMenuItem("sub");
JMenuItem i3=new JMenuItem("mul");
JMenuItem i4=new JMenuItem("div");
JLabel l1=new JLabel("Number1");
JLabel l2=new JLabel("Number2");
JLabel l3=new JLabel("Result");
JTextField t1=new JTextField(20);
JTextField t2=new JTextField(20);
JTextField t3=new JTextField(20);                                                                                                 
m1.add(i1);
m1.add(i2);
m1.add(i3);
m1.add(i4);
mb.add(m1);
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
l1.setBounds(50,50,100,50);
t1.setBounds(200,50,100,50);
l2.setBounds(50,150,100,50);
t2.setBounds(200,150,100,50);
l3.setBounds(50,250,100,50);
t3.setBounds(200,250,100,50);  
i1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
int h23=Integer.parseInt(t1.getText());
int i23=Integer.parseInt(t2.getText());
int j23=h23+i23;
t3.setText(""+j23);

}

});
i2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
int h23=Integer.parseInt(t1.getText());
int i23=Integer.parseInt(t2.getText());
int j23=h23-i23;
t3.setText(""+j23);

}
});
i3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
int h23=Integer.parseInt(t1.getText());
int i23=Integer.parseInt(t2.getText());
int j23=h23*i23;
t3.setText(""+j23);

}
});
i4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
int h23=Integer.parseInt(t1.getText());
int i23=Integer.parseInt(t2.getText());
int j23=h23/i23;
t3.setText(""+j23);

}
});

setJMenuBar(mb);
setVisible(true); 
setSize(1000,1000);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String []args)
{
calmenuops m=new calmenuops();
}
}