package taller1;

public class SaleList 
{
	private Sale[] saleList;
	private int amountSales;
	private int max;
	
	public SaleList(int max)
	{
		saleList = new Sale[max];
		amountSales = 0;
		this.max = max;
	}

	public boolean enterSale(Sale sale)
	{
		if (amountSales < max)
		{
			saleList[amountSales] = sale;
			amountSales++;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int getAmountSales() {
		return amountSales;
	}
	
	public void print()
	{
		for (int i=0;i<amountSales;i++)
		{
			System.out.println(saleList[i]);
		}
	}
	
}
