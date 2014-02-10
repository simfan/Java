/* Chris Glock
 * 1/11/06
 * Employee */


public class Employee implements Comparable
{
	private int empNum;
	private double empSalary;
	private String empName;

	public Employee()
	{
		empNum = 0;
		empSalary = 0;
		empName = "";
	}

	public Employee(int empNum, double empSal, String empName)
	{
		this.empNum = empNum;
		this.empSalary = empSal;
		this.empName = empName;
	}

	public void setEmpNum(int empNum)
	{
		this.empNum = empNum;
	}

	public int getEmpNum()
	{
		return empNum;
	}

	public void setEmpSalary(double empSalary)
	{
		this.empSalary = empSalary;
	}

	public double getEmpSalary()
	{
		return empSalary;
	}

	public void setEmpName(String empName)
	{
		this.empName = empName;
	}

	public String getEmpName()
	{
		return empName;
	}

	public int compareTo(Object obj)
	{
		Employee i = (Employee) obj;
		if(this.getEmpName().compareToIgnoreCase(i.getEmpName())<0)
			return -1;
		if(this.getEmpName().compareToIgnoreCase(i.getEmpName())>0)
			return 1;
		return 0;
	}
}
