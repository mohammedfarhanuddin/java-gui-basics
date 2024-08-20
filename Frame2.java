import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Frame2 extends JFrame implements ActionListener
{
	JButton b1;
	JLabel l1;
	Frame2()
	{
		setTitle("second Frame");
		setLayout(new FlowLayout());
		b1=new JButton("Hello");
		l1=new JLabel("Hello");
		add(b1);
		add(l1);
		b1.addActionListener(this);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		l1.setText("bye");
	}
	public static void main(String[] args)
	{
		new Frame2();
	}
}