import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.util.*;

/* Chris Glock
 * 1/11/06
 * TryJava03*/

public class TryJava03 extends JFrame implements ActionListener, ItemListener
{
	//setting up components
	private JLabel storeLabel, nameLabel, addressLabel, cityLabel, stateLabel, zipLabel, creditLabel, quantityLabel, paymentLabel, submitLabel;
	private JTextField nameField, addressField, cityField, stateField, zipField, watchField, bandanaField, shirtField, capField, cupField, creditField;
	private JCheckBox watch, bandana, tShirt, baseballCap, coffeeCup;
	private JRadioButton visaBox, masterCardBox, americanExpressBox, discoverBox;
	private JButton submit;

	private ButtonGroup group = new ButtonGroup();

	Font bigFont = new Font ("Arial", Font.ITALIC, 20);
	public TryJava03()
	{
		//create JPanel
		super("Java03");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pane = new JPanel();
		setContentPane(pane);

		pane.setLayout(null);
		pane.setBackground(Color.orange);

		//add components to JPanel
		storeLabel = new JLabel("Survivor Merchandise Online Store");
		storeLabel.setFont(bigFont);
		storeLabel.setSize(350,50);
		storeLabel.setLocation(75,10);
		pane.add(storeLabel);

		nameLabel = new JLabel("Name:");
		nameLabel.setSize(50,20);
		nameLabel.setLocation(10,70);
		pane.add(nameLabel);

		nameField = new JTextField(20);
		nameField.setSize(125,20);
		nameField.setLocation(65,70);
		pane.add(nameField);

		addressLabel = new JLabel("Address:");
		addressLabel.setSize(100,20);
		addressLabel.setLocation(245,70);
		pane.add(addressLabel);

		addressField = new JTextField(20);
		addressField.setSize(175,20);
		addressField.setLocation(305,70);
		pane.add(addressField);

		cityLabel = new JLabel("City:");
		cityLabel.setSize(60,20);
		cityLabel.setLocation(10,95);
		pane.add(cityLabel);

		cityField = new JTextField(15);
		cityField.setSize(135,20);
		cityField.setLocation(65,95);
		pane.add(cityField);

		stateLabel = new JLabel("State:");
		stateLabel.setSize(50,20);
		stateLabel.setLocation(245,95);
		pane.add(stateLabel);

		stateField = new JTextField(2);
		stateField.setSize(25,20);
		stateField.setLocation(305,95);
		pane.add(stateField);

		zipLabel = new JLabel("Zip Code:");
		zipLabel.setSize(60,20);
		zipLabel.setLocation(355,95);
		pane.add(zipLabel);

		zipField = new JTextField(5);
		zipField.setSize(50,20);
		zipField.setLocation(425,95);
		pane.add(zipField);

		quantityLabel = new JLabel("Quantity");
		quantityLabel.setSize(100,20);
		quantityLabel.setLocation(170,120);
		pane.add(quantityLabel);

		//add checkBoxes
		watch = new JCheckBox("Survivor Watch", false);
		watch.setSize(150,20);
		watch.setLocation(10,140);
		watch.setBackground(Color.orange);
		pane.add(watch);
		watch.addItemListener(this);

		watchField = new JTextField(3);
		watchField.setSize(50,20);
		watchField.setLocation(170,140);
		pane.add(watchField);

		bandana = new JCheckBox("Survivor Bandana", false);
		bandana.setSize(150,20);
		bandana.setLocation(10,170);
		bandana.setBackground(Color.orange);
		pane.add(bandana);
		bandana.addItemListener(this);

		bandanaField = new JTextField(3);
		bandanaField.setSize(50,20);
		bandanaField.setLocation(170,170);
		pane.add(bandanaField);

		tShirt = new JCheckBox("Survivor T-shirt", false);
		tShirt.setSize(150,20);
		tShirt.setLocation(10,200);
		tShirt.setBackground(Color.orange);
		pane.add(tShirt);
		tShirt.addItemListener(this);

		shirtField = new JTextField(3);
		shirtField.setSize(50,20);
		shirtField.setLocation(170,200);
		pane.add(shirtField);

		baseballCap = new JCheckBox("Survivor Baseball Cap", false);
		baseballCap.setSize(150,20);
		baseballCap.setLocation(10,230);
		baseballCap.setBackground(Color.orange);
		pane.add(baseballCap);
		baseballCap.addItemListener(this);

		capField = new JTextField(3);
		capField.setSize(50,20);
		capField.setLocation(170,230);
		pane.add(capField);

		coffeeCup = new JCheckBox("Survivor Coffee Cup", false);
		coffeeCup.setSize(150,20);
		coffeeCup.setLocation(10,260);
		coffeeCup.setBackground(Color.orange);
		pane.add(coffeeCup);
		coffeeCup.addItemListener(this);

		cupField = new JTextField(3);
		cupField.setSize(50,20);
		cupField.setLocation(170,260);
		pane.add(cupField);

		//add radio buttons
		paymentLabel = new JLabel("Please choose your method of payment:");
		paymentLabel.setSize(250,20);
		paymentLabel.setLocation(245,120);
		pane.add(paymentLabel);

		visaBox = new JRadioButton("VISA");
		visaBox.setSize(100,20);
		visaBox.setLocation(275,140);
		visaBox.setBackground(Color.orange);
		group.add(visaBox);
		pane.add(visaBox);

		masterCardBox = new JRadioButton("MasterCard");
		masterCardBox.setSize(100,20);
		masterCardBox.setLocation(275,160);
		masterCardBox.setBackground(Color.orange);
		group.add(masterCardBox);
		pane.add(masterCardBox);

		americanExpressBox = new JRadioButton("American Express");
		americanExpressBox.setSize(150,20);
		americanExpressBox.setLocation(275,180);
		americanExpressBox.setBackground(Color.orange);
		group.add(americanExpressBox);
		pane.add(americanExpressBox);

		discoverBox = new JRadioButton("Discover");
		discoverBox.setSize(100,20);
		discoverBox.setLocation(275,200);
		discoverBox.setBackground(Color.orange);
		group.add(discoverBox);
		pane.add(discoverBox);

		creditLabel = new JLabel("Credit Card number:");
		creditLabel.setSize(150,20);
		creditLabel.setLocation(250,230);
		pane.add(creditLabel);

		creditField = new JTextField(16);
		creditField.setSize(125,20);
		creditField.setLocation(375,230);
		pane.add(creditField);

		submit = new JButton("Submit Order");
		submit.setSize(150,25);
		submit.setLocation(187,310);
		pane.add(submit);
		submit.addActionListener(this);

		submitLabel = new JLabel("");
		submitLabel.setSize(500,25);
		submitLabel.setLocation(75,340);
		pane.add(submitLabel);
	}
	public static void main(String[] args)
	{
		JFrame aFrame = new TryJava03();
		aFrame.setSize(525,400);
		aFrame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Java03 java03 = new Java03();
		errorCheckName(java03);

	}

	public void itemStateChanged(ItemEvent e)
	{
		if(watch.isSelected())
		{
			watchField.selectAll();
			watchField.requestFocus();
		}

		if(bandana.isSelected())
		{
			bandanaField.selectAll();
			bandanaField.requestFocus();
		}

		if(tShirt.isSelected())
		{
			shirtField.selectAll();
			shirtField.requestFocus();
		}

		if(baseballCap.isSelected())
		{
			capField.selectAll();
			capField.requestFocus();
		}

		if(coffeeCup.isSelected())
		{
			cupField.selectAll();
			cupField.requestFocus();
		}
	}
//Calculations
	public void calculateTotal(Java03 java03)
	{
		String creditCard = "";

		double watchPrice = 0;
		double totalWatchPrice = 0;
		double bandanaPrice = 0;
		double totalBandanaPrice = 0;
		double tShirtPrice = 0;
		double totalTShirtPrice = 0;
		double baseballCapPrice = 0;
		double totalBaseballCapPrice = 0;
		double coffeeCupPrice = 0;
		double totalCoffeeCupPrice = 0;
		double totalPrice;

		if(watch.isSelected())
		{
			watchPrice = 35;
			totalWatchPrice = watchPrice * java03.getWatchQuantity();
		}

		if(bandana.isSelected())
		{
			bandanaPrice = 10;
			totalBandanaPrice = bandanaPrice * java03.getBandanaQuantity();
		}

		if(tShirt.isSelected())
		{
			tShirtPrice = 18;
			totalTShirtPrice = tShirtPrice * java03.getShirtQuantity();
		}

		if(baseballCap.isSelected())
		{
			baseballCapPrice = 16;
			totalBaseballCapPrice = baseballCapPrice * java03.getCapQuantity();
		}

		if(coffeeCup.isSelected())
		{
			coffeeCupPrice = 10;
			totalCoffeeCupPrice = coffeeCupPrice * java03.getCupQuantity();
		}

		totalPrice = totalWatchPrice + totalBandanaPrice + totalTShirtPrice + totalBaseballCapPrice + totalCoffeeCupPrice;
		java03.setTotal(totalPrice);

	}

	public String cardType()
	{
		String card = "";

		if(visaBox.isSelected())
			card = "VISA";
		else if(masterCardBox.isSelected())
			card = "MasterCard";
		else if(americanExpressBox.isSelected())
			card = "American Express";
		else if(discoverBox.isSelected())
			card = "Discover";
		return card;

	}

	public void errorCheckName(Java03 java03)
	{
		String name = nameField.getText();
		boolean errorCheck = java03.isNameValid(name);
		if(errorCheck)
		{
			submitLabel.setText("Your name must be between 1 and 20 characters long");
			submitLabel.setForeground(Color.red);
			nameField.selectAll();
			nameField.requestFocus();
			return;
		}
		java03.setName(name);
		errorCheckAddress(java03);
	}

	public void errorCheckAddress(Java03 java03)
	{
		String address = addressField.getText();
		boolean errorCheck = java03.isCityValid(address);
		if(errorCheck)
		{
			submitLabel.setText("Your address must be between 1 and 20 characters long");
			submitLabel.setForeground(Color.red);
			addressField.selectAll();
			addressField.requestFocus();
			return;
		}
		java03.setAddress(address);
		errorCheckCity(java03);
	}

	public void errorCheckCity(Java03 java03)
	{
		String city = cityField.getText();
		boolean errorCheck = java03.isCityValid(city);

		if(errorCheck)
		{
			submitLabel.setText("Your city must be between 1 and 15 characters long");
			submitLabel.setForeground(Color.red);
			cityField.selectAll();
			cityField.requestFocus();
			return;
		}
		java03.setCity(city);
		errorCheckState(java03);
	}

	public void errorCheckState(Java03 java03)
	{

		String state = stateField.getText();
		boolean errorCheck = java03.isStateValid(state);
		if(errorCheck)
		{
			submitLabel.setText("Your state must be 2 characters long");
			submitLabel.setForeground(Color.red);
			stateField.selectAll();
			stateField.requestFocus();
			return;
		}
		java03.setState(state);
		errorCheckZip(java03);
	}

	public void errorCheckZip(Java03 java03)
	{
			String zipCodeString = zipField.getText();
			boolean errorCheck = java03.isZipCodeValid(zipCodeString);
			if(!isNumeric(zipCodeString) || zipCodeString.length() < 1)
			{
				submitLabel.setText("Entry must be numeric");
				submitLabel.setForeground(Color.red);
				zipField.selectAll();
				zipField.requestFocus();
				return;
			}

			if(errorCheck)
			{
				submitLabel.setText("Your zip code must be 5 characters long");
				submitLabel.setForeground(Color.red);
				zipField.selectAll();
				zipField.requestFocus();
				return;
			}
			java03.setZipCode(zipCodeString);
			errorCheckWatch(java03);
		}

	public void errorCheckWatch(Java03 java03)
	{
		try
		{
			int quantity = 0;
			if(watch.isSelected())
			{
				String watchString = watchField.getText();
				quantity = Integer.parseInt(watchString);
				boolean errorCheck = java03.isWatchQuantityValid(quantity);
				if(errorCheck)
				{
					submitLabel.setText("Quantity must be between 1 and 100");
					submitLabel.setForeground(Color.red);
					watchField.selectAll();
					watchField.requestFocus();
					return;
				}
			}
			java03.setWatchQuantity(quantity);
			errorCheckBandana(java03);
		}
		catch(NumberFormatException e)
		{
			submitLabel.setText("Entry must be numeric");
			submitLabel.setForeground(Color.red);
			watchField.selectAll();
			watchField.requestFocus();
		}
	}

	public void errorCheckBandana(Java03 java03)
	{
		try
		{
			int quantity = 0;
			if(bandana.isSelected())
			{
				String bandanaString = bandanaField.getText();
				quantity = Integer.parseInt(bandanaString);
				boolean errorCheck = java03.isBandanaQuantityValid(quantity);
				if(errorCheck)
				{
					submitLabel.setText("Quantity must be between 1 and 100");
					submitLabel.setForeground(Color.red);
					bandanaField.selectAll();
					bandanaField.requestFocus();
					return;
				}
			}
			java03.setBandanaQuantity(quantity);
			errorCheckTShirt(java03);
		}
		catch(NumberFormatException e)
		{
			submitLabel.setText("Entry must be numeric");
			submitLabel.setForeground(Color.red);
			bandanaField.selectAll();
			bandanaField.requestFocus();
		}
	}

	public void errorCheckTShirt(Java03 java03)
	{
		try
		{
			int quantity = 0;
			if(tShirt.isSelected())
			{
				String tShirtString = shirtField.getText();
				quantity = Integer.parseInt(tShirtString);
				boolean errorCheck = java03.isShirtQuantityValid(quantity);
				if(errorCheck)
				{
					submitLabel.setText("Quantity must be between 1 and 100");
					submitLabel.setForeground(Color.red);
					bandanaField.selectAll();
					bandanaField.requestFocus();
					return;
				}
			}
			java03.setShirtQuantity(quantity);
			errorCheckCap(java03);
		}

		catch(NumberFormatException e)
		{
			submitLabel.setText("Entry must be numeric");
			submitLabel.setForeground(Color.red);
			shirtField.selectAll();
			shirtField.requestFocus();
		}
	}

	public void errorCheckCap(Java03 java03)
	{
		try
		{
			int quantity = 0;
			if(baseballCap.isSelected())
			{
				String capString = capField.getText();
				quantity = Integer.parseInt(capString);
				boolean errorCheck = java03.isCapQuantityValid(quantity);
				if(errorCheck)
				{
					submitLabel.setText("Quantity must be between 1 and 100");
					submitLabel.setForeground(Color.red);
					capField.selectAll();
					capField.requestFocus();
					return;
				}
			}

			java03.setCapQuantity(quantity);
			errorCheckCup(java03);
		}

		catch(NumberFormatException e)
		{
			submitLabel.setText("Entry must be numeric");
			submitLabel.setForeground(Color.red);
			capField.selectAll();
			capField.requestFocus();
		}
	}

	public void errorCheckCup(Java03 java03)
	{
		try
		{
			int quantity = 0;
			if(coffeeCup.isSelected())
			{
				String cupString = cupField.getText();
				quantity = Integer.parseInt(cupString);
				boolean errorCheck = java03.isCupQuantityValid(quantity);
				if(errorCheck)
				{
					submitLabel.setText("Quantity must be between 1 and 100");
					submitLabel.setForeground(Color.red);
					cupField.selectAll();
					cupField.requestFocus();
					return;
				}
			}

			java03.setCupQuantity(quantity);
			errorCheckCreditCard(java03);

		}
		catch(NumberFormatException e)
		{
			submitLabel.setText("Entry must be numeric");
			submitLabel.setForeground(Color.red);
			cupField.selectAll();
			cupField.requestFocus();
		}
	}

	public void errorCheckCreditCard(Java03 java03)
	{
			String creditString = creditField.getText();
			String creditCardType = cardType();
			NumberFormat num1 = NumberFormat.getCurrencyInstance();
			boolean errorCheck = java03.isCreditCardValid(creditString);
			if(!isNumeric(creditString) || creditString.length() < 1)
			{
				submitLabel.setText("Entry must be numeric");
				submitLabel.setForeground(Color.red);
				creditField.selectAll();
				creditField.requestFocus();
				return;
			}

			if(errorCheck)
			{
				submitLabel.setText("Field must be 16 characters long");
				submitLabel.setForeground(Color.red);
				creditField.selectAll();
				creditField.requestFocus();
				return;
			}
			if(creditCardType.equals(""))
			{
				submitLabel.setText("Please select your payment type.");
				submitLabel.setForeground(Color.red);
				return;
			}
			else
			{
				java03.setCreditCard(creditString);
				calculateTotal(java03);
				submitLabel.setText("Thank you for your order.  " + num1.format(java03.calculateGrandTotal()) + " will be added to your " + cardType());
				submitLabel.setForeground(Color.black);
			}
	}
	public boolean isNumeric(String strNumber)
	{
		boolean numeric = true;
		char[] numbers = strNumber.toCharArray();
		for(int x = 0; x < numbers.length; ++x)
		{
			if(Character.isDigit(numbers[x]))
			{
				numeric = true;
			}
			else
			{
				numeric = false;
				return numeric;
			}
		}
		return numeric;
	}
}