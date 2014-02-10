import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
/*Chris Glock
 * 1/20/06
 * Java04A */


public class Java04A extends JFrame implements ActionListener
{
    //Set up the JFrame

	//Create buttons, labels, and text fields
	JButton btnCalculate = new JButton("Calculate Tuition");
    JLabel lblAddress = new JLabel("Address");
    JLabel lblCity = new JLabel("City");
    JLabel lblDOB = new JLabel("Date Of Birth (mm/dd/yy)");
    JLabel lblFirstName = new JLabel("First Name");
    JLabel lblLastName = new JLabel("Last Name");
    JLabel lblNumberOfHours = new JLabel("Number of Hours");
    JLabel lblResults = new JLabel("");
    JLabel lblState = new JLabel("State");
    JLabel lblStudentNumber = new JLabel("Student Number");
    JLabel lblTuitionCalculator = new JLabel("Tuition Calculator");
    JTextField txtAddress = new JTextField();
    JTextField txtCity = new JTextField();
    JTextField txtMonth = new JTextField();
    JTextField txtDay = new JTextField();
    JTextField txtYear = new JTextField();
    JTextField txtFirstName = new JTextField();
    JTextField txtLastName = new JTextField();
    JTextField txtNumberOfHours = new JTextField();
    JTextField txtState = new JTextField();
    JTextField txtStudentNumber = new JTextField();

    //Create a new Font
    Font bigFont = new Font ("Broadway", Font.BOLD, 20);

    //main method
    public static void main(String[] args)throws Exception
    {
        JFrame aFrame = new Java04A();
        aFrame.setSize(504,456);
        aFrame.setVisible(true);
    }

    public Java04A()
    {
        super("Java04A");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pane = new JPanel();
        pane.setLayout(null);
        pane.setBackground(Color.yellow);
        setContentPane(pane);

        //**************************************
        //Adds the compontents to the JFrame
        //**************************************

        pane.add(lblTuitionCalculator);
        lblTuitionCalculator.setLocation(150,40);
        lblTuitionCalculator.setSize(240,24);
        lblTuitionCalculator.setFont(bigFont);

        pane.add(lblResults);
        lblResults.setLocation(134,339);
        lblResults.setSize(350,16);

        pane.add(btnCalculate);
        btnCalculate.setLocation(183,299);
        btnCalculate.setSize(146,32);
        btnCalculate.addActionListener(this);

        pane.add(txtStudentNumber);
        txtStudentNumber.setLocation(312,99);
        txtStudentNumber.setSize(88,21);

        pane.add(txtNumberOfHours);
        txtNumberOfHours.setLocation(320,267);
        txtNumberOfHours.setSize(80,21);

        pane.add(txtMonth);
        txtMonth.setLocation(330,235);
        txtMonth.setSize(20,21);

        pane.add(txtDay);
        txtDay.setLocation(355,235);
        txtDay.setSize(20,21);

        pane.add(txtYear);
        txtYear.setLocation(380,235);
        txtYear.setSize(20,21);

        pane.add(txtState);
        txtState.setLocation(352,203);
        txtState.setSize(48,21);

        pane.add(txtCity);
        txtCity.setLocation(144,203);
        txtCity.setSize(144,21);

        pane.add(txtAddress);
        txtAddress.setLocation(272,171);
        txtAddress.setSize(128,21);

        pane.add(txtLastName);
        txtLastName.setLocation(272,147);
        txtLastName.setSize(128,21);

        pane.add(txtFirstName);
        txtFirstName.setLocation(272,123);
        txtFirstName.setSize(128,21);

        pane.add(lblNumberOfHours);
        lblNumberOfHours.setLocation(96,267);
        lblNumberOfHours.setSize(100,23);

        pane.add(lblDOB);
        lblDOB.setLocation(96,235);
        lblDOB.setSize(160,23);

        pane.add(lblState);
        lblState.setLocation(304,203);
        lblState.setSize(40,23);

        pane.add(lblCity);
        lblCity.setLocation(96,203);
        lblCity.setSize(40,23);

        pane.add(lblAddress);
        lblAddress.setLocation(96,171);
        lblAddress.setSize(104,24);

        pane.add(lblLastName);
        lblLastName.setLocation(96,147);
        lblLastName.setSize(104,16);

        pane.add(lblFirstName);
        lblFirstName.setLocation(96,123);
        lblFirstName.setSize(100,16);

        pane.add(lblStudentNumber);
        lblStudentNumber.setLocation(96,99);
        lblStudentNumber.setSize(96,16);
    }

    /* ActionListener Method */
    public void actionPerformed(ActionEvent e)
    {
	    Tuition tuition = new Tuition();
	    errorCheckNumber(tuition);
    }


    //***************************************************
    //The following methods check for any errors in input
    //***************************************************
    public void errorCheckNumber(Tuition tuition)
    {
	    String numberString = txtStudentNumber.getText();
	    int stuNumber;
	    boolean errorCheck;
	    if (!tuition.isNumeric(numberString) || numberString.length()<1)
	    {
		    lblResults.setText("Entry must be numeric.");
		    lblResults.setForeground(Color.red);
		    txtStudentNumber.selectAll();
		    txtStudentNumber.requestFocus();
		    return;
	    }
	    else
	    {
		    stuNumber = Integer.parseInt(numberString);
		    errorCheck = tuition.isStuNumValid(stuNumber);
	    }

	    if (errorCheck)
	    {
		    lblResults.setText("Entry must be between 1 and 99999.");
		    lblResults.setForeground(Color.red);
		    txtStudentNumber.selectAll();
		    txtStudentNumber.requestFocus();
		    return;
	    }
	    tuition.setStuNum(stuNumber);
	    errorCheckFirstName(tuition);
    }

    public void errorCheckFirstName(Tuition tuition)
    {
	    String firstName = txtFirstName.getText();
	    boolean errorCheck = tuition.isStuFirstNameValid(firstName);
	    if (errorCheck)
	    {
		    lblResults.setText("Entry must be between 1 and 15 characters long.");
		    lblResults.setForeground(Color.red);
		    txtFirstName.selectAll();
		    txtFirstName.requestFocus();
		    return;
	    }
	    tuition.setStuFirstName(firstName);
	    errorCheckLastName(tuition);
    }

     public void errorCheckLastName(Tuition tuition)
    {
	    String lastName = txtLastName.getText();
	    boolean errorCheck = tuition.isStuLastNameValid(lastName);
	    if (errorCheck)
	    {
		    lblResults.setText("Entry must be between 1 and 15 characters long.");
		    lblResults.setForeground(Color.red);
		    txtLastName.selectAll();
		    txtLastName.requestFocus();
		    return;
	    }
	    tuition.setStuLastName(lastName);
	    errorCheckAddress(tuition);
    }

     public void errorCheckAddress(Tuition tuition)
    {
	    String address = txtAddress.getText();
	    boolean errorCheck = tuition.isAddressValid(address);
	    if (errorCheck)
	    {
		    lblResults.setText("Entry must be between 1 and 20 characters long.");
		    lblResults.setForeground(Color.red);
		    txtAddress.selectAll();
		    txtAddress.requestFocus();
		    return;
	    }
	    tuition.setAddress(address);
	    errorCheckCity(tuition);
    }

     public void errorCheckCity(Tuition tuition)
    {
	    String city = txtCity.getText();
	    boolean errorCheck = tuition.isCityValid(city);
	    if (errorCheck)
	    {
		    lblResults.setText("Entry must be between 1 and 15 characters long.");
		    lblResults.setForeground(Color.red);
		    txtCity.selectAll();
		    txtCity.requestFocus();
		    return;
	    }
	    tuition.setCity(city);
	    errorCheckState(tuition);
    }

     public void errorCheckState(Tuition tuition)
    {
	    String state = txtState.getText();
	    boolean errorCheck = tuition.isStateValid(state);
	    if (errorCheck)
	    {
		    lblResults.setText("Entry must be 2 characters long.");
		    lblResults.setForeground(Color.red);
		    txtState.selectAll();
		    txtState.requestFocus();
		    return;
	    }
	    tuition.setState(state);
	    errorCheckMonth(tuition);
    }

    public void errorCheckMonth(Tuition tuition)
    {
	    String strMonth = txtMonth.getText();
	    int month;
	    boolean errorCheck;
	    if (!tuition.isNumeric(strMonth) || strMonth.length()<1)
	    {
		    lblResults.setText("Entry must be numeric.");
		    lblResults.setForeground(Color.red);
		    txtMonth.selectAll();
		    txtMonth.requestFocus();
		    return;
	    }
	    else
	    {
		    month = Integer.parseInt(strMonth);
		    errorCheck = tuition.isMonthValid(month);
	    }

	    if (errorCheck)
	    {
		    lblResults.setText("Entry must be between 1 and 12. ");
		    lblResults.setForeground(Color.red);
		    txtMonth.selectAll();
		    txtMonth.requestFocus();
		    return;
	    }
	    tuition.setMonth(month);
	    errorCheckDay(tuition);
    }

     public void errorCheckDay(Tuition tuition)
    {
	    String strDay = txtDay.getText();
	    int day;
	    boolean errorCheck;
	    if (!tuition.isNumeric(strDay) || strDay.length()<1)
	    {
		    lblResults.setText("Entry must be numeric.");
		    lblResults.setForeground(Color.red);
		    txtDay.selectAll();
		    txtDay.requestFocus();
		    return;
	    }
	    else
	    {
		    day = Integer.parseInt(strDay);
		    errorCheck = tuition.isDayValid(day);
	    }

	    if (errorCheck)
	    {
		    lblResults.setText("Entry must be between 1 and 31. ");
		    lblResults.setForeground(Color.red);
		    txtDay.selectAll();
		    txtDay.requestFocus();
		    return;
	    }
	    tuition.setDay(day);
	    errorCheckYear(tuition);
    }

     public void errorCheckYear(Tuition tuition)
    {
	    String strYear = txtYear.getText();
	    int year;
	    boolean errorCheck;
	    if (!tuition.isNumeric(strYear) || strYear.length()<1)
	    {
		    lblResults.setText("Entry must be numeric.");
		    lblResults.setForeground(Color.red);
		    txtYear.selectAll();
		    txtYear.requestFocus();
		    return;
	    }
	    else
	    {
		    year = Integer.parseInt(strYear);
		    errorCheck = tuition.isYearValid(year);
	    }

	    if (errorCheck)
	    {
		    lblResults.setText("Entry must be between 00 and 99. ");
		    lblResults.setForeground(Color.red);
		    txtYear.selectAll();
		    txtYear.requestFocus();
		    return;
	    }
	    tuition.setYear(year);
	    errorCheckHours(tuition);
    }

    public void errorCheckHours(Tuition tuition)
    {
	    try
	    {
	    	String strHours = txtNumberOfHours.getText();
	    	double hours;
	    	boolean errorCheck;
	        hours = Double.parseDouble(strHours);
		    errorCheck = tuition.isNumOfHoursValid(hours);
	        if (errorCheck)
	    	{
		    	lblResults.setText("Entry must be between 1 and 22.5. ");
		    	lblResults.setForeground(Color.red);
		    	txtNumberOfHours.selectAll();
		    	txtNumberOfHours.requestFocus();
		    	return;
	    	}
	    	tuition.setNumOfHours(hours);
	    	calculateTuition(tuition);
    	}
    	catch(NumberFormatException e)
    	{
	   	    lblResults.setText("Entry must be numeric.");
		    lblResults.setForeground(Color.red);
		    txtNumberOfHours.selectAll();
		    txtNumberOfHours.requestFocus();
		    return;
	    }
    }
	//****************************************************
	// Calculates the total tuition
	//****************************************************
    public void calculateTuition(Tuition tuition)
	{
		NumberFormat num1 = NumberFormat.getCurrencyInstance();
		lblResults.setForeground(Color.black);
		lblResults.setText(tuition.getStuNum() + " " + tuition.getStuFirstName() + " " + tuition.getStuLastName() + " Total Tuition Due: " + num1.format(tuition.calcTuition()));
	}
}
