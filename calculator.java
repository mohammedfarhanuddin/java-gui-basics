import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class calculator implements ActionListener
{
JLabel l1;
JTextField t1;
JLabel l2;
JTextField t2;
JLabel l3;
JTextField t3;
JButton b1;
JButton b2;
JButton b3;
JFrame j=new JFrame();
calculator()
{
j.setTitle("CAlculator");
j.setLayout(null);
l1=new JLabel("number1");
t1=new JTextField(20);
l2=new JLabel("number2");
t2=new JTextField(20);
l3=new JLabel("result");
t3=new JTextField(20);
b1=new JButton("ADD");
b2=new JButton("SUB");
b3=new JButton("MUL");
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
String s=e.getActionCommand();
int n1=Integer.parseInt(t1.getText());
int n2=Integer.parseInt(t2.getText());
int n3;
if(s.equals("ADD"))
{
n3=n1+n2;
t3.setText(""+n3);
}
else if(s.equals("SUB"))
{
n3=n1-n2;
t3.setText(""+n3);
}
else{
n3=n1*n2;
t3.setText(""+n3);
}
}
public static void main(String []args)
{
new calculator();
}
}






