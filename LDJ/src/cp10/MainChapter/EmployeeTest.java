package cp10.MainChapter;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee a = new BasePlusCommissionEmployee("Ryan", "Joe", "222-22-2222", 1000, 0.9, 10000);
		System.out.print(a.earnings());
	}
}
