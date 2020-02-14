package button.view;

import button.controller.Controller;
import javax.swing.JPanel;

import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		
		appLayout.putConstraint(SpringLayout.WEST, sampleButton, 168, SpringLayout.WEST, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setBackground(Color.gray);
		this.sampleLabel = new JLabel(labelText + "0 times");
		appLayout.putConstraint(SpringLayout.SOUTH, sampleLabel, -257, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, sampleButton, 6, SpringLayout.SOUTH, sampleLabel);
		this.add(sampleLabel);
		this.add(sampleButton);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.EAST, sampleLabel, -101, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		sampleButton.addMouseListener(new MouseAdapter() {
			public void actionPerformed(ActionEvent e) {
				updateDisplay();
			}
		});
	}
	
	private void updateDisplay()
	{
		controller.updateCount();
		this.setBackground(updateColor());
		sampleLabel.setText(labelText + controller.getCount() + " times!");
	}
	
	private Color updateColor()
	{
		return null;
		//Color randomColor = null;
		//int red = (int) (Math)
	}
}
