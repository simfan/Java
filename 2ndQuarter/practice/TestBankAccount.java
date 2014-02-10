public class TestBankAccount
{
	public static void main(String args[])
	{
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();

		account1.setCustAcctNum("4444");
		account1.setCustName("Chris Glock");
		account1.setCustAddress("David City");
		account1.setCustSSNumber("555-55-5555");
		account1.setCustAcctBalance(2364.96);
		account1.setCustWithdrawalAmt(223.00);

		account2.setCustAcctNum("2222");
		account2.setCustName("Jill Doe");
		account2.setCustAddress("Omaha");
		account2.setCustSSNumber("444-33-9999");
		account2.setCustAcctBalance(764.34);
		account2.setCustWithdrawalAmt(70.02);

		System.out.println("Thank you for your business:  " + account1.getCustName()
							+ "\nYour balance before your withdrawl was:  " + account1.getCustAcctBalance()
							+ "\nThe amount you are withdrawling is:  " + account1.getCustWithdrawalAmt()
							+ "\nAfter your withdrawl, your new balance is:  " + account1.accountBalance());

		System.out.println("\nThank you for your business:  " + account2.getCustName()
							+ "\nYour balance before your withdrawl was:  " + account2.getCustAcctBalance()
							+ "\nThe amount you are withdrawling is:  " + account2.getCustWithdrawalAmt()
							+ "\nAfter your withdrawl, your new balance is:  " + account2.accountBalance());
	}
}