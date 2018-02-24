package cp05.Excercises;

public class ModifiedInterest {
	public static void main(String[] args) {
		double principal = 1000.0;
		double[] rates = { 0.05, 0.06, 0.07, 0.08, 0.09, 0.1 };
		
		System.out.printf("%-6s",  "Year");
		for (double r : rates) {
			System.out.printf("%-13s", String.format("I: %.2f", r));
		}
		System.out.println();

		for (int year = 0; year <= 10; year++) {
			System.out.printf("%-6d", year);
			for (double r : rates) {
				double amount = principal * Math.pow(1.0 + r, year);
				System.out.printf("%-13.2f", amount);
			}
			System.out.println();
		}
	}
}
