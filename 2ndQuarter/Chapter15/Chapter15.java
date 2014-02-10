/*12/1/2005
 *Chris Glock
 *Chapter 15*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;

public class Chapter15 extends JFrame implements ActionListener
{
	private JLabel topLabel, nameLabel, addressLabel, quarterLabel, outputLabel;
	private JTextField nameField, addressField;
	private JRadioButton firstQuarterBox, secondQuarterBox, fourthQuarterBox, sixthQuarterBox;
	private JButton status;

	private ButtonGroup group = new ButtonGroup();

	Font topFont = new Font("Broadway", Font.PLAIN, 16);

	String outputString = "";
	public Chapter15()
	{
		super("Chapter 15");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pane = new JPanel();
		setContentPane(pane);

		pane.setLayout(null);
		pane.setBackground(Color.red);

		topLabel = new JLabel("Please select your current quarter");
		topLabel.setFont(topFont);
		topLabel.setSize(350,20);
        topLabel.setLocation(50,10);
        pane.add(topLabel);

		nameLabel = new JLabel("Name:");
		nameLabel.setSize(80,20);
		nameLabel.setLocation(20,80);
		pane.add(nameLabel);

		nameField = new JTextField(10);
		nameField.requestFocus();
		nameField.setSize(100,20);
		nameField.setLocation(80,80);
		pane.add(nameField);

		addressLabel = new JLabel("Address:");
		addressLabel.setSize(80,20);
		addressLabel.setLocation(20,120);
		pane.add(addressLabel);

		addressField = new JTextField(20);
		addressField.setSize(100,20);
		addressField.setLocation(80,120);
		pane.add(addressField);

		quarterLabel = new JLabel("Select your current quarter");
		quarterLabel.setSize(250,20);
		quarterLabel.setLocation(200,60);
		pane.add(quarterLabel);

		firstQuarterBox = new JRadioButton("First Quarter");
		group.add(firstQuarterBox);
		pane.add(firstQuarterBox);
		firstQuarterBox.setSize(150,20);
		firstQuarterBox.setLocation(210,80);
		firstQuarterBox.setBackground(Color.red);

		secondQuarterBox = new JRadioButton("Second or Third Quarter");
		group.add(secondQuarterBox);
		pane.add(secondQuarterBox);
		secondQuarterBox.setSize(200,20);
		secondQuarterBox.setLocation(210,100);
		secondQuarterBox.setBackground(Color.red);

		fourthQuarterBox = new JRadioButton("Fourth or FifthQuarter");
		group.add(fourthQuarterBox);
		pane.add(fourthQuarterBox);
		fourthQuarterBox.setSize(200,20);
		fourthQuarterBox.setLocation(210,120);
		fourthQuarterBox.setBackground(Color.red);

		sixthQuarterBox = new JRadioButton("Sixth Quarter");
		group.add(sixthQuarterBox);
		pane.add(sixthQuarterBox);
		sixthQuarterBox.setSize(200,20);
		sixthQuarterBox.setLocation(210,140);
		sixthQuarterBox.setBackground(Color.red);

		status = new JButton("Current Status");
		pane.add(status);
		status.setSize(140,25);
		status.setLocation(130,200);
		status.addActionListener(this);

		outputLabel = new JLabel("");
		pane.add(outputLabel);
		outputLabel.setSize(150,20);
		outputLabel.setLocation(130,225);
	}

	public static void main(String[] args)
	{
		JFrame aFrame = new Chapter15();
		aFrame.setSize(400,300);
		aFrame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(firstQuarterBox.isSelected())
			outputString = "You are a freshman";
		else if(secondQuarterBox.isSelected())
			outputString = "You are a sophomore";
		else if (fourthQuarterBox.isSelected())
			outputString = "You are a junior";
		else if(sixthQuarterBox.isSelected())
			outputString = "You are a senior";

		outputLabel.setText(outputString);
	}
}