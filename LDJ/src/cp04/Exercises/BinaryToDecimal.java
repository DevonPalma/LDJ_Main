package cp04.Exercises;

public class BinaryToDecimal {
	public static void main(String[] args) {
		System.out.print(BinToDec(1000000));
	}
	
	public static int BinToDec(int number) {
		int length = Integer.toString(number).length();
		int decimal = 0;
		for (int i = 0; i < length; i++) {
			decimal += Math.round(Math.pow(2, i)) * (Math.round(number / Math.pow(10, i)) % 10);
		}
		return decimal;
	}
}
