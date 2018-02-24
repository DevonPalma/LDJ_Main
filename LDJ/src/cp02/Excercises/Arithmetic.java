package cp02.Excercises;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		int number1;
		int number2;
		
		int sum;
		int product;
		int difference;
		int quotient;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		product = number1 * number2;
		difference = number1 - number2;
		quotient = number1 / number2;
		
		System.out.printf("\n%s: %d\n%s: %d\n%s: %d\n%s: %d\n", 
				"Sum", sum, "Product", product, "Difference",
				difference, "Quotient", quotient);
	}
}
