package app;

import office.sports.Player;
import office.utility.Person;
import sports.CricketPlayer;
import sports.FootballPlayer;

public class PlayerDemo {
	public static void main(String args[]) {
		Person [] p = new Person[4];
		p[0] = new Player("Arjun",10,10,1400,101,45000);
		p[1] = new CricketPlayer("Krishn",20,20,1300,102,60000,18000,40);
		p[2] = new FootballPlayer("Ram",25,25,1250,103,47000,350);
		
		System.out.println(p[0]);
		System.out.println("--------------------------------------");
		System.out.println(p[1]);
		System.out.println("--------------------------------------");
		System.out.println(p[2]);

	}
}
