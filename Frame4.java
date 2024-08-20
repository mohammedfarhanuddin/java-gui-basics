import java.awt.*;
import java.awt.event.*'
import java.swing.*;
public class Frame4 extends JFrame implements ActionListener
{
	JButton b;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	Frame4()
	{
		setTitle("ADDer");
		setLayout
		l1=new JLabel("Number1");
		t1=new JTextField(20);
		l2=new JLabel("Number2");
		t2=new JTextField(20);
		l3=new JLabel("Number2");
		t3=new JTextField(20);
		b=new JButton("RESULT");
		b.addActionListener(this);
		