package button.view;

import button.controller.Controller;
import javax.swing.JFrame;
public class SampleFrame extends JFrame
{
	private Controller controller;
	private SamplePanel panel;
	
	public SampleFrame(Controller controller)
	{
		super();
		this.controller = controller;
		this.panel = new SamplePanel(this.controller);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(panel);
		this.setTitle("Sample GUI App");
		this.setResizable(true);
		this.setSize(800,600);
		this.setVisible(true);
	}
}
