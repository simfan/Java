/* Chris Glock
 * 10/19/05
 * TryJava01*/

import java.util.Scanner;
public class TryJava01
{
	public static void main(String args[])throws Exception
	{

		Scanner sc = new Scanner(System.in);

		//enter information
		System.out.print("Please enter customer first name:  ");
		String customerFirstName = sc.next();
		sc.nextLine();

		System.out.print("Please enter customer last name:  ");
		String customerLastName = sc.next();
		sc.nextLine();

		System.out.print("Please enter customer street number:  ");
		String customerStreetNumber = sc.next();
		sc.nextLine();

		System.out.print("Please enter customer street name:  ");
		String customerStreetName = sc.next();
		sc.nextLine();

		System.out.print("Please enter customer city:  ");
		String customerCity = sc.next();
		sc.nextLine();

		System.out.print("Please enter customer state:  ");
		String customerState = sc.next();
		sc.nextLine();

		System.out.print("Please enter customer zip code:  ");
		String customerZipCode = sc.next();
		sc.nextLine();

		System.out.print("Please enter customer e-mail address:  ");
		String customerEMail = sc.next();
		sc.nextLine();

		System.out.print("Please enter number of tickets ordered:  ");
		int numberOfTickets = sc.nextInt();
		sc.nextLine();

		System.out.print("Please enter the name of the event:  ");
		String nameOfEvent = sc.next();
		sc.nextLine();

		System.out.print("Please enter credit card number:  ");
		String creditCardNumber = sc.next();
		sc.nextLine();

		System.out.print("Please enter the card's expiration date:  ");
		String expirationDate = sc.next();
		sc.nextLine();

		Java01 java1 = new Java01(customerFirstName, customerLastName,
			customerStreetNumber, customerStreetName, customerCity,
			customerState, customerZipCode, customerEMail,
			numberOfTickets, nameOfEvent, creditCardNumber, expirationDate);

		System.out.println();
		//Validate information
		System.out.println("Verify this information.\n\nName:\t\t\t" + java1.getCustomerFirstName()
							+ " " + java1.getCustomerLastName() +"\nAddress:\t\t" + java1.getCustomerStreetNumber()
							+ " " +java1.getCustomerStreetName() + "\n\t\t\t" + java1.getCustomerCity()
							+ ", " + java1.getCustomerState() + " " + java1.getCustomerZipCode()
							+ "\nE-mail Address:\t\t" + java1.getCustomerEMail() + "\nTickets Ordered:\t"
							+ java1.getNumberOfTickets() + "\nEvent:\t\t\t" + java1.getNameOfEvent()
							+ "\nCredit Card Number:\t" + java1.getCreditCardNumber() + "\nExpiration Date:\t"
							+ java1.getExpirationDate() + "\nTotal Price:\t\t" + java1.calculateTotal());
	}
}
