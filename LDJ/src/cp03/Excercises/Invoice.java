package cp03.Excercises;

public class Invoice {
	String partNumber;
	String partDescription;
	int quantity;
	double price;
	
	public Invoice(String partNumber, String partDescription,
			int quantity, double price)
	{
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		if (quantity < 0)
			this.quantity = 0;
		this.price = price;
		if (price < 0)
			this.price = 0;
	}
	
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public String getPartNumber() {
		return partNumber;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		if (quantity < 0)
			this.quantity = 0;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setPrice(double price) {
		this.price = price;
		if (price < 0)
			this.price = 0;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getInvoiceAmount() {
		return quantity*price;
	}
}
