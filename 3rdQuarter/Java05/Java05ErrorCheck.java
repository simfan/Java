import java.util.*;

public class Java05ErrorCheck
{
	private int id;
	private String firstName;
	private String lastName;
	private String claim;
	private String date;
	private double amount;
	private String payment;

	Java05ErrorCheck()
	{
		id = 0;
		firstName = "";
		lastName = "";
		claim = "";
		date = "";
		amount = 0;
		payment = "";
	}

	Java05ErrorCheck(int id, String firstName, String lastName, String claim, String date, double amount, String payment)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.claim = claim;
		this.date = date;
		this.amount = amount;
		this.payment = payment;
	}

	public void setID(int id)
	{
		this.id = id;
	}

	public int getID()
	{
		return id;
	}

	public boolean isFirstNameValid(String firstName)
	{
		if (firstName.length() <1 || firstName.length() > 15)
			return true;
		else
			return false;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public boolean isLastNameValid(String lastName)
	{
		if (lastName.length() <1 || lastName.length() > 15)
			return true;
		else
			return false;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setClaim(String claim)
	{
		this.claim = claim;
	}

	public String getClaim()
	{
		return claim;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public String getDate()
	{
		return date;
	}

	public void setAmount(double amount)
	{
		this.amount = amount;
	}

	public double getAmount()
	{
		return amount;
	}

	public void setPayment(String payment)
	{
		this.payment = payment;
	}

	public String getPayment()
	{
		return payment;
	}
}