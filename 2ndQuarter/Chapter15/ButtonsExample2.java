import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;

public class ButtonsExample2 extends JFrame implements ActionListener, ItemListener
{
	private JLabel companyNameLabel, nameLabel, priceLabel, shippingLabel, outputLabel;
	private JTextField nameField;
	private JCheckBox tShirt, jeans;
	private JRadioButton oneDayBox, twoDayBox, moreDaysBox;
	private JButton total;

	private ButtonGroup group = new ButtonGroup();

	Font bigFont = new Font("Helvetica", Font.ITALIC|Font.BOLD, 20);

	public ButtonsExample2()
	{
		super("Buttons example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pane = new JPanel();
		setContentPane(pane);

		pane.setLayout(new FlowLayout());
		pane.setBackground(Color.cyan);

		companyNameLabel = new JLabel("                  Please choose your method of shipping:            ");
		companyNameLabel.setFont(bigFont);
		pane.add(companyNameLabel);

		nameLabel = new JLabel("Please Enter your name");
		pane.add(nameLabel);

		nameField = new JTextField(10);
		pane.add(nameField);
		nameField.requestFocus();

		priceLabel = new JLabel("Please choose the item you wish to order:");
		pane.add(priceLabel);

		tShirt = new JCheckBox("T-shirt", false);
		pane.add(tShirt);
		tShirt.setBackground(Color.cyan);

		jeans = new JCheckBox("Jeans", false);
		pane.add(jeans);
		jeans.setBackground(Color.cyan);

		shippingLabel = new JLabel("                 Please choose your method of shipping:                   ");
		pane.add(shippingLabel);

		oneDayBox = new JRadioButton("Priority (Overnight)");
		group.add(oneDayBox);
		pane.add(oneDayBox);
		oneDayBox.setBackground(Color.cyan);
		oneDayBox.addItemListener(this);

		twoDayBox = new JRadioButton("Express (2 business days)");
		group.add(twoDayBox);
		pane.add(twoDayBox);
		twoDayBox.setBackground(Color.cyan);
		twoDayBox.addItemListener(this);

		moreDaysBox = new JRadioButton("Standard (3 to 7 business days)");
		group.add(moreDaysBox);
		pane.add(moreDaysBox);
		moreDaysBox.setBackground(Color.cyan);
		moreDaysBox.addItemListener(this);

		total = new JButton("Order Total");
		pane.add(total);
		total.addActionListener(this);

		outputLabel = new JLabel ("We guarantee on time delivery, or your money back.");
		pane.add(outputLabel);
	}

	public static void main(String[] args)
	{
		JFrame aFrame = new ButtonsExample2();
		aFrame.setSize(475, 300);
		aFrame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		float shipping = 0F;
		float tShirtPrice = 0F;
		float jeansPrice = 0F;

		if(oneDayBox.isSelected())
			shipping = 14.95F;
		else if(twoDayBox.isSelected())
			shipping = 11.95F;
		else
			shipping = 5.95F;

		if(tShirt.isSelected())
			tShirtPrice = 10.00F;

		if(jeans.isSelected())
				jeansPrice = 38.00F;

		outputLabel.setForeground(Color.red);
		outputLabel.setText("Your total cost is $" + (shipping + tShirtPrice + jeansPrice));

	}
	public void itemStateChanged(ItemEvent e)
	{
		outputLabel.setForeground(Color.blue);
		if(oneDayBox.isSelected())
			outputLabel.setText("Your shipping charge is $14.95");
		else if(twoDayBox.isSelected())
			outputLabel.setText("Your shipping charge is $11.95");
		else
			outputLabel.setText("Your shipping charge is $5.95");
	}
}
