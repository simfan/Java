/* Chris Glock
 * 3/15/2006
 * OnlineBooks
 */

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class OnlineBooks extends JFrame implements ActionListener, ItemListener
{
	JLabel dateLabel, heading, bookLabel, priceLabel, fNameLabel, lNameLabel, quantityLabel, addressLabel, cityLabel, stateLabel, zipLabel, creditLabel, imageLabel, results;
	JTextField priceField, fNameField, lNameField, quantityField, addressField, cityField, zipField, creditField;
	JRadioButton overnight, rush, standard, hidden;//4 radio buttons; 3 visible, 1 invisible,
	JCheckBox hardback, wrapped, autographed;
	JComboBox bookBox, priceBox, stateBox;
	JButton submitButton, exitButton, cancelButton;

	ButtonGroup group =new ButtonGroup();
	DataOutputStream ostream;
	Font headingFont = new Font("Broadway", Font.BOLD, 20);

	String[] books = {"Select book", "Football Physics", "Harry Potter and the Sorcerer's Stone", "Lord of the Rings"};
	String[] states = {"Select state", "AK", "AL", "AR", "AZ", "CA",
					   "CO", "CT", "DC", "DE", "FL", "GA", "HI", "IA",
					   "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD",
					   "ME", "MI", "MN", "MO", "MT", "NC", "ND", "NE",
					   "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR",
					   "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT",
					   "VA", "VI", "WA", "WI", "WV", "WY"};
    String[] prices = {"", "9.89", "6.88", "14.99"};

    ImageIcon bookPic = new ImageIcon("parcel.gif");

    GregorianCalendar aCalendar = new GregorianCalendar();
    int amonth = aCalendar.get(aCalendar.MONTH) + 1;
	int aday = aCalendar.get(aCalendar.DAY_OF_MONTH);
	int ayear =aCalendar.get(aCalendar.YEAR);

	public OnlineBooks()
	{
		//create JPanel
		super("OnlineBooks Bookstore");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try
		{
			ostream = new DataOutputStream(
					  new BufferedOutputStream(
					  new FileOutputStream("onlineStores.dat", true)));
		}

		catch(IOException e1)
		{
			System.err.println("File is not open");
			System.exit(1);
		}



		JPanel pane = new JPanel();
		setContentPane(pane);
		pane.setLayout(null);
		pane.setBackground(Color.yellow);

		dateLabel = new JLabel(amonth+"/"+aday+"/"+ayear);
		dateLabel.setSize(101,20);
		dateLabel.setLocation(10,20);
		pane.add(dateLabel);

		heading = new JLabel ("Online Books");
		heading.setSize(300,40);
		heading.setLocation(150,10);
		heading.setFont(headingFont);
		pane.add(heading);

		bookLabel = new JLabel ("Book Title");
		bookLabel.setSize(150,20);
		bookLabel.setLocation(10,60);
		pane.add(bookLabel);

		bookBox = new JComboBox(books);
		bookBox.setSize(200,20);
		bookBox.setLocation(101,60);
		bookBox.addItemListener(this);
		pane.add(bookBox);

		priceBox = new JComboBox(prices);

		priceLabel = new JLabel("Price");
		priceLabel.setSize(101,20);
		priceLabel.setLocation(330, 60);
		pane.add(priceLabel);

		priceField = new JTextField(20);
		priceField.setSize(50,20);
		priceField.setLocation(370,60);
			priceField.setEnabled(false);
			priceField.setDisabledTextColor(Color.black);
		//priceField.addItemListener(this);
		pane.add(priceField);

		overnight = new JRadioButton("Overnight                  - $3.50");
		overnight.setSize(200,20);
		overnight.setLocation(330,105);
		overnight.setBackground(Color.yellow);
		group.add(overnight);
		pane.add(overnight);

		rush = new JRadioButton("Rush (2-3 days)       - $2.75");
		rush.setSize(200,20);
		rush.setLocation(330,125);
		rush.setBackground(Color.yellow);
		group.add(rush);
		pane.add(rush);

		standard = new JRadioButton("Standard (1 week)  - $2.00");
		standard.setSize(200,20);
		standard.setLocation(330,145);
		standard.setBackground(Color.yellow);
		group.add(standard);
		pane.add(standard);

		hidden = new JRadioButton("",true);
		group.add(hidden);

		quantityLabel = new JLabel("Quantity");
		quantityLabel.setSize(150,20);
		quantityLabel.setLocation(10,90);
		pane.add(quantityLabel);

		quantityField = new JTextField(10);
		quantityField.setSize(50,20);
		quantityField.setLocation(251,90);
		quantityField.setText("0");
		pane.add(quantityField);

		fNameLabel = new JLabel("First Name");
		fNameLabel.setSize(150,20);
		fNameLabel.setLocation(10,120);
		pane.add(fNameLabel);

		fNameField = new JTextField(20);
		fNameField.setSize(200,20);
		fNameField.setLocation(101,120);
		pane.add(fNameField);

		lNameLabel = new JLabel("Last Name");
		lNameLabel.setSize(150,20);
		lNameLabel.setLocation(10,150);
		pane.add(lNameLabel);

		lNameField = new JTextField(20);
		lNameField.setSize(200,20);
		lNameField.setLocation(101,150);
		pane.add(lNameField);

		addressLabel = new JLabel("Address");
		addressLabel.setSize(150,20);
		addressLabel.setLocation(10,180);
		pane.add(addressLabel);

		addressField = new JTextField(20);
		addressField.setSize(200,20);
		addressField.setLocation(101,180);
		pane.add(addressField);

		hardback = new JCheckBox("Hardback       - $2.00");
		hardback.setSize(200,20);
		hardback.setLocation(330,180);
		hardback.setBackground(Color.yellow);
		pane.add(hardback);

		wrapped = new JCheckBox("Wrapped        - $1.50");
		wrapped.setSize(200,20);
		wrapped.setLocation(330, 200);
		wrapped.setBackground(Color.yellow);
		pane.add(wrapped);

		autographed = new JCheckBox("Autographed - $5.00");
		autographed.setSize(200,20);
		autographed.setLocation(330,220);
		autographed.setBackground(Color.yellow);
		pane.add(autographed);

		cityLabel = new JLabel("City");
		cityLabel.setSize(75,20);
		cityLabel.setLocation(10,210);
		pane.add(cityLabel);

		cityField = new JTextField(20);
		cityField.setSize(150, 20);
		cityField.setLocation(101, 210);
		pane.add(cityField);

		stateLabel = new JLabel("State");
		stateLabel.setSize(75,20);
		stateLabel.setLocation(10, 240);
		pane.add(stateLabel);

		stateBox = new JComboBox(states);
		stateBox.setSize(125,20);
		stateBox.setLocation(101,240);
		pane.add(stateBox);

		zipLabel = new JLabel("Zip Code");
		zipLabel.setSize(75,20);
		zipLabel.setLocation(10,270);
		pane.add(zipLabel);

		zipField = new JTextField(5);
		zipField.setSize(75,20);
		zipField.setLocation(101,270);
		pane.add(zipField);

		imageLabel = new JLabel(bookPic);
		imageLabel.setSize(160,120);
		imageLabel.setLocation(330, 250);
		pane.add(imageLabel);

		creditLabel = new JLabel("Credit Card");
		creditLabel.setSize(101,20);
		creditLabel.setLocation(10,301);
		pane.add(creditLabel);

		creditField = new JTextField(16);
		creditField.setSize(125,20);
		creditField.setLocation(101,301);
		pane.add(creditField);

		results = new JLabel("");
		results.setSize(420,20);
		results.setLocation(10,340);
		pane.add(results);

		exitButton = new JButton("Exit");
		exitButton.setSize(101,30);
		exitButton.setLocation(321,370);
		exitButton.addActionListener(this);
		pane.add(exitButton);

		submitButton = new JButton("Submit");
		submitButton.setSize(101,30);
		submitButton.setLocation(101,370);
		submitButton.addActionListener(this);
		pane.add(submitButton);

		cancelButton = new JButton("Cancel");
		cancelButton.setSize(101,30);
		cancelButton.setLocation(211,370);
		cancelButton.addActionListener(this);
		pane.add(cancelButton);

	}

	public static void main(String[] args)
	{

		JFrame aFrame = new OnlineBooks();
		aFrame.setSize(525, 440);
		aFrame.setVisible(true);
	}

	//When a book is selected from the combo box, its price is displayed in the price label.
	public void itemStateChanged(ItemEvent e)
	{
		int bookIndex = bookBox.getSelectedIndex();
		String priceString = priceBox.getItemAt(bookIndex).toString();
		priceField.setText(priceString);

	}

	//Occurs when one of the three buttons is clicked
	public void actionPerformed(ActionEvent ex)
	{
		try
		{
			Object source = ex.getSource();

			Java06 java06 = new Java06();
			if(source == exitButton)
			{
				ostream.close();
				System.exit(0);

			}
			else if(source == submitButton)
			{
				errorCheckBook(java06);
			}
			else if(source == cancelButton)
			{
				results.setText("");
				clearFields();
			}

		}
		catch(IOException e1)
		{
			System.err.println("Error writing to file");
			System.exit(1);
		}
	}

	//The following methods perform error checking occurs for all text fields, combo boxes,
	//and radio buttons when the Submit button is clicked.
	public void errorCheckBook(Java06 java06)
	{
		int bookIndex = 0;
		String priceString = "";
		double price = 0;
		if(bookBox.getSelectedIndex() == 0)
		{
			results.setText("                                                                        Please select a book.");
			results.setForeground(Color.red);
			bookBox.requestFocus();
			return;
		}
	 	else
		{
			price = Double.parseDouble(priceField.getText());

			java06.setPrice(price);
			java06.setBook(bookBox.getSelectedItem().toString());
		 	errorCheckQuantity(java06);
		}
	}

	public void errorCheckQuantity(Java06 java06)
	{
		try
		{

			int quantity = Integer.parseInt(quantityField.getText());
			boolean errorCheck = java06.isQuantityValid(quantity);
			if(errorCheck)
			{
				results.setText("                                           Quantity must be between 1 and 100 inclusive.");
				results.setForeground(Color.red);
				quantityField.requestFocus();
				quantityField.selectAll();
				return;
			}
			else
			{

				java06.setQuantity(quantity);
				errorCheckFName(java06);
			}
		}

		catch(NumberFormatException e2)
		{
			results.setText("                                                 Quantity must be numeric.");
			results.setForeground(Color.red);
			quantityField.requestFocus();
			quantityField.selectAll();
			return;
		}
	}


	public void errorCheckFName(Java06 java06)
	{
		boolean errorCheck = java06.isFirstNameValid(fNameField.getText());
		if (errorCheck)
		{
			results.setText("                                     First name must be between 1 and 20 characters.");
			results.setForeground(Color.red);
			fNameField.requestFocus();
			fNameField.selectAll();
			return;
		}

		else
		{
			java06.setFirstName(fNameField.getText());
			errorCheckLName(java06);
		}
	}

	public void errorCheckLName(Java06 java06)
	{
		boolean errorCheck = java06.isLastNameValid(lNameField.getText());
		if (errorCheck)
		{
			results.setText("                                    Last name must be between 1 and 20 characters.");
			results.setForeground(Color.red);
			lNameField.requestFocus();
			lNameField.selectAll();
			return;
		}

		else
		{
			java06.setLastName(lNameField.getText());
			errorCheckAddress(java06);
		}
	}

	public void errorCheckAddress(Java06 java06)
	{
		boolean errorCheck = java06.isAddressValid(addressField.getText());
		if (errorCheck)
		{
			results.setText("                              Address must be between 1 and 20 characters.");
			results.setForeground(Color.red);
			addressField.requestFocus();
			addressField.selectAll();
			return;
		}

		else
		{
			java06.setAddress(addressField.getText());
			errorCheckCity(java06);
		}
	}

	public void errorCheckCity(Java06 java06)
	{
		boolean errorCheck = java06.isCityValid(cityField.getText());
		if (errorCheck)
		{
			results.setText("                             City must be between 1 and 20 characters.");
			results.setForeground(Color.red);
			cityField.requestFocus();
			cityField.selectAll();
			return;
		}

		else
		{
			java06.setCity(cityField.getText());
			errorCheckState(java06);
		}
	}

	public void errorCheckState(Java06 java06)
	{
		if(stateBox.getSelectedIndex() == 0)
		{
			results.setText("                                                                        Please select a state.");
			results.setForeground(Color.red);
			stateBox.requestFocus();
			return;
		}
		else
		{
			java06.setState(stateBox.getSelectedItem().toString());
			errorCheckZip(java06);
		}
	}
 	public void errorCheckZip(Java06 java06)
	{
		int zipCode = 0;
		try
		{
			zipCode = Integer.parseInt(zipField.getText());
			boolean errorCheck = java06.isZipCodeValid(zipField.getText());
			if (errorCheck)
			{
				results.setText("                                  Zip code must be 5 characters long.");
				results.setForeground(Color.red);
				zipField.requestFocus();
				zipField.selectAll();
				return;
			}
			else
			{
				java06.setZipCode(zipField.getText());
				errorCheckCredit(java06);
			}
		}
		catch(NumberFormatException e2)
		{
			results.setText("                                     Zip code must be numeric.");
			results.setForeground(Color.red);
			zipField.requestFocus();
			zipField.selectAll();
			return;
		}
	}
	public void errorCheckCredit(Java06 java06)
	{
		long creditCard = 0;
		try
		{
			creditCard = Long.parseLong(creditField.getText());
			boolean errorCheck = java06.isCreditCardValid(creditField.getText());
			if (errorCheck)
			{
				results.setText("                               Credit card number must be 16 characters long.");
				results.setForeground(Color.red);
				creditField.requestFocus();
				creditField.selectAll();
				return;
			}
			else
			{
				java06.setCreditCard(creditField.getText());
				errorCheckShipping(java06);
			}
		}
		catch(NumberFormatException e3)
		{
			results.setText("                                 Credit card must be numeric.");
			results.setForeground(Color.red);
			creditField.requestFocus();
			creditField.selectAll();
			return;
		}
	}

	public void errorCheckShipping(Java06 java06)
	{
		String shipping = "";
		double shippingCharge = 0;
		if (hidden.isSelected())
		{
			results.setText("                                               Please select a shipping method.");
			results.setForeground(Color.red);
			return;
		}
		else
		{
			if (overnight.isSelected())
			{
				shipping = "Overnight";
				shippingCharge = 3.50;
			}

			if (rush.isSelected())
			{
				shipping = "Rush";
				shippingCharge = 2.75;
			}

			if (standard.isSelected())
			{
				shipping = "Standard";
				shippingCharge = 2.00;
			}

			java06.setShipping(shippingCharge);
			writeRecord(java06);
		}
	}

	//after all error checking is finished, the following method is executed.  It determines the extra charges, then
	//writes all fields to a file.
	public void writeRecord(Java06 java06)
	{
		NumberFormat num1 = NumberFormat.getCurrencyInstance();
		double extraCharges = 0;
		if (hardback.isSelected())
		{
			extraCharges = extraCharges + 2;
		}

		if (wrapped.isSelected())
		{
			extraCharges = extraCharges + 1.5;
		}

		if (autographed.isSelected())
		{
			extraCharges = extraCharges + 5;
		}
		java06.setExtraCharges(extraCharges);

		try
		{
			ostream.writeUTF(java06.getBook());
			ostream.writeDouble(java06.getPrice());
			ostream.writeInt(java06.getQuantity());
			ostream.writeDouble(java06.getShipping());
			ostream.writeDouble(java06.getExtraCharges());
			ostream.writeUTF(java06.getFirstName());
			ostream.writeUTF(java06.getLastName());
			ostream.writeUTF(java06.getAddress());
			ostream.writeUTF(java06.getCity());
			ostream.writeUTF(java06.getState());
			ostream.writeUTF(java06.getZipCode());
			ostream.writeUTF(java06.getCreditCard());
			ostream.writeDouble(java06.calculateGrandTotal());

			results.setText("The record has been written.  Your total comes to " + num1.format(java06.calculateGrandTotal()) + ".");
			results.setForeground(Color.black);

			clearFields();

		}
		catch(IOException e3)
		{
			System.err.println("Error writing to file");
			System.exit(1);
		}
	}

	//This method resets all fields, check boxes, combo boxes, and radio buttons to their original states.

	public void clearFields()
	{
		bookBox.setSelectedIndex(0);
		quantityField.setText("0");
		fNameField.setText("");
		lNameField.setText("");
		addressField.setText("");
		cityField.setText("");
		stateBox.setSelectedIndex(0);
		zipField.setText("");
		creditField.setText("");
		hidden.setSelected(true);
		hardback.setSelected(false);
		wrapped.setSelected(false);
		autographed.setSelected(false);
	}

}


