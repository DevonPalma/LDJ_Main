package cp03.Excercises;

public class TargetHeartRate {
	String firstName;
	String lastName;
	Date birthDate;
	
	public TargetHeartRate(String firstName, String lastName, 
			int birthMonth, int birthDay, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		birthDate = new Date(birthMonth, birthDay, birthYear);
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setBirthMonth(int birthMonth) {
		birthDate.setMonth(birthMonth);
	}
	public void setBirthDay(int birthDay) {
		birthDate.setDay(birthDay);
	}
	public void setBirthYear(int birthYear) {
		birthDate.setYear(birthYear);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
}
