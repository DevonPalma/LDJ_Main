package cp02.Excercises;

import java.util.Scanner;

public class ComparingIntegers {
	public static void main(String[] args) {
		int number1;
		int number2;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		System.out.println();
		
		if (number1 > number2)
			System.out.printf("%d is larger", number1);
		if (number1 < number2)
			System.out.printf("%d is larger", number2);
		if (number1 == number2)
			System.out.print("Numbers are equal");
		
	}
}
