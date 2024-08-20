import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Frame3 extends JFrame implements ActionListener
{
	JButton b1;
	JLabel l1;
	Frame3()
	{
		setTitle("second Frame");
		setLayout(new FlowLayout());
		b1=new JButton("Button1");
		l1=new JLabel("Hello");
		add(l1);
		add(b1);
		b1.addActionListener(this);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		Calendar  time=Calendar.getInstance();
		int hr=time.get(Calendar.HOUR_OF_DAY);
		String Str;
		if(hr<12)
			Str="goodmorning";
		else if(hr>=12 && hr<17)
			Str="goodmorning";
		else
			Str="goodmorning";
		l1.setText(Str);
	}
	public static void main(String args[])
	{
		new Frame3();
	}
}

