package entities;
public class BankAccount{
	public static void main(String a[]){
		Account a1 = new Account(102, 10000);
		a1.display();
		System.out.println("Balance with interest rate : "+a1.balanceWithCurrentInterestRate());
		Account.updateInterestRate(4.5f);
		
		Account a2 = new Account(103, 10000);
		a2.display();
		System.out.println("Balance with interest rate : "+a2.balanceWithCurrentInterestRate());
	}
}