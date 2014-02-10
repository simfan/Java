/* Chris Glock
 * 11/8/2005
 * Java02*/

import java.util.*;
public class Java02
{
	private int employeeNumber;
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeSSN;
	private double hoursWorked;
	private double rateOfPay;
	private double ficaTaxRate;
	private double pensionRate;

	//***************************
    //********Constructors*******
	Java02()//constructors that accepts no arguments
	{
		employeeNumber = 0;
		employeeFirstName = "";
		employeeLastName = "";
		employeeSSN = "";
		hoursWorked = 0;
		rateOfPay = 0;
		ficaTaxRate = 0;
		pensionRate = 0;
	}
	Java02(int employeeNumber, String employeeFirstName, String employeeLastName, String employeeSSN, double hoursWorked, double rateOfPay, double ficaTaxRate, double pensionRate)
	{
		this.employeeNumber = employeeNumber;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeSSN = employeeSSN;
		this.hoursWorked = hoursWorked;
		this.rateOfPay = rateOfPay;
		this.ficaTaxRate = ficaTaxRate;
		this.pensionRate = pensionRate;
	}

	//***************************
	//*Call and check variables**
	public boolean isNumberValid(int employeeNumber)
	{
		if(employeeNumber<1 || employeeNumber> 5000)
			return true;
		else
			return false;
	}
	//***************************
	public void setEmployeeNumber(int employeeNumber)
	{
		this.employeeNumber = employeeNumber;
	}
	//***************************
	public int getEmployeeNumber()
	{
		return employeeNumber;
	}
	//***************************
	public boolean isFirstNameValid(String employeeFirstName)
	{
		if(employeeFirstName.length() < 0|| employeeFirstName.length()> 15)
			return true;
		else
			return false;
	}
	//***************************
	public void setEmployeeFirstName(String employeeFirstName)
	{
		this.employeeFirstName = employeeFirstName;
	}
	//***************************
	public String getEmployeeFirstName()
	{
		return employeeFirstName;
	}
	//***************************
	public boolean isLastNameValid(String employeeLastName)
	{
		if(employeeLastName.length() < 0|| employeeLastName.length()> 15)
			return true;
		else
			return false;
	}
	//***************************
	public void setEmployeeLastName(String employeeLastName)
	{
		this.employeeLastName = employeeLastName;
	}
	//***************************
	public String getEmployeeLastName()
	{
		return employeeLastName;
	}
	//***************************
	public boolean isEmployeeSSNValid(String employeeSSN)
	{
		if(employeeSSN.length()!=9)
			return true;
		else
			return false;
	}
	//***************************
	public void setEmployeeSSN(String employeeSSN)
	{
		this.employeeSSN = employeeSSN;
	}
	//***************************
	public String getEmployeeSSN()
	{
		return employeeSSN;
	}
	//***************************
	public boolean areHoursWorkedValid(double hoursWorked)
	{
		if(hoursWorked<.25 || hoursWorked>80)
			return true;
		else
			return false;
	}
	//***************************
	public void setHoursWorked(double hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}
	//***************************
	public double getHoursWorked()
	{
		return hoursWorked;
	}
	//***************************
	public boolean isRateOfPayValid(double rateOfPay)
	{
		if(rateOfPay<5.15||rateOfPay>25)
			return true;
		else
			return false;
	}
	//***************************
	public void setRateOfPay(double rateOfPay)
	{
		this.rateOfPay = rateOfPay;
	}
	//***************************
	public double getRateOfPay()
	{
		return rateOfPay;
	}
	//***************************
	public boolean isFICATaxRateValid(double ficaTaxRate)
	{
		if(ficaTaxRate<7.65||ficaTaxRate>9.36)
			return true;
		else
			return false;
	}
	//***************************
	public void setFICATaxRate(double ficaTaxRate)
	{
		this.ficaTaxRate = ficaTaxRate;
	}
	//***************************
	public double getFICATaxRate()
	{
		return ficaTaxRate;
	}
	//***************************
	public boolean isPensionRateValid(double pensionRate)
	{
		if(pensionRate<0||pensionRate>6)
			return true;
		else
			return false;
	}
	public void setPensionRate(double pensionRate)
	{
		this.pensionRate = pensionRate;
	}
	public double getPensionRate()
	{
		return pensionRate;
	}
	//***************************
	//*******Calculations********
	public double calculateGrossPay()
	{
		double overTime;
		double overTimePay;
		double grossPay;
		if(hoursWorked>40)
		{
			overTime = hoursWorked - 40;
			overTimePay = overTime * rateOfPay * 1.5;
		}
		else
		{
			overTime = 0;
			overTimePay = 0;
		}
		grossPay = rateOfPay * hoursWorked + overTimePay;
		return grossPay;
	}
	//***************************
	public double calculateFICATax()
	{
		double ficaTax;
		ficaTax = ficaTaxRate * .01 * calculateGrossPay();
		return ficaTax;
	}
	//***************************
	public double calculatePension()
	{
		double pension;
		pension = pensionRate * .01 * calculateGrossPay();
		return pension;
	}
	//***************************
	public double calculateNetPay()
	{
		double netPay;
		netPay = calculateGrossPay() - calculateFICATax() -calculatePension();
		return netPay;
	}
}