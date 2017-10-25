package exercise1;

import exercise2.Payable;

public  abstract class Employee implements Payable
{
	private String name;


	public Employee(String name)
	{
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract int computeSalary();


	public abstract void sell();


	public abstract void workOneHour() ;


}
