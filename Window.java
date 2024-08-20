import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Window implements ActionListener
{
	JButton b1;
	JFrame j=new JFrame("Window in a window");
	Window()
	{
	b1=new JButton("Click me");
	j.add(b1);
	j.setSize(400,400);
	b1.setBounds(175,175,50,50);
	b1.addActionListener(this);
	j.setVisible(true);
	j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
public void actionPerformed(ActionEvent e)
{
	JLabel j1;
	JFrame k =new JFrame("SUPRISE");
	j1=new JLabel("HAHAHAHA");
	k.add(j1);
	j1.setBounds(175,175,50,50);
	k.setSize(400,400);
	k.setVisible(true);
	k.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}
public static void main(String []args)
{
	new Window();
}}
	

