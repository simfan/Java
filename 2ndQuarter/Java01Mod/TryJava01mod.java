/* Chris Glock
 * 11/01/05
 * TryJava01*/

import java.text.*;
import java.util.Scanner;
public class TryJava01mod
{

	public static void main(String args[])throws Exception
	{
		Java01 java1 = new Java01();
		getInfo(java1);
		displayInfo(java1);
	}

	public static void getInfo(Java01 java1)
	{
		Scanner sc = new Scanner(System.in);

		//enter information
		System.out.print("Please enter customer first name:  ");
		String customerFirstName = sc.next();
		sc.nextLine();
		java1.setCustomerFirstName(customerFirstName);

		System.out.print("Please enter customer last name:  ");
		String customerLastName = sc.next();
		sc.nextLine();
		java1.setCustomerLastName(customerLastName);

		System.out.print("Please enter customer street number:  ");
		String customerStreetNumber = sc.next();
		sc.nextLine();
		java1.setCustomerStreetNumber(customerStreetNumber);

		System.out.print("Please enter customer street name:  ");
		String customerStreetName = sc.next();
		sc.nextLine();
		java1.setCustomerStreetName(customerStreetName);

		System.out.print("Please enter customer city:  ");
		String customerCity = sc.next();
		sc.nextLine();
		java1.setCustomerCity(customerCity);

		System.out.print("Please enter customer state:  ");
		String customerState = sc.next();
		sc.nextLine();
		java1.setCustomerState(customerState);

		System.out.print("Please enter customer zip code:  ");
		String customerZipCode = sc.next();
		sc.nextLine();
		java1.setCustomerZipCode(customerZipCode);

		System.out.print("Please enter customer e-mail address:  ");
		String customerEMail = sc.next();
		sc.nextLine();
		java1.setCustomerEMail(customerEMail);

		System.out.print("Please enter number of tickets ordered:  ");
		int numberOfTickets = sc.nextInt();
		sc.nextLine();
		java1.setNumberOfTickets(numberOfTickets);

		System.out.print("Please enter the name of the event:  ");
		String nameOfEvent = sc.next();
		sc.nextLine();
		java1.setNameOfEvent(nameOfEvent);

		System.out.print("Please enter credit card number:  ");
		String creditCardNumber = sc.next();
		sc.nextLine();
		java1.setCreditCardNumber(creditCardNumber);

		System.out.print("Please enter the card's expiration date:  ");
		String expirationDate = sc.next();
		sc.nextLine();
		java1.setExpirationDate(expirationDate);
	}

	public static void displayInfo(Java01 java1)
	{
		System.out.println();
		//Validate information

		double total = java1.calculateTotal();
		NumberFormat num1 = NumberFormat.getCurrencyInstance();
		System.out.println("Verify this information.\n\nName:\t\t\t" + java1.getCustomerFirstName()
							+ " " + java1.getCustomerLastName() +"\nAddress:\t\t" + java1.getCustomerStreetNumber()
							+ " " +java1.getCustomerStreetName() + "\n\t\t\t" + java1.getCustomerCity()
							+ ", " + java1.getCustomerState() + " " + java1.getCustomerZipCode()
							+ "\nE-mail Address:\t\t" + java1.getCustomerEMail() + "\nTickets Ordered:\t"
							+ java1.getNumberOfTickets() + "\nEvent:\t\t\t" + java1.getNameOfEvent()
							+ "\nCredit Card Number:\t" + java1.getCreditCardNumber() + "\nExpiration Date:\t"
							+ java1.getExpirationDate() + "\nTotal Price:\t\t" + num1.format(total));
	}
}