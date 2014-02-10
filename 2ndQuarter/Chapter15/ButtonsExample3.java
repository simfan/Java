import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonsExample3 extends JFrame implements ActionListener
{
	private JLabel companyNameLabel, nameLabel, priceLabel, shippingLabel, outputLabel;
	private JTextField nameField;
	private JCheckBox tShirt, jeans;
	private JRadioButton oneDayBox, twoDayBox, moreDaysBox;
	private JButton total;

	private ButtonGroup group = new ButtonGroup();

	Font bigFont = new Font("Helvetica", Font.ITALIC|Font.BOLD, 20);

	public ButtonsExample3()
	{
		super("Buttons example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pane1 = new JPanel(new BorderLayout());
		JPanel pane2 = new JPanel(new FlowLayout());
		JPanel pane3 = new JPanel(new FlowLayout());

		setContentPane(pane1);

		pane1.setBackground(Color.cyan);
		pane2.setBackground(Color.cyan);
		pane3.setBackground(Color.cyan);

		companyNameLabel = new JLabel("Please fill out the information below:");
		companyNameLabel.setFont(bigFont);
		pane1.add(companyNameLabel, "North");

		nameLabel = new JLabel("Please Enter your name");
		pane2.add(nameLabel);

		nameField = new JTextField(10);
		pane2.add(nameField);
		nameField.requestFocus();

		priceLabel = new JLabel("Please choose the item you wish to order:");
		pane2.add(priceLabel);

		tShirt = new JCheckBox("T-shirt", false);
		pane2.add(tShirt);
		tShirt.setBackground(Color.cyan);

		jeans = new JCheckBox ("Jeans", false);
		pane2.add(jeans);
		jeans.setBackground(Color.cyan);

		shippingLabel = new JLabel("Please choose your method of shipping:");
		pane2.add(shippingLabel);

		oneDayBox = new JRadioButton("Priority (Overnight)");
		group.add(oneDayBox);
		pane2.add(oneDayBox);
		oneDayBox.setBackground(Color.cyan);

		twoDayBox = new JRadioButton("Express (2 business days)");
		group.add(twoDayBox);
		pane2.add(twoDayBox);
		twoDayBox.setBackground(Color.cyan);

		moreDaysBox = new JRadioButton("Standard (3 to 7 business days)");
		group.add(moreDaysBox);
		pane2.add(moreDaysBox);
		moreDaysBox.setBackground(Color.cyan);

		total = new JButton("Order Total");
		pane2.add(total);
		total.addActionListener(this);

		outputLabel = new JLabel("We guarantee on time delivery, or your money back.");
		pane3.add(outputLabel);

		pane1.add(pane2, "Center");
		pane1.add(pane3, "South");

	}

	public static void main(String[] args)
	{
		JFrame aFrame = new ButtonsExample3();
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
		outputLabel.setText("Your total cost " + nameField.getText() + " is $" + (shipping + tShirtPrice + jeansPrice));
	}
}