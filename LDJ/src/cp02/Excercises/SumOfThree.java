package cp02.Excercises;

import java.util.Scanner;

public class SumOfThree {
	public static void main(String[] args) {
		int number1;
		int number2;
		int number3;
		int sum;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		System.out.print("Enter third integer: ");
		number3 = input.nextInt();
		
		sum = number1 + number2 + number3;
		
		System.out.printf("Sum is %d", sum);
	}
}
