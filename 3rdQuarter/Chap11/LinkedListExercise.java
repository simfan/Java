import java.util.*;

public class LinkedListExercise
{
	public static void main (String[] args)
	{
		LinkedList <String> students = new LinkedList <String> ();

		students.add("Neal Bartels");
		students.add("John Doe");
		students.add("Shawn Ferguson");
		students.add("Brent Ficke");
		students.add("Travis Hays");
		students.add("Rich Kent");
		students.add("Chris Koehler");
		students.add("Heather Maschman");
		students.add("Ken Peterson");
		students.add("Chris Spady");
		students.add("Kallie White");

		students.remove("John Doe");
		students.add(3, "Chris Glock");

		for(String s : students)
			System.out.println(s);
	}
}