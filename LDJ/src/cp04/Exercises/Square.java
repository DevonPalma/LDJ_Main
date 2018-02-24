package cp04.Exercises;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter square side: ");
		int side = input.nextInt();
		
		drawSquare(side);
	}
	
	
	public static void drawSquare(int side) {
		drawRow(side);
		for (int i = (side - 2); i > 0; i--)
			drawCol(side);
		if (side > 1) 
			drawRow(side);
	}
	
	public static void drawCol(int side) {
		if (side > 2) {
			System.out.print("*");
			for (int i = (side - 2); i > 0; i--)
				System.out.print(" ");
			System.out.println("*");
		}
	}
	public static void drawRow(int side) {
		for (int i = side; i > 0; i--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
