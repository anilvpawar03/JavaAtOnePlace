package encapsulationprogram;

class Bank {
	private int balance;   //Hidden data
	
	public void setBalance(int b)  //setter
	{
		balance = b ;	
	}
	public int getBalance()   // getter
	{
		return balance;
	}
	
	
	public void deposit(int amount)  //deposit
	{
		balance = balance + amount;
	}
	public void withdraw(int amount)  //withdraw
	{
		if (amount <= balance)  {
			balance = balance - amount;
		} else {
			System.out.println("balance is not enough");
		}
	}
}

public class BankingSystemExample {

	public static void main(String[] args) {
		
	  Bank obj = new Bank();
	   obj.setBalance(1000);
		
	   obj.deposit(200);
	   obj.withdraw(500);
		
	System.out.println("Balance : " +obj.getBalance());
		
	}

}
