package cp03.Excercises;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee a = new Employee("Devon", "Palma", 1999.32);
		Employee b = new Employee("Jill", "Cox", 1.00);
		
		displayInfo(a);
		displayInfo(b);
		
		System.out.print("\nGiving each employee a raise\n\n");

		a.setSalary(a.getSalary() + (a.getSalary() * 0.1));
		b.setSalary(b.getSalary() + (b.getSalary() * 0.1));
		
		displayInfo(a);
		displayInfo(b);
	}
	
	public static void displayInfo(Employee e) {
		System.out.printf("%s %s salary: %.2f\n", 
				e.getFirstName(), e.getLastName(), e.getSalary() * 12);
		
	}
}
