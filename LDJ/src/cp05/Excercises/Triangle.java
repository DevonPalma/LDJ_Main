package cp05.Excercises;

public class Triangle {
	
	private static enum chooser { A, B, C, D };
	
	public static void main(String[] args) {
		// limitations only use print("*") and print (" ")
		
		chooser selector = chooser.D;

		int yFlip = 0;
		boolean xFlip = true;
		
		if (selector == chooser.D || selector == chooser.B)
			yFlip = 10;
		if (selector == chooser.B || selector == chooser.C)
			xFlip = false;
		
//		if (selector == chooser.B || selector == chooser.D)
//			xFlip = true;
//		if (selector == chooser.B || selector == chooser.C)
//			yFlip = true;
		
		for (int counter1 = 0; counter1 < 11; counter1++) {
			for (int counter2 = 0; counter2 < 11; counter2++) {
				if (counter1 < (Math.abs(yFlip - counter2)))
					System.out.print(xFlip ? " " : "*");
				else
					System.out.print(xFlip ? "*" : " ");
			}
			
			System.out.println();
		}
		System.out.print("done");
	}
}
