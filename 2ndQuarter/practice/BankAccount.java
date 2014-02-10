public class BankAccount
{
	private String custAcctNum;
	private String custName;
	private String custAddress;
	private String custSSNumber;
	private double custAcctBalance;
	private double custWithdrawalAmt;

	//*******************************
	public void setCustAcctNum(String custAcctNum)
	{
		this.custAcctNum = custAcctNum;
	}
	//*******************************
	public String getCustAcctNum()
	{
		return custAcctNum;
	}
	//*******************************
	public void setCustName(String custName)
	{
		this.custName = custName;
	}
	//*******************************
	public String getCustName()
	{
		return custName;
	}
	//*******************************
	public void setCustAddress(String custAddress)
	{
		this.custAddress = custAddress;
	}
	//*******************************
	public String getCustAddress()
	{
		return custAddress;
	}
	//*******************************
	public void setCustSSNumber(String custSSNumber)
	{
		this.custSSNumber = custSSNumber;
	}
	//*******************************
	public String getCustSSNumber()
	{
		return custSSNumber;
	}
	//*******************************
	public void setCustAcctBalance(double custAcctBalance)
	{
		this.custAcctBalance = custAcctBalance;
	}
	//*******************************
	public double getCustAcctBalance()
	{
		return custAcctBalance;
	}
	//*******************************
	public void setCustWithdrawalAmt(double custWithdrawalAmt)
	{
		this.custWithdrawalAmt = custWithdrawalAmt;
	}
	//*******************************
	public double getCustWithdrawalAmt()
	{
		return custWithdrawalAmt;
	}
	//*******************************

	public double accountBalance()
	{
		double balance;
		return balance = custAcctBalance - custWithdrawalAmt;
	}
}