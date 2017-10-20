package exercise2;

public class ProductionWorker implements Payable
{

	private int retibutionParPiece;

	private int piece;

	public ProductionWorker( int retibutionParPiece)
	{
		this.retibutionParPiece = retibutionParPiece;

	}



	public void produceOnePiece()
	{
		piece++;
	}

	public int computeSalary()
	{
		return  retibutionParPiece*piece;
	}
}
