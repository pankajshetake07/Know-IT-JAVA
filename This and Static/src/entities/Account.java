package entities;
public class Account{
	private int accno;
	private double balance;
	static float interest_rate;
	static{
		interest_rate = 7.25f;
	}
	
	Account(){
		accno = 101;
		balance = 0.0;
	}
	
	Account(int accno, double balance){
		this.accno = accno;
		this.balance = balance;
	}
	
	double balanceWithCurrentInterestRate(){
		return balance + (balance * interest_rate / 100);
	}
	
	static void updateInterestRate(float new_interest_rete){
		interest_rate = new_interest_rete;
	}
	
	void display(){
		System.out.println("Account number is : "+accno);
		System.out.println("Account balance is : "+balance);
	}
}