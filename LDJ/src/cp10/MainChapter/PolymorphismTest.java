package cp10.MainChapter;

public class PolymorphismTest {
	public static void main(String[] args) {
		CommissionEmployee c1 = new CommissionEmployee(
				"Sue", "Jones", "222-22-2222", 10000, 0.06);
		
		BasePlusCommissionEmployee bc1 = new BasePlusCommissionEmployee(
				"Bob", "Lewis", "333-33-3333", 5000, 0.04, 300);
		
		System.out.println(c1);
		System.out.println();
		System.out.println(bc1);
		
		CommissionEmployee c2 = bc1;
		
		System.out.println(c2);
	}
}
