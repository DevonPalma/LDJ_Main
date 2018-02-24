package cp10.MainChapter;

public abstract class Employee {
	protected String firstName, lastName, socialSecurityNumber;
	
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public String toString() {
		return String.format("%s: %s %s\n%s: %s\n", 
		"Commission Employee", getFirstName(), getLastName(),
		"Social security number", getSocialSecurityNumber());
	}
	
	public abstract double earnings();
}
