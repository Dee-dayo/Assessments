public class Account {

	private int id ;
	private double balance ;
	private double annualInterestRate ;
	private double monthlyInterest;
	private String dateCreated ;

	public Account () {
	this.id = id ;
	this.balance = balance ;
	this.annualInterestRate = annualInterestRate;
	this.dateCreated = dateCreated;
	}

	public Account (int id, int balance) {
	this.id = id ;
	this.balance = balance ;
	this.annualInterestRate = annualInterestRate ;
	this.dateCreated = dateCreated;
	}

	public void setId (int id) {
		this.id = id ;
	}	

	public int getId () {
		return id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance () {
		return balance;
	}

	public void setAnnualInterestRate (double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public void setDateCreated (String dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public double getMonthlyInterest() {
		monthlyInterest = ((annualInterestRate / 100) / 12) * balance ;
		return monthlyInterest ;
	}

	public void withdraw(double withdrawAmount) {
			if (balance > withdrawAmount) {
				this.balance = balance - withdrawAmount;
			} else
			if (withdrawAmount > balance) {
				System.out.print("Withdraw successful");
			}
	}

	public void  deposit(double depositAmount) {
		this.balance = depositAmount + balance;
	}

}