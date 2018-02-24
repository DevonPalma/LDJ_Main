package cp02.Excercises;

import java.util.Scanner;

public class NegativePositiveZero {
	public static void main(String[] args) {
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		
		int Zeros = 0;
		int Pos = 0;
		int Negs = 0;
		
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
		
		if(number1 > 0)
			Pos++;
		if (number2 > 0)
			Pos++;
		if (number3 > 0)
			Pos++;
		if (number4 > 0)
			Pos++;
		if (number5 > 0)
			Pos++;
		
		if (number1 == 0)
			Zeros++;
		if (number2 == 0)
			Zeros++;
		if (number3 == 0)
			Zeros++;
		if (number4 == 0)
			Zeros++;
		if (number5 == 0)
			Zeros++;
		
		if (number1 < 0)
			Negs++;
		if (number2 < 0)
			Negs++;
		if (number3 < 0)
			Negs++;
		if (number4 < 0)
			Negs++;
		if (number5 < 0)
			Negs++;
		
		System.out.printf("Positives: %d\n", Pos);
		System.out.printf("Zeros: %d\n", Zeros);
		System.out.printf("Negatives: %d\n", Negs);
		
			
		
		
	}
	
}
