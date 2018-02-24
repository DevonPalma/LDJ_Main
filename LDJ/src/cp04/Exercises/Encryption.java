package cp04.Exercises;

public class Encryption {
	public static int encrypt(int data) {
		
		if (!validateData(data))
			throw new Error("Data is invalid must be 4 digits");
		
		int[] information = split(data);
		
		stepA(information,7);
		stepB(information);
		
		return rejoin(information);
	}
	
	public static int decrypt(int data) {
		if (!validateData(data))
			throw new Error("Data is invalid must be 4 digits");
		int[] information = split(data);
		
		stepB(information);
		stepA(information, 3);
		
		return rejoin(information);
	}
	
	private static boolean validateData(int data) {
		return (Integer.toString(data).length() == 4);
	}
	
	private static int[] split(int data) {
		int[] splitData = new int[4];
		int counter = 0;
		
		for (String s : Integer.toString(data).split("")) {
			splitData[counter++] = Integer.parseInt(s);
		}
		
		return splitData;
			
	}
	
	private static void stepA(int[] data, int shiftOp) {
		for (int i = 0; i < data.length; i++) {
			data[i] += shiftOp;
			data[i] %= 10;
		}
	}
	
	private static void stepB(int[] data) {
		int tempNumber;
		
		tempNumber = data[2];
		data[2] = data[0];
		data[2] = tempNumber;
		
		tempNumber = data[1];
		data[1] = data[3];
		data[3] = tempNumber;
	}
	
	private static int rejoin(int[] data) {
		int joinedData = 0;
		int counter = 0;
		for (int i = 3; i >= 0; i--)
			joinedData += data[counter++] * Math.pow(10, i);
		return joinedData;
	}
}
