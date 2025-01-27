package utility;

import office.utility.Person;

public class Player extends Person{
	private int playerId;
	private double contractFees;
	
	Player(){
		playerId = 1;
		contractFees = 100;
	} 
	
	Player(int playerId, double contractFees){
		this.playerId = playerId;
		this.contractFees = contractFees;
	}
	
	public void display() {
		System.out.println("Player Id : "+playerId);
		System.out.println("Contract Fees : "+contractFees);
	}

}
