package cp02.Excercises;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		int number;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integer: ");
		number = input.nextInt();
		
		if (number % 2 == 0)
			System.out.print("Number is even");
		if (number % 2 == 1)
			System.out.print("Number is odd");
	}
}
