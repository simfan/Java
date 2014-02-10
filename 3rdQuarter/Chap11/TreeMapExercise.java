import java.util.*;

public class TreeMapExercise
{
	public static void main(String[] args)
	{
		TreeMap <String, String> students = new TreeMap <String, String> ();

		students.put("M1", "Neal Bartels");
		students.put("M2", "Shawn Ferguson");
		students.put("M3", "Brent Ficke");
		students.put("M4", "Chris Glock");
		students.put("M5", "Travis Hays");
		students.put("M6", "Rich Kent");
		students.put("M7", "Chris Koehler");
		students.put("F1", "Heather Maschman");
		students.put("M8", "Ken Peterson");
		students.put("M9", "Chris Spady");
		students.put("F2", "Kallie White");

		for(Map.Entry student : students.entrySet())
			System.out.println(student.getKey() + ": " + student.getValue());

	}
}