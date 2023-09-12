abstract class BankAccount{
	
	private double balance;
	BankAccount(double balance){
		this.balance = balance;
	}
	public double getAmount() {
		return balance;
	}
	public void setAmount(double balance) {
	  this.balance = balance;
	}
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
}
class SavingAccount extends BankAccount{
	
	
	SavingAccount(double amount){
		super(amount);
	}
	public void deposit(double deposit) {
		super.setAmount(super.getAmount() + deposit);
		System.out.println("Successful Deposit $"+deposit+".New Balance :"+"$"+super.getAmount());
	}
	public void withdraw(double withdraw) {
		if(withdraw>super.getAmount()) 
			System.out.println("Amount required $"+(withdraw - super.getAmount()));
		else
			System.out.print("Successfull withdraw $"+withdraw+"After withdraw $"+(super.getAmount()-withdraw));
		
		
	}
	
	
}
class CurrentAccount extends BankAccount{
	
	
	CurrentAccount(double amount){
		super(amount);
	}
	
	public void deposit(double deposit) {
		super.setAmount(super.getAmount() + deposit);
		System.out.println("Successful Deposit $"+deposit+".New Balance :"+"$"+super.getAmount());
	}
	public void withdraw(double withdraw) {
		if(withdraw>super.getAmount()) 
			System.out.println("Amount required $"+(withdraw - super.getAmount()));
		else
			System.out.print("Successfull withdraw $"+withdraw+"After withdraw $"+(super.getAmount()-withdraw));
		
	}
	
	
	
}

public class Main {
	public static void main(String args[]) {
		System.out.println("Savings A/c: Initial Balace: $1000.0");
		SavingAccount sa = new SavingAccount(1000);
		sa.deposit(500);
		sa.withdraw(500);
		
		System.out.println("Current A/c: Initial Balace: $1000.0");
		CurrentAccount ca = new CurrentAccount(1000);
		ca.deposit(400);
		ca.withdraw(200);
	}
}
