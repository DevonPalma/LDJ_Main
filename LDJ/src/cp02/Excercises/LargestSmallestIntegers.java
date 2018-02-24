package cp02.Excercises;

import java.util.Scanner;

public class LargestSmallestIntegers {
	public static void main(String[] args) {
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		
		int smallest;
		int largest;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
			number1 = input.nextInt();
		System.out.print("Enter second number: ");
			number2 = input.nextInt();
		System.out.print("Enter third number: ");
			number3 = input.nextInt();
		System.out.print("Enter fourth number: ");
			number4 = input.nextInt();
		System.out.print("Enter fifth number: ");
			number5 = input.nextInt();
		
		smallest = number1;
		if (number2 < smallest)
			smallest = number2;
		if (number3 < smallest)
			smallest = number3;
		if (number4 < smallest)
			smallest = number4;
		if (number5 < smallest)
			smallest = number5;
		
		largest = number1;
		if (number2 > largest)
			largest = number2;
		if (number3 > largest)
			largest = number3;
		if (number4 > largest)
			largest = number4;
		if (number5 > largest)
			largest = number5;
		
		System.out.printf("Largest: %d, Smallest: %d", 
				largest, smallest);
	}
}
