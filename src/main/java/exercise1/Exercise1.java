package exercise1;

public class Exercise1
{
	public Employee buildFixedSalaryEmployee(String name, int fixedSalary)
	{
		Employee e1 = new FixedSalaryEmployee(name, fixedSalary);
		return  e1;
	}

	public Employee buildBaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission)
	{
		Employee e2 = new BaseSalaryPlusCommisionEmployee(name, baseSalary, commission);
		return e2;
	}

	public Employee buildWorkHourSalaryEmployee(String name, int hourlyRoute)
	{
		Employee e3 = new WorkoutSalaryEmployee(name,hourlyRoute);
		return e3;
	}
}
