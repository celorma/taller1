package taller1;

public class Product 
{
	private String name;
	private int value;
	private int stock;
	
	public Product(String name, int value, int stock) 
	{
		this.name = name;
		this.value = value;
		this.stock = stock;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getValue()
	{
		return value;
	}
	public void setValue(int value)
	{
		this.value = value;
	}
	public int getStock()
	{
		return stock;
	}
	public void setStock(int stock) 
	{
		this.stock = stock;
	}
	@Override
	public String toString() 
	{
		return "Product [name=" + name + ", value=" + value + ", stock=" + stock + "]";
	}
	
	
}
