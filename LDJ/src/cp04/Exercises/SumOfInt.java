// exercise 4.6

package cp04.Exercises;

public class SumOfInt {
	public static void main(String[] args) {
		int sum = 0;
		int x = 1;
		while (x < 11) {
			sum += x++;
			System.out.printf("The sum is: %d\n", sum);
		}
	}
}
