package exercise1;

public class BaseSalaryPlusCommisionEmployee extends Employee
{
	private int fixedSalary;
	private  int  vente;
	private  int heure;
	private int commision;

	public BaseSalaryPlusCommisionEmployee(String name, int fixedSalary, int commision) {
		super(name);
		this.fixedSalary = fixedSalary;
		//this.vente = vente;
		this.commision = commision;
	}

	public int getFixedSalary() {
		return fixedSalary;
	}

	public int getVente() {
		return vente;
	}

	public float getCommision() {
		return commision;
	}

	public  int computeSalary()
	{
		return fixedSalary = fixedSalary + vente*commision;
	}


	public  void sell()
	{
		vente++;
	}


	public  void workOneHour()
	{
		heure++;
	}

}
