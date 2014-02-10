/*Chris Glock
 *10/6/05
 *CarLoan*/

 public class CarLoan
 {
 	public static void main(String[] args)
 	{
 		//declare hard-coded variables
 		String customerName = "Chris Glock";
 		double priceOfCar = 14250.00;
 		double downPayment = 2000.00;
 		double tradeInValue = 450.75;
 		int numberOfMonths = 24;
 		double interestRate = 0.075;

 		//declare calculation variables
 		double loanAmount = 0;
 		double interestAmount = 0;
 		double totalLoanAmount = 0;
 		double monthlyPayment = 0;

 		//calculations
 		loanAmount = priceOfCar-(downPayment+tradeInValue);
 		interestAmount = interestRate * loanAmount;
 		totalLoanAmount = interestAmount + loanAmount;
 		monthlyPayment = totalLoanAmount/numberOfMonths;

 		//print out results
 		System.out.println("Customer's name:\t" + customerName);
		System.out.println("Price:\t\t\t" + priceOfCar);
		System.out.println("Down payment:\t\t" + downPayment);
		System.out.println("Trade-in Value:\t\t" + tradeInValue);
		System.out.println("Months: \t\t" + numberOfMonths);
		System.out.println("Interest Amount:\t" + interestAmount);
		System.out.println("Monthly Payment:\t" + monthlyPayment);
 	}
 }