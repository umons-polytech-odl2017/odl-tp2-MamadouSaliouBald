package exercise1;

public class FixedSalaryEmployee extends Employee
{
	private int FixedSalary;

	public FixedSalaryEmployee(String name, int fixedSalary) {
		super(name);
		FixedSalary = fixedSalary;
	}

	public int getFixedSalary() {
		return FixedSalary;
	}

	public  int computeSalary()
	{
		return FixedSalary;
	}


	public void sell() {}


	public void workOneHour() {}

}
