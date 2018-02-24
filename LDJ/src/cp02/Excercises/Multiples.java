package cp02.Excercises;

import java.util.Scanner;

public class Multiples {
	public static void main(String[] args)
	{
		int number1;
		int number2;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		System.out.printf("Number %d is ", number2);
		if (number1 % number2 != 0)
			System.out.print("not ");
		System.out.printf("a multiple of %d", number1);
	}
}
