import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class fakeicons implements ActionListener
{
JLabel l1;
JTextField t1;
JLabel l2;
JTextField t2;
JLabel l3;
JTextField t3;
JToggleButton b1;
JToggleButton b2;
JToggleButton b3;
JFrame j=new JFrame();
fakeicons()
{
j.setTitle("CAlculator");
j.setLayout(null);
l1=new JLabel("number1");
t1=new JTextField(20);
l2=new JLabel("number2");
t2=new JTextField(20);
l3=new JLabel("result");
t3=new JTextField(20);
ImageIcon i=new ImageIcon("Download.png");
b1=new JToggleButton(i);
ImageIcon piuu=new ImageIcon("minus.png");
b2=new JToggleButton(piuu);
ImageIcon k=new ImageIcon("mul.png");
b3=new JToggleButton(k);
j.add(l1);
j.add(t1);
j.add(l2);
j.add(t2);
j.add(l3);
j.add(t3);
j.add(b1);
j.add(b2);
j.add(b3);
l1.setBounds(50,50,100,50);
t1.setBounds(200,50,100,50);
l2.setBounds(50,150,100,50);
t2.setBounds(200,150,100,50);
l3.setBounds(50,250,100,50);
t3.setBounds(200,250,100,50);
b1.setBounds(50,350,75,35);
b2.setBounds(150,350,75,35);
b3.setBounds(250,350,75,35);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
j.setSize(500,500);
j.setVisible(true);
j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
int n1=Integer.parseInt(t1.getText());
int n2=Integer.parseInt(t2.getText());
int n3=0;
if(e.getSource()==b1)
{
n3=n1+n2;
t3.setText(""+n3);
}
else if(e.getSource()==b2)
{
n3=n1-n2;
t3.setText(""+n3);
}
else if(e.getSource()==b3){
n3=n1*n2;
t3.setText(""+n3);
}
}
public static void main(String []args)
{
new fakeicons();
}
}






