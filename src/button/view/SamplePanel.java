package button.view;

import button.controller.Controller;
import javax.swing.JPanel;

import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SamplePanel extends JPanel
{
	private static final long serialVersionUID = 1L;

	private Controller controller;
	
	private SpringLayout appLayout;
	private JButton sampleButton;
	private JLabel sampleLabel;
	
	private String labelText;
	
	public SamplePanel(Controller controller)
	{
		super();
		this.controller = controller;
		
		this.labelText = "The button has been clicked: ";
		this.appLayout = new SpringLayout();
		this.sampleButton = new JButton("Click me!!!");
		
		this.sampleLabel = new JLabel(labelText + "0 times");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupPanel()
	{
		
	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupListeners()
	{
		
	}
}
