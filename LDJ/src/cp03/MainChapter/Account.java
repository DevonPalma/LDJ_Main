package cp03.MainChapter;

public class Account {
	private String name;
	private double balance;
	
	public Account(String name, double balance)
	{
		this.name = name;
		
		if (balance > 0.0)
			this.balance = balance;
	}
	
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0)
			balance += depositAmount;
	}
	
	public void withdrawal(double withdrawalAmount) {
		if (withdrawalAmount > balance)
			System.out.print("Withdrawal amount exceeded amount balance");
		else
			balance -= withdrawalAmount;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}
