package Notes;

class BankAccount {
	//global variables
	private String name;
	 private double balance;
	
	//constructors purpose is to initialize global variables
	//default constructor has no parameters 
	public BankAccount() {
		name ="";
		balance = 0.0;
	}
	//overloading constructor 
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	//Getters or accessor methods
	public String toString() {
		return "Name: " + getName() + " , Balance: " + getBalance();
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	//setter or mutator methods
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	// withdraw or deposit
	public void deposit(double deposit) {
		balance += deposit;
	}
	public void withdraw(double withdraw) {
		if (withdraw > balance) {
			System.out.println("Insufficient funds!");
		} else
		balance -= withdraw;
	}
}
// the subclass inherits from the superclass
	class BusinessAccount extends BankAccount{
		double interest; 
		public BusinessAccount(String name, double balance, double interest) {
			super(name, balance);
			this.interest = interest; 
		}
		//method overwriting when you open up the bracket
		public void deposit(double deposit) {
			setBalance(getBalance() + deposit * 1.025);
		}
}


