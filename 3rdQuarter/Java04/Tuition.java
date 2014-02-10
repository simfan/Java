/* Chris Glock
 * 1/17/06
 * Tuition */

import java.util.*;
public class Tuition
{
	//declare variables
	protected int studentNumber;
	protected String studentFirstName;
	protected String studentLastName;
	protected String studentAddress;
	protected String studentCity;
	protected String studentState;
	protected int month;
	protected int day;
	protected int year;
	protected double numberOfHours;
	protected String strNumber;

	//Constants
	protected double costPerHour = 31.5;
	protected int graduationFee = 25;
	protected int activitiesFee =12;

	//**************************
	//Constructors
	//**************************

	Tuition() //no arguments
	{
		studentNumber = 0;
		studentFirstName = "";
		studentLastName = "";
		studentAddress = "";
		studentCity = "";
		month = 0;
		day = 0;
		year = 0;
		numberOfHours = 0;
		strNumber = "";
	}

	Tuition(int studentNumber, String studentFirstName, String studentLastName, String studentAddress, String studentCity, String studentState, int month, int day, int year, double numberOfHours, String strNumber)
	{
		this.studentNumber = studentNumber;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentAddress = studentAddress;
		this.studentCity = studentCity;
		this.month = month;
		this.day = day;
		this.year = year;
		this.numberOfHours = numberOfHours;
		this.strNumber = strNumber;
	}

	//*****************************************
	// Methods to validate, set, and get values
	//*****************************************

	public boolean isStuNumValid(int studentNumber)
	{
		if(studentNumber<1 || studentNumber>99999)
			return true;
		else
			return false;
	}

	public void setStuNum(int studentNumber)
	{
		this.studentNumber = studentNumber;
	}

	public int getStuNum()
	{
		return studentNumber;
	}
	//******************************************
	//******************************************
	public boolean isStuFirstNameValid(String studentFirstName)
	{
		if(studentFirstName.length()<1||studentFirstName.length()>15)
			return true;
		else
			return false;
	}

	public void setStuFirstName(String studentFirstName)
	{
		this.studentFirstName = studentFirstName;
	}

	public String getStuFirstName()
	{
		return studentFirstName;
	}
	//******************************************
	//******************************************
	public boolean isStuLastNameValid(String studentLastName)
	{
		if(studentLastName.length()<1||studentLastName.length()>15)
			return true;
		else
			return false;
	}

	public void setStuLastName(String studentLastName)
	{
		this.studentLastName = studentLastName;
	}

	public String getStuLastName()
	{
		return studentLastName;
	}
	//******************************************
	//******************************************
	public boolean isAddressValid(String studentAddress)
	{
		if(studentAddress.length()<1||studentAddress.length()>20)
			return true;
		else
			return false;
	}

	public void setAddress(String studentAddress)
	{
		this.studentAddress = studentAddress;
	}

	public String getAddress()
	{
		return studentAddress;
	}
	//******************************************
	//******************************************
	public boolean isCityValid(String studentCity)
	{
		if(studentCity.length()<1||studentCity.length()>15)
			return true;
		else
			return false;
	}

	public void setCity(String studentCity)
	{
		this.studentCity = studentCity;
	}

	public String getCity()
	{
		return studentCity;
	}
	//******************************************
	//******************************************
	public boolean isStateValid(String studentState)
	{
		if(studentState.length()!=2)
			return true;
		else
			return false;
	}

	public void setState(String studentState)
	{
		this.studentState = studentState;
	}

	public String getState()
	{
		return studentState;
	}
	//******************************************
	//******************************************
	public boolean isMonthValid(int month)
	{
		if(month <1||month >12)
			return true;
		else
			return false;
	}

	public void setMonth(int month)
	{
		this.month = month;
	}

	public int getMonth()
	{
		return month;
	}
	//******************************************
	//******************************************
	public boolean isDayValid(int day)
	{
		if(day <1||day >31)
			return true;
		else
			return false;
	}

	public void setDay(int day)
	{
		this.day = day;
	}

	public int getDay()
	{
		return day;
	}

	 public boolean isYearValid(int year)
	{
		if(year <0||year >99)
			return true;
		else
			return false;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public int getYear()
	{
		return year;
	}
	//******************************************
	//******************************************
	public boolean isNumOfHoursValid(double numberOfHours)
	{
		if(numberOfHours<1||numberOfHours>22.5)
			return true;
		else
			return false;
	}

	public void setNumOfHours(double numberOfHours)
	{
		this.numberOfHours = numberOfHours;
	}

	public double getNumOfHours()
	{
		return numberOfHours;
	}
	//******************************************
	//******************************************

	//******************************
	// Check entry for numeric value
	//******************************

	public boolean isNumeric(String strNumber)
	{
		boolean numeric = true;
		char[] numbers = strNumber.toCharArray();
		for(int x = 0; x < numbers.length; ++x)
		{
			if(Character.isDigit(numbers[x]))
				numeric = true;
			else
			{
				numeric = false;
				return numeric;
			}
		}
		return numeric;
	}

	//***********************
	// Calculate Tuition
	//***********************

	public double calcTuition()
	{
		double tuition = 0;
		tuition = numberOfHours * costPerHour + activitiesFee + graduationFee;
		return tuition;
	}
}