package taller1;

public class Sale 
{
	private String productName;
	private int purchaseFreq;
	public Sale(String productName, int purchaseFreq) 
	{
		
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPurchaseFreq() {
		return purchaseFreq;
	}

	public void setPurchaseFreq(int purchaseFreq) {
		this.purchaseFreq = purchaseFreq;
	}

	@Override
	public String toString() 
	{
		return "Sale [product=" + productName + ", purchaseFreq=" + purchaseFreq + "]";
	}
	
	
}
