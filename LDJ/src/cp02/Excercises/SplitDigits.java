package cp02.Excercises;

import java.util.Scanner;

public class SplitDigits {
	public static void main(String[] args) {
		int number;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a five digit number: ");
		number = input.nextInt();
		
		int n1 = number/10000;
		int n2 = number/1000%10;
		int n3 = number/100%10;
		int n4 = number/10%10;
		int n5 = number%10;
		
		System.out.printf("%d   %d   %d   %d   %d", 
				n1, n2, n3, n4, n5);
	}
}
