//this program uses an external data class, and sorts an array of objects

/* Chris Glock
 * 1/11/06
 * ArraySort*/

import java.util.*;

public class ArraySort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int x = 0;

		int empNum;
		String empName;
		double empSalary;

		System.out.println("");
		System.out.print("\tNumber of employees: ");
		int size = sc.nextInt();

		Employee[] array = new Employee[size];

		for(x=0; x<size; ++x)
		{
			System.out.print("Please enter employee number: ");
			empNum = sc.nextInt();

			System.out.print("Please enter employee name: ");
			empName = sc.next();

			System.out.print("Please enter employee salary: " + (x+1) + ": ");
			empSalary = sc.nextDouble();

			array[x] = new Employee(empNum, empSalary, empName);
		}

		System.out.println("Before sort");

		for(x =0; x<size; ++x)
			System.out.print(array[x].getEmpName() + " ");

		Arrays.sort(array);
		System.out.println("\nAfter sort");

		for(Employee emp : array)
			System.out.print(emp.getEmpNum() + " " + emp.getEmpSalary() + " " + emp.getEmpName() + "\n");
	}
}