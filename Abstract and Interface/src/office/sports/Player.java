package office.sports;

import office.utility.Person;

public class Player extends Person {
	private int playerId;
	private double contractFees;
	
	public Player() {
		super();
	}

	public Player(String name, int day, int month, int year, int playerId, double contractFees) {
		super(name, day, month, year);
		this.playerId = playerId;
		this.contractFees = contractFees;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Player Id : "+playerId);
		System.out.println("Contract Fees : "+contractFees);
	}

	@Override
	public String toString() {
		return super.toString() + "\nPlayer Id : "+playerId + "\nContract Fees : "+contractFees;
	}
}
