import java.util.Scanner;

public class LetterGradeConverter
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		String choice = "y";

		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();

		while (choice.equalsIgnoreCase("y"))
		{
			System.out.print("Enter number grade:   ");
			double numberGrade = sc.nextDouble();
			//Calculate letter grade
			String letterGrade = "";
			String message = "";

			if (numberGrade==100)
			{
				letterGrade = "A+";
				message = "Are you Einstein?";
			}

			else if (numberGrade >= 88)
			{
				letterGrade = "A";
				message = "You rock!";
			}
			else if (numberGrade >=80)
			{
				letterGrade = "B";
				message = "Good job.";
			}
			else if (numberGrade >= 67)
			{
				letterGrade = "C";
				message = "Not bad.";
			}
				else if (numberGrade >= 60)
			{
				letterGrade = "D";
				message = "You can do better.";
			}
			else if(numberGrade >0)
			{
				letterGrade = "F";
				//message = "You're a loser!";
			}
			else
			{
				letterGrade = "F-";
				//message = "Wow!  I didn't know someone was that dumb.";
			}
			System.out.println("Letter grade:  " + letterGrade+"\n" + message + "\n");

		System.out.println("Continue?  (y/n):");
		choice = sc.next();
		System.out.println();
		}
	}
}