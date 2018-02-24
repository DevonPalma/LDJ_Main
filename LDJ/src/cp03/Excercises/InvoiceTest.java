package cp03.Excercises;

public class InvoiceTest {
	public static void main(String[] args)
	{
		Invoice part = new Invoice("123d2", "round", 3, 22.32);
		displayInfo(part);
		
		part.setPartDescription("BOOOP");
		part.setPartNumber("123f233");
		part.setQuantity(23);
		part.setPrice(2.22);
		
		displayInfo(part);
		
	}
	
	public static void displayInfo(Invoice part) {
		System.out.printf("%-12s: %-10s\n",
				"Number", part.getPartNumber());
		System.out.printf("%-12s: %-10s\n",
				"Description", part.getPartDescription());
		System.out.printf("%-12s: %-10d\n",
				"Quantity", part.getQuantity());
		System.out.printf("%-12s: %-10.2f\n",
				"Price", part.getPrice());
		System.out.printf("%-12s: %-10.2f\n\n",
				"Invoice", part.getInvoiceAmount());
	}
}
