public class BankAccount2
{
	private String custAcctNum;
	private String custName;
	private String custAddress;
	private String custSSNumber;
	private double custAcctBalance;
	private double custWithdrawalAmt;

	BankAccount2()//constructor that accepts no arguments
	{
		custAcctNum = "";
		custName = "";
		custAddress = "";
		custSSNumber = "";
		custAcctBalance = 0.00;
		custWithdrawalAmt = 0.00;
	}

	BankAccount2(String custAcctNum, String custName, String custAddress, String custSSNumber, double custAcctBalance, double custWitdrawalAmt)//constructor that accepts 6 arguments
	{
		this.custAcctNum = custAcctNum;
		this.custName = custName;
		this.custAddress = custAddress;
		this.custSSNumber = custSSNumber;
		this.custAcctBalance = custAcctBalance;
		this.custWithdrawalAmt = custWithdrawalAmt;
	}
	//**************************************
	public void setCustAcctNum(String custAcctNum)
	{
		this.custAcctNum = custAcctNum;
	}
	//**************************************
	public String getCustAcctNum()
	{
		return custAcctNum;
	}
	//**************************************
	public void setCustName(String custName)
	{
		this.custName = custName;
	}
	//**************************************
	public String getCustName()
	{
		return custName;
	}
	//**************************************
	public void setCustAddress(String custAddress)
	{
		this.custAddress = custAddress;
	}
	//**************************************
	public String getCustAddress()
	{
		return custAddress;
	}
	//**************************************
	public void setCustSSNumber(String custSSNumber)
	{
		this.custSSNumber = custSSNumber;
	}
	//**************************************
	public String getCustSSNumber()
	{
		return custSSNumber;
	}
	//**************************************
	public void setCustAcctBalance(double custAcctBalance)
	{
		this.custAcctBalance = custAcctBalance;
	}
	//**************************************
	public double getCustAcctBalance()
	{
		return custAcctBalance;
	}
	//**************************************
	public void setWithdrawalAmt(double custWitdrawalAmt)
	{
		this.custWithdrawalAmt = custWithdrawalAmt;
	}
	//**************************************
	public double getWithdrawalAmt()
	{
		return custWithdrawalAmt;
	}
	//**************************************
	public double accountBalance()
	{
		double balance;
		return balance = custAcctBalance - custWithdrawalAmt;
	}
}
