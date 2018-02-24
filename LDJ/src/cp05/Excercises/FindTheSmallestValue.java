package cp05.Excercises;

import java.util.Scanner;

public class FindTheSmallestValue {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter how many digits you'd like to compare: ");
		int numberOfInputs = input.nextInt();
		
		Integer smallest = null;
		
		for (int counter = 0; counter < numberOfInputs; counter++) {
			System.out.print("Enter comparison number: ");
			int comparison = input.nextInt();
			if (smallest == null || comparison < smallest)
				smallest = comparison;
		}
		System.out.printf("Smallest number is: %d", smallest);
	}
}
