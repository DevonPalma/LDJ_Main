package cp02.Excercises;

import java.util.Scanner;

public class ArithmeticSmallestLargest {
	public static void main(String[] args) {
		int number1;
		int number2;
		int number3;
		
		int sum;
		int average;
		int product;
		int smallest;
		int largest;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		System.out.print("Enter third integer: ");
		number3 = input.nextInt();
		
		sum = number1 + number2 + number3;
		System.out.printf("Sum: %d\n", sum);
		
		average = (number1 + number2 + number3)/3;
		System.out.printf("Average: %d\n", average);
		
		product = (number1 * number2 * number3);
		System.out.printf("Product: %d\n", product);
		
		smallest = number1;
		if (number2 < smallest)
			smallest = number2;
		if (number3 < smallest)
			smallest = number3;
		System.out.printf("Smallest: %d\n", smallest);
			
		largest = number1;
		if (number2 > largest)
			largest = number2;
		if (number3 > largest)
			largest = number3;
		System.out.printf("Largest: %d\n", largest);
	}
}
