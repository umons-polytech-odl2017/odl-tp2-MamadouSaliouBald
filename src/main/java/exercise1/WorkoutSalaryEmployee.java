package exercise1;

public class WorkoutSalaryEmployee extends Employee
{
	private int fixedSalary;
	private int tauxHeure;
	private  int  vente;
	private  int heure;

	public WorkoutSalaryEmployee(String name, int tauxHeure)
	{
		super(name);
		//this.fixedSalary = fixedSalary;
		this.tauxHeure = tauxHeure;
	}

	public  int  computeSalary()
	{
		return fixedSalary = tauxHeure*heure;

	}


	public  void sell()
	{

	}


	public void workOneHour()
	{
		heure++;
	}

}
