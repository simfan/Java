


import java.util.*;
public class Java03
{
	private String name;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String creditCardNumber;
	private int watchQuantity;
	private int bandanaQuantity;
	private int shirtQuantity;
	private int capQuantity;
	private int cupQuantity;
	private double total;

	//Constructors
	//*************

	Java03()//Constructor that accepts no arguments
	{
		name = "";
		address = "";
		city = "";
		state = "";
		zipCode = "";
		creditCardNumber = "";
		watchQuantity = 0;
		bandanaQuantity = 0;
		shirtQuantity = 0;
		capQuantity = 0;
		cupQuantity = 0;
		total = 0;
	}

	Java03(String name, String address, String city, String state, String zipCode, String creditCardNumber, int watchQuantity, int bandanaQuantity, int shirtQuantity, int capQuantity, int cupQuantity, double total)
	{
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.creditCardNumber = creditCardNumber;
		this.watchQuantity = watchQuantity;
		this.bandanaQuantity = bandanaQuantity;
		this.shirtQuantity = shirtQuantity;
		this.capQuantity = capQuantity;
		this.cupQuantity = cupQuantity;
		this.total = total;
	}
	//Call and Check methods
	//**********************

	public boolean isNameValid(String name)
	{
		if(name.length()<1 || name.length()>20)
			return true;
		else
			return false;
	}
	//******************************
	public void setName(String name)
	{
		this.name = name;
	}
	//******************************
	public String getName()
	{
		return name;
	}
	//******************************

	public boolean isAddressValid(String address)
	{
		if(address.length()<1 || address.length()>20)
			return true;
		else
			return false;
	}
	//******************************
	public void setAddress(String address)
	{
		this.address = address;
	}
	//******************************
	public String getAddress()
	{
		return address;
	}
	//******************************

	public boolean isCityValid(String city)
	{
		if(city.length()<1 || city.length()>15)
			return true;
		else
			return false;
	}
	//******************************
	public void setCity(String city)
	{
		this.city = city;
	}
	//******************************
	public String getCity()
	{
		return city;
	}
	//******************************

	public boolean isStateValid(String state)
	{
		if(state.length() != 2)
			return true;
		else
			return false;
	}
	//******************************
	public void setState(String state)
	{
		this.state = state;
	}
	//******************************
	public String getState()
	{
		return state;
	}
	//******************************

	public boolean isZipCodeValid(String zipCode)
	{
		if(zipCode.length() != 5)
			return true;
		else
			return false;
	}
	//******************************
	public void setZipCode(String zipCode)
	{
		this.state = state;
	}
	//******************************
	public String getZipCode()
	{
		return zipCode;
	}
	//******************************

	public boolean isCreditCardValid(String creditCardNumber)
	{
		if(creditCardNumber.length() != 16)
			return true;
		else
			return false;
	}
	//******************************
	public void setCreditCard(String creditCardNumber)
	{
		this.creditCardNumber = creditCardNumber;
	}
	//******************************
	public String getCreditCard()
	{
		return creditCardNumber;
	}
	//******************************

	public boolean isWatchQuantityValid(int watchQuantity)
	{
		if(watchQuantity<1 || watchQuantity>100)
			return true;
		else
			return false;
	}
	//******************************
	public void setWatchQuantity(int watchQuantity)
	{
		this.watchQuantity = watchQuantity;
	}
	//******************************
	public int getWatchQuantity()
	{
		return watchQuantity;
	}
	//******************************

	public boolean isBandanaQuantityValid(int bandanaQuantity)
	{
		if(bandanaQuantity<1 || bandanaQuantity>100)
			return true;
		else
			return false;
	}
	//******************************
	public void setBandanaQuantity(int bandanaQuantity)
	{
		this.bandanaQuantity = bandanaQuantity;
	}
	//******************************
	public int getBandanaQuantity()
	{
		return bandanaQuantity;
	}
	//******************************

	public boolean isShirtQuantityValid(int shirtQuantity)
	{
		if(shirtQuantity<1 || shirtQuantity>100)
			return true;
		else
			return false;
	}
	//******************************
	public void setShirtQuantity(int shirtQuantity)
	{
		this.shirtQuantity = shirtQuantity;
	}
	//******************************
	public int getShirtQuantity()
	{
		return shirtQuantity;
	}
	//******************************

	public boolean isCapQuantityValid(int capQuantity)
	{
		if(capQuantity<1 || capQuantity>100)
			return true;
		else
			return false;
	}
	//******************************
	public void setCapQuantity(int capQuantity)
	{
		this.capQuantity = capQuantity;
	}
	//******************************
	public int getCapQuantity()
	{
		return capQuantity;
	}
	//******************************

	public boolean isCupQuantityValid(int cupQuantity)
	{
		if(cupQuantity<1 || cupQuantity>100)
			return true;
		else
			return false;
	}
	//******************************
	public void setCupQuantity(int cupQuantity)
	{
		this.cupQuantity = cupQuantity;
	}
	//******************************
	public int getCupQuantity()
	{
		return cupQuantity;
	}
	//******************************
	public void setTotal(double total)
	{
		this.total = total;
	}
	//******************************
	public double getTotal()
	{
		//total = total * .065 + total;
		return total;
	}
	//******************************
	public double calculateGrandTotal()
	{
		double grandTotal;

		grandTotal = total * .065 + total + 12.95;
		return grandTotal;
	}
}