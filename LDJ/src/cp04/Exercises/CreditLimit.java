package cp04.Exercises;

public class CreditLimit {
	String accoutNumber;
	double balance;
	double allowed;
	double charges;
	double credits;
	
	public CreditLimit(String accountNumber, double balance, double allowed) {
		this.accoutNumber = accountNumber;
		this.balance = balance;
		this.allowed = allowed;
	}
	
	public void addCharge(double charges) {
		this.charges += charges;
	}
	
	public void setCredits(double credits) {
		this.credits += credits;
	}
	
	public void resetCharge(double charges) {
		this.charges = charges;
	}
}
