import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreateFlexibleSpendingFile extends JFrame implements ActionListener
{
	JLabel heading, idLabel, firstNameLabel, lastNameLabel, claimLabel, serviceLabel, amountLabel, paymentLabel, results, results2;
	JTextField idField, firstNameField, lastNameField, amountField;
	JRadioButton healthCare, dependent, directDeposit, check, hidden, hidden2;
	JComboBox dateBox;
	JButton submit, anotherClaim, close;
	ButtonGroup claimGroup = new ButtonGroup();
	ButtonGroup paymentGroup = new ButtonGroup();

	DataOutputStream ostream;
	Font headingFont = new Font("Broadway", Font.BOLD, 20);
	int claimNum = 0;  //used with Employee number ex 55555-01
	String[] dates = {"January 1, 2006", "January 2, 2006", "January 3, 2006" ,
		"January 4, 2006", "January 5, 2006", "January 6, 2006", "January 7, 2006",
		"January 8, 2006", "January 9, 2006", "January 10, 2006","January 11, 2006",
		"January 12, 2006", "January 13, 2006", "January 14, 2006", "January 15, 2006",
		"January 16, 2006", "January 17, 2006", "January 18, 2006", "January 19, 2006",
		"January 20, 2006",	"January 21, 2006", "January 22, 2006", "January 23, 2006",
		"January 24, 2006", "January 25, 2006",	"January 26, 2006", "January 27, 2006",
		"January 28, 2006","January 29, 2006","January 30, 2006","January 31, 2006",
		"February 1, 2006", "February 2, 2006", "February 3, 2006" ,"February 4, 2006",
		"February 5, 2006",	"February 6, 2006", "February 7, 2006", "February 8, 2006",
		"February 9, 2006", "February 10, 2006","February 11, 2006", "February 12, 2006",
		"February 13, 2006", "February 14, 2006", "February 15, 2006","February 16, 2006",
		"February 17, 2006", "February 18, 2006", "February 19, 2006", "February 20, 2006"};


	public CreateFlexibleSpendingFile()
	{
		super("Create Flexible Spending File");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try
		{
			ostream = new DataOutputStream(
					  new BufferedOutputStream(
					  new FileOutputStream("flexibleSpendingFile.dat", true)));
		}

		catch(IOException e1)
		{
			System.err.println("File is not open");
			System.exit(1);
		}

		JPanel pane = new JPanel();
		setContentPane(pane);
		pane.setLayout(null);

		heading = new JLabel("Flexible Spending Accounts");
		heading.setSize(350, 30);
		heading.setLocation(75,20);
		heading.setFont(headingFont);
		pane.add(heading);

		idLabel = new JLabel("Employee ID");
		idLabel.setSize(75,20);
		idLabel.setLocation(10,75);
		pane.add(idLabel);

		idField = new JTextField(10);
		idField.setSize(75,20);
		idField.setLocation(95,75);
		pane.add(idField);

		firstNameLabel = new JLabel("First Name");
		firstNameLabel.setSize(75,20);
		firstNameLabel.setLocation(10,105);
		pane.add(firstNameLabel);

		firstNameField = new JTextField(15);
		firstNameField.setSize(125,20);
		firstNameField.setLocation(95,105);
		pane.add(firstNameField);

		lastNameLabel = new JLabel("Last Name");
		lastNameLabel.setSize(75,20);
		lastNameLabel.setLocation(10,135);
		pane.add(lastNameLabel);

		lastNameField = new JTextField(20);
		lastNameField.setSize(150,20);
		lastNameField.setLocation(95,135);
		pane.add(lastNameField);

		serviceLabel = new JLabel("Service Date");
		serviceLabel.setSize(75,20);
		serviceLabel.setLocation(10,165);
		pane.add(serviceLabel);

		dateBox = new JComboBox(dates);
		dateBox.setSize(150,20);
		dateBox.setLocation(95,165);
		//dateBox.addItem("Dates Go Here");
		pane.add(dateBox);

		amountLabel = new JLabel("Amount Requested");
		amountLabel.setSize(125,20);
		amountLabel.setLocation(10,195);
		pane.add(amountLabel);

		amountField = new JTextField(10);
		amountField.setSize(101,20);
		amountField.setLocation(144,195);
		pane.add(amountField);

		claimLabel = new JLabel("Claim Type");
		claimLabel.setSize(75,20);
		claimLabel.setLocation(300,75);
		pane.add(claimLabel);

		healthCare = new JRadioButton("Health Care");
		healthCare.setSize(101,20);
		healthCare.setLocation(300,95);
		claimGroup.add(healthCare);
		pane.add(healthCare);

		dependent = new JRadioButton("Dependent");
		dependent.setSize(101,20);
		dependent.setLocation(300,115);
		claimGroup.add(dependent);
		pane.add(dependent);

		hidden = new JRadioButton("");
		claimGroup.add(hidden);

		paymentLabel = new JLabel("Payment Request");
		paymentLabel.setSize(101,20);
		paymentLabel.setLocation(300,165);
		pane.add(paymentLabel);

		directDeposit = new JRadioButton("Direct Deposit");
		directDeposit.setSize(125,20);
		directDeposit.setLocation(300,185);
		paymentGroup.add(directDeposit);
		pane.add(directDeposit);

		check = new JRadioButton("Issue Check");
		check.setSize(101,20);
		check.setLocation(300,205);
		paymentGroup.add(check);
		pane.add(check);

		hidden2 = new JRadioButton("");
		paymentGroup.add(hidden2);

		submit = new JButton("Submit");
		submit.setSize(125,20);
		submit.setLocation(188,240);
		submit.addActionListener(this);
		pane.add(submit);

		anotherClaim = new JButton ("Enter Another Claim");
		anotherClaim.setSize(150,20);
		anotherClaim.setLocation(175,270);
		anotherClaim.setVisible(false);
		anotherClaim.addActionListener(this);
		pane.add(anotherClaim);

		results =new JLabel("");
		results.setSize(450,20);
		results.setLocation(20,300);
		pane.add(results);

		results2 =new JLabel("");
		results2.setSize(300,20);
		results2.setLocation(20,330);
		pane.add(results2);

		close = new JButton("Close");
		close.setSize(150,20);
		close.setLocation(325,330);
		close.addActionListener(this);
		pane.add(close);
	}

	public static void main (String[] args)
	{
		JFrame aFrame = new CreateFlexibleSpendingFile();
		aFrame.setSize(500,400);
		aFrame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ex)
	{
		Java05ErrorCheck java05 = new Java05ErrorCheck();
		int idNum;

	 	try
		{

			Object source = ex.getSource();
			if(source == submit)
			{
				idNum = Integer.parseInt(idField.getText());
				if (idNum < 1 || idNum > 99999)
					throw new NumberFormatException();
				java05.setID(idNum);
				checkFirstName(java05);
			}

			else if(source == anotherClaim)
			{

				idField.setText("");
				firstNameField.setText("");
				lastNameField.setText("");
				amountField.setText("");
				results.setText("");
				results2.setText("");

				hidden.setSelected(true);
				hidden2.setSelected(true);

				anotherClaim.setVisible(false);
				submit.setVisible(true);

			}
			else if(source == close)
			{
				ostream.close();
				System.exit(0);
			}
		}
		catch(NumberFormatException e2)
		{
			results.setText("Invalid Employee Number");
			results.setForeground(Color.red);
			idField.requestFocus();
			idField.setText("");
		}

	/*	catch(NumberFormatException e2)
		{
			results.setText("Invalid Amount");
			results.setForeground(Color.red);
			amountField.requestFocus();
			amountField.setText("");
		}*/
		catch(IOException e3)
		{
			System.err.println("Error writing to file");
			System.exit(1);
		}
	}
	public void checkFirstName(Java05ErrorCheck java05)
	{
		boolean errorCheck = java05.isFirstNameValid(firstNameField.getText());
		if (errorCheck)
		{
			results.setText("First name must be between 1 and 15 characters long.");
			results.setForeground(Color.red);
			firstNameField.selectAll();
			firstNameField.requestFocus();
			return;
		}
		java05.setFirstName(firstNameField.getText());
		checkLastName(java05);
	}
	public void checkLastName(Java05ErrorCheck java05)
	{
		boolean errorCheck = java05.isLastNameValid(lastNameField.getText());
		if (errorCheck)
		{
			results.setText("Last name must be between 1 and 20 characters long.");
			results.setForeground(Color.red);
			lastNameField.selectAll();
			lastNameField.requestFocus();
			return;
		}
		java05.setLastName(lastNameField.getText());
		checkClaim(java05);
	}

	public void checkClaim(Java05ErrorCheck java05)
	{
		String claim;
		if (healthCare.isSelected())
		{
			claim = "Health Care";
			java05.setClaim(claim);
			checkDate(java05);
		}
		else if (dependent.isSelected())
		{
			claim = "Dependent Child Care";
			java05.setClaim(claim);
			checkDate(java05);
		}
		else
		{
			results.setText("Please select a claim type");
			results2.setText("");
			results.setForeground(Color.red);
			return;
		}

	}

	public void checkDate(Java05ErrorCheck java05)
	{
		String date = (String)dateBox.getSelectedItem();

		java05.setDate(date);
		checkAmount(java05);
	}

	public void checkAmount(Java05ErrorCheck java05)
	{
		try
		{
			double amount;
			amount = Double.parseDouble(amountField.getText());
			if(amount < 1 || amount >10000)
				throw new NumberFormatException();
			java05.setAmount(amount);
			checkPayment(java05);
		}
		catch(NumberFormatException e4)
		{
			results.setText("Amount must be between 1 and 10000.00");
			results.setForeground(Color.red);
			amountField.requestFocus();
			amountField.setText("");
			return;
		}
	}

	public void checkPayment(Java05ErrorCheck java05)
	{

		String payment;
		if (directDeposit.isSelected())
		{
			payment = "Direct Deposit";
			java05.setPayment(payment);
			writeFile(java05);
		}
		else if (check.isSelected())
		{
			payment = "Issue Check";
			java05.setPayment(payment);
			writeFile(java05);
		}
		else
		{
			results.setText("Please select a payment type");
			results2.setText("");
			results.setForeground(Color.red);
			return;
		}
	}

	public void writeFile(Java05ErrorCheck java05)
	{
		try
		{
			claimNum = claimNum + 1;

	/*  ostream.writeUTF(idField.getText());
		ostream.writeUTF(firstNameField.getText());
		ostream.writeUTF(lastNameField.getText());
		ostream.writeUTF(amountField.getText());
   */
			ostream.writeUTF(idField.getText());
			ostream.writeUTF(java05.getFirstName());
			ostream.writeUTF(java05.getLastName());
			ostream.writeUTF(java05.getClaim());
			ostream.writeUTF(java05.getDate());
			ostream.writeUTF(amountField.getText());
			ostream.writeUTF(java05.getPayment());

			results.setForeground(Color.black);
			results.setText("The record has been successfully submitted.  Please fax receipts to");
			results2.setText("(401) 555-5555.  Claim NO: "  +java05.getID() + "-" + claimNum);

			submit.setVisible(false);
			anotherClaim.setVisible(true);

		}
		catch(IOException e3)
		{
			System.err.println("Error writing to file");
			System.exit(1);
		}
	}
}