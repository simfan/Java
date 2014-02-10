import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReadFlexibleSpendingFile extends JFrame implements ActionListener
{
	JLabel heading, idLabel, firstNameLabel, lastNameLabel, claimLabel, serviceLabel, amountLabel, paymentLabel;
	JTextField idField, firstNameField, lastNameField, claimField, serviceField, amountField, paymentField;
	JButton viewResults;

	DataInputStream istream;
	Font headingFont = new Font("Broadway", Font.BOLD, 20);

	public ReadFlexibleSpendingFile()
	{
		super("Read Flexible Spending File");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try
		{
			istream = new DataInputStream(
					  new BufferedInputStream(
					  new FileInputStream("flexibleSpendingFile.dat")));
		}

		catch(IOException e1)
		{
			System.err.println("File not opened");
			System.exit(1);
		}

		JPanel pane = new JPanel();
		setContentPane(pane);
		pane.setLayout(null);

		heading = new JLabel("Flexible Spending Accounts");
		heading.setSize(350, 30);
		heading.setLocation(20,20);
		heading.setFont(headingFont);
		pane.add(heading);

		idLabel = new JLabel("Employee ID");
		idLabel.setSize(75,20);
		idLabel.setLocation(10,75);
		pane.add(idLabel);

		idField = new JTextField(10);
		idField.setSize(75,20);
		idField.setLocation(125,75);
			idField.setEnabled(false);
			idField.setDisabledTextColor(Color.black);
		pane.add(idField);

		firstNameLabel = new JLabel("First Name");
		firstNameLabel.setSize(75,20);
		firstNameLabel.setLocation(10,105);
		pane.add(firstNameLabel);

		firstNameField = new JTextField(15);
		firstNameField.setSize(125,20);
		firstNameField.setLocation(125,105);
			firstNameField.setEnabled(false);
			firstNameField.setDisabledTextColor(Color.black);
		pane.add(firstNameField);

		lastNameLabel = new JLabel("Last Name");
		lastNameLabel.setSize(75,20);
		lastNameLabel.setLocation(10,135);
		pane.add(lastNameLabel);

		lastNameField = new JTextField(20);
		lastNameField.setSize(150,20);
		lastNameField.setLocation(125,135);
			lastNameField.setEnabled(false);
			lastNameField.setDisabledTextColor(Color.black);
		pane.add(lastNameField);

		claimLabel = new JLabel("Claim Type");
		claimLabel.setSize(75,20);
		claimLabel.setLocation(10,165);
		pane.add(claimLabel);

		claimField = new JTextField(20);
		claimField.setSize(150,20);
		claimField.setLocation(125,165);
			claimField.setEnabled(false);
			claimField.setDisabledTextColor(Color.black);
		pane.add(claimField);

		serviceLabel = new JLabel("Service Date");
		serviceLabel.setSize(75,20);
		serviceLabel.setLocation(10,195);
		pane.add(serviceLabel);

		serviceField = new JTextField(20);
		serviceField.setSize(150,20);
		serviceField.setLocation(125,195);
			serviceField.setEnabled(false);
			serviceField.setDisabledTextColor(Color.black);
		pane.add(serviceField);

		amountLabel = new JLabel("Amount Requested");
		amountLabel.setSize(125,20);
		amountLabel.setLocation(10,225);
		pane.add(amountLabel);

		amountField = new JTextField(10);
		amountField.setSize(75,20);
		amountField.setLocation(125,225);
			amountField.setEnabled(false);
			amountField.setDisabledTextColor(Color.black);
		pane.add(amountField);

		paymentLabel = new JLabel("Payment Type");
		paymentLabel.setSize(125,20);
		paymentLabel.setLocation(10,255);
		pane.add(paymentLabel);

		paymentField = new JTextField(25);
		paymentField.setSize(125,20);
		paymentField.setLocation(125,255);
			paymentField.setEnabled(false);
			paymentField.setDisabledTextColor(Color.black);
		pane.add(paymentField);

		viewResults = new JButton("View Results");
		viewResults.setSize(150,20);
		viewResults.setLocation(100,285);
		viewResults.addActionListener(this);
		pane.add(viewResults);
	}

	public static void main(String [] args)
	{
		JFrame aFrame = new ReadFlexibleSpendingFile();
		aFrame.setSize(400, 350);
		aFrame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e1)
	{
		String id, firstName, lastName, claim, date, amount, payment;
		try
		{
			id = istream.readUTF();
			firstName = istream.readUTF();
			lastName = istream.readUTF();
			claim = istream.readUTF();
			date = istream.readUTF();
			amount = istream.readUTF();
			payment = istream.readUTF();

			idField.setText(id);
			firstNameField.setText(firstName);
			lastNameField.setText(lastName);
			claimField.setText(claim);
			serviceField.setText(date);
			amountField.setText(amount);
			paymentField.setText(payment);
		}
		catch(EOFException e2)
		{
			closeFile();
		}

		catch(IOException e3)
		{
			System.err.println("Error reading file");
			System.exit(1);
		}
	}
	public void closeFile()
	{
		try
		{
			istream.close();
			System.exit(0);
		}
		catch(IOException e)
		{
			System.err.println("Error closing file");
			System.exit(1);
		}
	}
}
