import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class windowops extends JFrame implements WindowListener
{
	windowops()
	{
		setTitle("WindowEvents");
		addWindowListener(this);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public void windowOpened(WindowEvent ae)
	{
		System.out.println("khul ja simsim");
		
	}
	public void windowClosed(WindowEvent ae)
	{
		System.out.println("khul ja simsim");
		
	}
	public void windowClosing(WindowEvent ae)
	{
		System.out.println("khul ja simsim");
		
	}
	public void windowIconified(WindowEvent ae)
	{
		System.out.println("khul ja simsim");
		
	}
	public void windowDeiconified(WindowEvent ae)
	{
		System.out.println("khul ja simsim");
		
	}
	public void windowActivated(WindowEvent ae)
	{
		System.out.println("khul ja simsim");
		
	}
	public void windowDeactivated(WindowEvent ae)
	{
		System.out.println("khul ja simsim");
		
	}
	public static void main(String []args)
	{
		windowops w=new windowops();
		
	}
}
