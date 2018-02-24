package cp04.Exercises;

import java.util.Scanner;

public class Palindrome {
	final static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter Palindrome: ");
		System.out.print(checkIfPalindrome(input.next()));
		
	}
	
	public static boolean checkIfPalindrome(String check) {
		String[] straight = check.split("");
		String[] backwards = new String[straight.length];
		for (int i = 0; i < straight.length; i++)
			backwards[(straight.length - i - 1)] = straight[i];
		return equals(straight, backwards);
	}
	
	public static boolean equals(String[] objectA, String[] objectB) {
		if (objectA.length != objectB.length)
			return false;
		for (int i = 0; i < objectA.length; i++)
			if (!objectA[i].equals(objectB[i]))
				return false;
		return true;
	}
}
