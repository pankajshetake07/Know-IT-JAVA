package sports;

import office.sports.Player;

public class CricketPlayer extends Player {
	private int totalRuns;
	private int totalWickets;
	
	public CricketPlayer() {
		super();
	}

	public CricketPlayer(String name, int day, int month, int year, int playerId, double contractFees, int totalRuns,
			int totalWickets) {
		super(name, day, month, year, playerId, contractFees);
		this.totalRuns = totalRuns;
		this.totalWickets = totalWickets;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Total Runs : "+totalRuns);
		System.out.println("Total Wickets : "+totalWickets);
	}

	@Override
	public String toString() {
		return super.toString() + "\nTotal Runs : "+totalRuns + "\nTotal Wickets : "+totalWickets;
	}
	
}
