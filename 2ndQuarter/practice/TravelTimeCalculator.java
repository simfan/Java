import java.util.Scanner;

public class TravelTimeCalculator
{
	public static void main(String[] args)
	{
		//Welcome the user to the program
		System.out.println("Welcome to the Travel Time Calculator");
		System.out.println();

		//Create a new scanner object
		Scanner sc = new Scanner(System.in);

		//Perform calculations until the user doesn't choose "y" or "Y"
		String choice = "y";
		while (choice.equalsIgnoreCase("y"))
		{
			//Enter miles traveled
			System.out.print("Enter miles:\t\t");
			float miles = sc.nextFloat();
			sc.nextLine();

			//Enter miles per hour
			System.out.print("Enter miles per hour:\t");
			float milesPerHour = sc.nextFloat();
			sc.nextLine();
			System.out.println();

			//Calculate the hours traveled
			double hours = miles/milesPerHour;

			//Calculate minutes traveled
			double minutes = miles/milesPerHour * 60 % 60;

			//Round down results
			hours = Math.floor(hours);
			minutes = Math.floor(minutes);

			//Display message
			System.out.println("Estimated travel time\nHours:\t\t" + hours + "\nMinutes:\t" + minutes);
			System.out.println();

			//See if the user wants to continue
			System.out.println("Continue?  (y/n):  ");
			choice = sc.next();
			System.out.println();
		}
	}
}