/* Chris Glock
 * 11/8/2005
 * TryJava02*/

import java.util.*;
import java.text.*;

public class TryJava02
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		Java02 employee = new Java02();
		String answer = "";
		System.out.println("Pay Calculator");
		do
		{
			checkEmployeeNumber(employee, sc);
			checkEmployeeFirstName(employee, sc);
			checkEmployeeLastName(employee, sc);
			checkEmployeeSSN(employee, sc);
			checkHoursWorked(employee, sc);
			checkRateOfPay(employee, sc);
			checkFICATaxRate(employee, sc);
			checkPensionRate(employee, sc);
			System.out.println();
			displayOutput(employee);
			System.out.println();
			System.out.print("Do you wish to continue?(y/n) ");
			answer = sc.next();
		}while(answer.equalsIgnoreCase("y"));
	}//ends main method

	public static void checkEmployeeNumber(Java02 employee, Scanner sc)
	{
		int number = 0;
		boolean errorCheck = false;//boolean test for Java bean
		boolean error = true;
		while(error)
		{
			try
			{
				do
				{
					System.out.print("Please enter employee number: ");
					number = sc.nextInt();
					errorCheck = employee.isNumberValid(number);

					if(errorCheck)
					{
						System.out.println("Number must be between 1 and 5000.  Please re-enter:\n");
					}
				}while(errorCheck);
				employee.setEmployeeNumber(number);
			}
			catch(InputMismatchException e)
			{
				sc.nextLine();
				System.out.println("Invalid entry, please re-enter");
				continue;
			}
			error = false;
		}
	}
	public static void checkEmployeeFirstName(Java02 employee, Scanner sc)
	{
		String firstName = "";
		boolean errorCheck = false;//boolean test for Java bean
		boolean error = true;
		while(error)
		{
			try
			{
				do
				{
					System.out.print("Please enter employee first name: ");
					firstName = sc.next();
					errorCheck = employee.isFirstNameValid(firstName);
					if(errorCheck)
					{
						System.out.println("First name must be between 1 and 15 characters.  Please re-enter:\n");
					}
				}while(errorCheck);
				employee.setEmployeeFirstName(firstName);
			}
			catch(InputMismatchException e)
			{
				sc.nextLine();
				System.out.println("Invalid entry, please re-enter");
				continue;
			}
			error = false;
		}
	}
	public static void checkEmployeeLastName(Java02 employee, Scanner sc)
	{
		String lastName = "";
		boolean errorCheck = false;
		boolean error = true;
		while(error)
		{
			try
			{
				do
				{
					System.out.print("Please enter employee last name: ");
					lastName = sc.next();
					errorCheck = employee.isLastNameValid(lastName);
					if(errorCheck)
					{
						System.out.println("Last name must be between 1 and 15 characters.  Please re-enter:\n");
					}
				}while(errorCheck);

				employee.setEmployeeLastName(lastName);
			}
			catch(InputMismatchException e)
			{
				sc.nextLine();
				System.out.println("Invalid entry, please re-enter");
				continue;
			}
			error = false;
		}
	}
	public static void checkEmployeeSSN(Java02 employee, Scanner sc)
	{
		String ssn = "";
		boolean errorCheck = false;
		boolean error = true;
		while(error)
		{
			try
			{
				do
				{
					System.out.print("Please enter employee Social Security Number: ");
					ssn = sc.next();
					errorCheck = employee.isEmployeeSSNValid(ssn);
					if(errorCheck)
					{
						System.out.println("Social Security Number must be 9 characters long.  Please re-enter:\n");
					}
				}while(errorCheck);
				employee.setEmployeeSSN(ssn);
			}
			catch(InputMismatchException e)
			{
				sc.nextLine();
				System.out.println("Invalid entry, please re-enter");
				continue;
			}
			error = false;
		}
	}
	public static void checkHoursWorked(Java02 employee, Scanner sc)
	{
		double hoursWorked = 0;
		boolean errorCheck = false;
		boolean error = true;
		while(error)
		{
			try
			{
				do
				{
				System.out.print("Please enter hours worked: ");
				hoursWorked =sc.nextDouble();
				errorCheck = employee.areHoursWorkedValid(hoursWorked);
				if(errorCheck)
				{
					System.out.println("Hours worked must be between .25 and 80.  Please re-enter:\n");
				}
			}while(errorCheck);
			employee.setHoursWorked(hoursWorked);
			}
			catch(InputMismatchException e)
			{
				sc.nextLine();
				System.out.println("Invalid entry, please re-enter");
				continue;
			}
			error = false;
		}
	}
	public static void checkRateOfPay(Java02 employee, Scanner sc)
	{
		double payRate = 0;
		boolean errorCheck = false;
		boolean error = true;
		while(error)
		{
			try
			{
				do
				{
					System.out.print("Please enter rate of pay: ");
					payRate =sc.nextDouble();
					errorCheck = employee.isRateOfPayValid(payRate);
					if(errorCheck)
					{
					System.out.println("Rate of pay must be between 5.15 and 25.00.  Please re-enter:\n");
					}
				}while(errorCheck);
				employee.setRateOfPay(payRate);
			}
			catch(InputMismatchException e)
			{
				sc.nextLine();
				System.out.println("Invalid entry, please re-enter");
				continue;
			}
			error = false;
		}
	}
	public static void checkFICATaxRate(Java02 employee, Scanner sc)
	{
		double ficaRate = 0;
		boolean errorCheck = false;
		boolean error = true;
		while(error)
		{
			try
			{
				do
				{
					System.out.print("Please enter FICA tax rate: ");
					ficaRate =sc.nextDouble();
					errorCheck = employee.isFICATaxRateValid(ficaRate);
					if(errorCheck)
					{
						System.out.println("FICA tax rate must be between 7.65 and 9.36.  Please re-enter:\n");
					}
				}while(errorCheck);
				employee.setFICATaxRate(ficaRate);
			}
			catch(InputMismatchException e)
			{
				sc.nextLine();
				System.out.println("Invalid entry, please re-enter");
				continue;
			}
			error = false;
		}
	}
	public static void checkPensionRate(Java02 employee, Scanner sc)
	{
		double pensionRate = 0;
		boolean errorCheck = false;
		boolean error = true;
		while(error)
		{
			try
			{
				do
				{
					System.out.print("Please enter pension rate: ");
					pensionRate =sc.nextDouble();
					errorCheck = employee.areHoursWorkedValid(pensionRate);
					if(errorCheck)
					{
						System.out.println("Pension rate must be between 0 and 6.  Please re-enter:\n");
					}
				}while(errorCheck);
				employee.setPensionRate(pensionRate);
			}
			catch(InputMismatchException e)
			{
				sc.nextLine();
				System.out.println("Invalid entry, please re-enter");
				continue;
			}
			error = false;
		}
	}
	public static void displayOutput(Java02 employee)
	{
		NumberFormat num1 = NumberFormat.getCurrencyInstance();
		System.out.println("\t\t\tPayroll Report\nEmployee:\t" + employee.getEmployeeFirstName()+ " " + employee.getEmployeeLastName()
							+ "\nHours Worked:\t" + employee.getHoursWorked() + "\tRate of Pay:\t" + num1.format(employee.getRateOfPay())
							+ "\nGross Pay:\t\t\t\t" + num1.format(employee.calculateGrossPay()) + "\n\nDeductions:\n\t\tPension:\t\t" + num1.format(employee.calculatePension())
							+ "\n\t\tFICA:\t\t\t" + num1.format(employee.calculateFICATax()) + "\n\nNet Pay:\t\t\t\t" + num1.format(employee.calculateNetPay()));
	}
}