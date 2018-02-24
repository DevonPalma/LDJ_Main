package cp02.Excercises;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		int radius;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		float diameter;
		float circumference;
		float area;
		
		System.out.print("Enter radius: ");
		radius = input.nextInt();
		
		diameter = 2 * radius;
		circumference = (float) (2 * Math.PI * radius);
		area = (float) (Math.PI * radius * radius);
		
		System.out.printf("%s: %f\n%s: %f\n%s: %f",
				"Diameter", diameter, "circumference",
				circumference, "Area", area);
	}
}
