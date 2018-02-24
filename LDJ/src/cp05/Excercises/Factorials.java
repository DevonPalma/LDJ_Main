package cp05.Excercises;

public class Factorials {
	public static void main(String[] args) {
		
		int maximum = 20;
		
		System.out.printf("%7s %9s\n", "Number", "Factorial");
		
		
		for (int i = 1; i <= maximum; i++) {
			long factorial = 1;
			for (int j = i; j > 0; j--) {
				factorial *= j;
			}
			System.out.printf("%7d %-9d\n", i, factorial);
		}
	}
}
