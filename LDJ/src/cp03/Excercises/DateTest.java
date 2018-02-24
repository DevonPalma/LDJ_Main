package cp03.Excercises;

public class DateTest {
	public static void main(String[] args) {
		
		Date date = new Date(25, 1, 2018);
		
		System.out.print(date.displayDate() + "\n");
		
		date.setDay(26);
		date.setMonth(2);
		date.setYear(2019);
		
		System.out.print(date.displayDate() + "\n");
	}
}
