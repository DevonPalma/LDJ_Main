package cp02.Excercises;

import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		int weight;
		int inches;
		
		int BMI;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight: ");
		weight = input.nextInt();
		
		System.out.print("Enter height: ");
		inches = input.nextInt();
		
		BMI = (weight * 703)/(inches * inches);
		
		System.out.printf("%-10s\n", "BMI VALUES");
		System.out.printf("%-10s %-30s\n", "Underweight:", "less than 18.5");
		System.out.printf("%-10s %-30s\n","Normal:", "between 18.5 and 24.9");
		System.out.printf("%-10s %-30s\n","Overweight:", "between 25 and 29.9");
		System.out.printf("%-10s %-30s\n","Obese:", "30 or greater");
		System.out.printf("%-10s %-30d\n", "Yours:", BMI);
	}
}
