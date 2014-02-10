import java.util.Scanner;
public class TestBankAccount2
{
	public static void main (String[] args)
	{
		BankAccount account1 = new BankAccount();

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter customer account number:  ");
		String strCustAcctNum = sc.next();
		sc.nextLine();
		account1.setCustAcctNum(strCustAcctNum);

		System.out.print("Please enter customer name:  ");
		String strCustName = sc.next();
		sc.nextLine();
		account1.setCustName(strCustName);

		System.out.print("Please enter customer address:  ");
		String strCustAddress = sc.next();
		sc.nextLine();
		account1.setCustAddress(strCustAddress);

		System.out.print("Please enter customer social security number:  ");
		String strCustSSNumber = sc.next();
		sc.nextLine();
		account1.setCustSSNumber(strCustSSNumber);

		System.out.print("Please enter customer balance:  ");
		double custAcctBalance = sc.nextDouble();
		sc.nextLine();
		account1.setCustAcctBalance(custAcctBalance);

		System.out.print("Please enter amount the customer is withdrawing:  ");
		double custWithdrawalAmt = sc.nextDouble();
		sc.nextLine();
		account1.setCustWithdrawalAmt(custWithdrawalAmt);

		System.out.println();

		System.out.println("Thank you for your business:  " + account1.getCustName()
							+ "\nYour balance before your withdrawal was:  " + account1.getCustAcctBalance()
							+ "\nThe amount you are withdrawing is:  " + account1.getCustWithdrawalAmt()
							+ "\nAfter your withdrawlal, your new balance is:  " + account1.accountBalance());
		}
}