package taller1;

public class ProductList 
{
	private Product[] productList;
	private int amountProducts;
	private int max;

	public ProductList(int max)
	{
		productList = new Product[max];
		amountProducts = 0;
		this.max = max;
	}
	
	public boolean enterProduct(Product product)
	{
		if (amountProducts<max)
		{
			productList[amountProducts] = product;
			amountProducts++;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Product searchProduct(String productName)
	{
		for (int i=0;i<amountProducts;i++)
		{
			if(productName.equals(productList[i].getName()))
			{
				return productList[i];
			}
		}
		return null;
	}
	
	
	
	public int getAmountProducts()
	{
		return amountProducts;
	}
	
	public void printCatalogue()
	{
		for (int i=0;i<amountProducts;i++)
		{
			if(productList[i].getStock() > 0)
			{
				System.out.println(productList[i]);
			}
			
		}
	}
}
