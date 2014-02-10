/* Chris Glock
 * 10/19/05
 * Java01*/

public class Java01
{
	private String customerFirstName;
	private String customerLastName;
	private String customerStreetNumber;
	private String customerStreetName;
	private String customerCity;
	private String customerState;
	private String customerZipCode;
	private String customerEMail;
	private int numberOfTickets;
	private String nameOfEvent;
	private String creditCardNumber;
	private String expirationDate;

	Java01()//constructor that accepts no arguments
	{
		customerFirstName = "";
		customerLastName = "";
		customerStreetNumber = "";
		customerStreetName = "";
		customerCity = "";
		customerState = "";
		customerZipCode = "";
		customerEMail = "";
		numberOfTickets = 0;
		nameOfEvent = "";
		creditCardNumber = "";
		expirationDate = "";
	}
	//constructor that accepts 12 arguments
	Java01(String customerFirstName, String customerLastName, String customerStreetNumber,
			String customerStreetName, String customerCity, String customerState, String customerZipCode,
			String customerEMail, int numberOfTickets, String nameOfEvent, String creditCardNumber, String expirationDate)

	{
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerStreetNumber = customerStreetNumber;
		this.customerStreetName = customerStreetName;
		this.customerCity = customerCity;
		this.customerState = customerState;
		this.customerZipCode = customerZipCode;
		this.customerEMail = customerEMail;
		this.numberOfTickets = numberOfTickets;
		this.nameOfEvent = nameOfEvent;
		this.creditCardNumber= creditCardNumber;
		this.expirationDate = expirationDate;
	}

	//*******************************************
	public void setCustomerFirstName(String customerFirstName)
	{
		this.customerFirstName = customerFirstName;
	}
	//*******************************************
	public String getCustomerFirstName()
	{
		return customerFirstName;
	}
	//*******************************************
	public void setCustomerLastName(String customerLastName)
	{
		this.customerLastName = customerLastName;
	}
	//*******************************************
	public String getCustomerLastName()
	{
		return customerLastName;
	}
	//*******************************************
	public void setCustomerStreetNumber(String customerStreetNumber)
	{
		this.customerStreetNumber = customerStreetNumber;
	}
	//*******************************************
	public String getCustomerStreetNumber()
	{
		return customerStreetNumber;
	}
	//*******************************************
	public void setCustomerStreetName(String customerStreetName)
	{
		this.customerStreetName = customerStreetName;
	}
	//*******************************************
	public String getCustomerStreetName()
	{
		return customerStreetName;
	}
	//*******************************************
	public void setCustomerCity(String customerCity)
	{
		this.customerCity = customerCity;
	}
	//*******************************************
	public String getCustomerCity()
	{
		return customerCity;
	}
	//*******************************************
	public void setCustomerState(String customerState)
	{
		this.customerState = customerState;
	}
	//*******************************************
		public String getCustomerState()
	{
		return customerState;
	}
	//*******************************************
	public void setCustomerZipCode(String customerZipCode)
	{
		this.customerZipCode = customerZipCode;
	}
	//*******************************************
		public String getCustomerZipCode()
	{
		return customerZipCode;
	}
	//*******************************************
	public void setCustomerEMail(String customerEMail)
	{
		this.customerEMail = customerEMail;
	}
	//*******************************************
	public String getCustomerEMail()
	{
		return customerEMail;
	}
	//*******************************************
	public void setNumberOfTickets(int numberOfTickets)
	{
		this.numberOfTickets = numberOfTickets;
	}
	//*******************************************
	public int getNumberOfTickets()
	{
		return numberOfTickets;
	}
	//*******************************************
	public void setNameOfEvent(String nameOfEvent)
	{
		this.nameOfEvent = nameOfEvent;
	}
	//*******************************************
	public String getNameOfEvent()
	{
		return nameOfEvent;
	}
	//*******************************************
	public void setCreditCardNumber(String creditCardNumber)
	{
		this.creditCardNumber = creditCardNumber;
	}
	//*******************************************
	public String getCreditCardNumber()
	{
		return creditCardNumber;
	}
	//*******************************************
	public void setExpirationDate(String expirationDate)
	{
		this.expirationDate = expirationDate;
	}
	//*******************************************
	public String getExpirationDate()
	{
		return expirationDate;
	}
	//*******************************************
	public double calculateTotal()
	{
		double total;
		double subTotal;
		double salesTax;
		double handling;
		subTotal = 38 * numberOfTickets;
		handling = 1.5 * numberOfTickets;
		salesTax = subTotal * .065;
		total = subTotal + handling + salesTax + 15.95;
		return total;
	}
}