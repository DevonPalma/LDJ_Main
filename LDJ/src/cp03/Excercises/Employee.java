package cp03.Excercises;

public class Employee {
	String firstName;
	String lastName;
	double salary;
	
	public Employee(String firstName, String lastName, double salary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		if (salary < 0)
			this.salary = 0;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
}
