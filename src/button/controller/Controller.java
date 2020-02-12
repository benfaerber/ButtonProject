package button.controller;

import button.view.SampleFrame;
import javax.swing.JOptionPane;
public class Controller
{
	private SampleFrame frame;
	private int count;
	
	public Controller()
	{
		this.count = 0;
		this.frame = new SampleFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(frame, "This app has laoded!");
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void updateCount()
	{
		count++;
	}
	
	public SampleFrame getFrame()
	{
		return frame;
	}
}
