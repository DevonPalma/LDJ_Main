package cp05.Excercises;

public class ProductOfOdd {
	public static void main(String[] args) {
		int max = 15;
		
		int product = 0;
		
		for (int i = 1; i <= max; i += 2) {
			product += i;
		}
		
		System.out.printf("Product is: %d", product);
	}
}
