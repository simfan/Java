/* Chris Glock
 * 3/15/2006
 * Java06
 */

import java.util.*;

public class Java06
{
	private String book;
	private double price;
	private int quantity;
	private String fName;
	private String lName;
	private String city;
	private String address;
	private String state;
	private String zip;
	private String credit;
	private double shipping;
	private double extraCharges;
	Java06()
	{
		book = "";
		price = 0;
		quantity = 0;
		fName = "";
		lName = "";
		city = "";
		address = "";
		state = "";
		zip = "";
		credit = "";
		shipping = 0;
		extraCharges = 0;
	}

	Java06(String book, double price, int quantity, String fName, String lName, String city, String address, String state, String zip, String credit, double shipping, double extraCharges)
	{
		this.book = book;
		this.price = price;
		this.quantity = quantity;
		this.fName = fName;
		this.lName = lName;
		this.city = city;
		this.address = address;
		this.state = state;
		this.zip = zip;
		this.credit = credit;
		this.shipping = shipping;
		this.extraCharges = extraCharges;

	}

	public void setBook(String book)
	{
		this.book = book;
	}

	public String getBook()
	{
		return book;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public double getPrice()
	{
		return price;
	}

	public boolean isQuantityValid(int quantity)
	{
		 if(quantity <1 || quantity > 100)
		 	return true;
		 else
		 	return false;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public boolean isFirstNameValid(String fName)
	{
		if (fName.length() < 1 || fName.length()>20)
			return true;
		else
			return false;
	}

	public void setFirstName(String fName)
	{
		this.fName = fName;
	}

	public String getFirstName()
	{
		return fName;
	}

	public boolean isLastNameValid(String lName)
	{
		if (lName.length() < 1 || lName.length() > 20)
			return true;
		else
			return false;
	}

	public void setLastName(String lName)
	{
		this.lName = lName;
	}

	public String getLastName()
	{
		return lName;
	}

	public boolean isAddressValid(String address)
	{
		if (address.length() < 1 || address.length() > 20)
			return true;
		else
			return false;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getAddress()
	{
		return address;
	}

	public boolean isCityValid(String city)
	{
		if(city.length() < 1 || city.length() > 20)
			return true;
		else
			return false;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getCity()
	{
		return city;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getState()
	{
		return state;
	}


	public boolean isZipCodeValid(String zip)
	{
		if(zip.length() != 5)
			return true;
		else
			return false;
	}

	public void setZipCode(String zip)
	{
		this.zip = zip;
	}

	public String getZipCode()
	{
		return zip;
	}

	public boolean isCreditCardValid(String credit)
	{
		if (credit.length() != 16)
			return true;
		else
			return false;
	}

	public void setCreditCard(String credit)
	{
		this.credit = credit;
	}

	public String getCreditCard()
	{
		return credit;
	}

	public void setShipping(double shipping)
	{
		this.shipping = shipping;
	}

	public double getShipping()
	{
		return shipping;
	}

	public void setExtraCharges(double extraCharges)
	{
		this.extraCharges = extraCharges;
	}

	public double getExtraCharges()
	{
		return extraCharges;
	}


    public double calculateTotal()
	{
		double total = quantity * (price + extraCharges);
		return total;
	}

	public double calculateGrandTotal()
	{
		double grandTotal = calculateTotal() + shipping;
		return grandTotal;
	}
}