package cp05.Excercises;

public class AntiPrimes {
	public static void main(String[] args) {
		int smallest = 0;
		int maxNumber = 10000;
		
		for (int i = 1; i < maxNumber; i++) {
			int NOF = getNumberOfFactors(i);
			if (NOF > smallest) {
				System.out.printf("%d: %d\n", i, NOF);
				smallest = NOF;
			}
		}
	}
	
	public static int getNumberOfFactors(int number) {
		int count = 1;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		return count;
	}
}
