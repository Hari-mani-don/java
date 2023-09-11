class BankAccount{
	private double amount;
	private double deposit;
	private double withdraw;
	private double total;
	BankAccount(double amount){
		this.amount = amount;
		System.out.println("Successfull creat Account (A/c No : XXXX2535) with initial amount: $"+this.amount);
	}
	public double getAmount() {
		return amount;
	}
	public void deposit(double deposit){
		this.deposit = deposit;
		total = amount + deposit;
		System.out.println("Deposit $"+deposit+"into Account XXXX2535");
		System.out.println("New Balance After Deposit A/c Balance $"+(deposit)+":" + total );
	}
	public void withdraw(double withdraw) {
		this.withdraw = withdraw;
		System.out.println("withdraw $"+this.withdraw+"from A/c XXXX2535");
		System.out.println("New balance after withdrawing $"+ (total - this.withdraw));
	}
}
class SavingAccount extends BankAccount{
	
	SavingAccount(double amount){
	    super(amount);
	    System.out.println("Successfull creat Saving Account A/c no: XXXX1234 with initial amount "+ super.getAmount());
	}
	
   public void withdraw(double withdraw) {
	   if(withdraw<super.getAmount()){
	      System.out.println("Balance After withdrwaing &"+withdraw+": "+ (super.getAmount()-withdraw));
	   }else {
	      System.out.println("Amount required! $:"+(withdraw-super.getAmount()));
	      System.out.println("Balance after withdraw $"+withdraw+":"+ ((withdraw-super.getAmount())+super.getAmount()));
	      }
   }

}

public class Main{
	public static void main(String args[]) {
		BankAccount bk = new BankAccount(500);
		
		
		bk.deposit(1000);
		bk.withdraw(600);
		SavingAccount sa = new SavingAccount(1000);
		sa.withdraw(500);
		sa.withdraw(600);
		sa.withdraw(1000);
	}
}







