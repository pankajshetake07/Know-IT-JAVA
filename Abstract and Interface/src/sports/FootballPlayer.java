package sports;

import office.sports.Player;

public class FootballPlayer extends Player {
	private int goalScored;

	public FootballPlayer() {
		super();
	}

	public FootballPlayer(String name, int day, int month, int year, int playerId, double contractFees,
			int goalScored) {
		super(name, day, month, year, playerId, contractFees);
		this.goalScored = goalScored;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Goal Scored : "+goalScored);
	}

	@Override
	public String toString() {
		return super.toString() + "\nGoal Scored : "+goalScored;
	}
	
	
}
