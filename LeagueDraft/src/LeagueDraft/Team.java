package LeagueDraft;

import java.util.Arrays;

public class Team {

	private Player[] players;
	private String name;
	private int counter;
	private int trophies;
	
	
	public Team(String string) {
		counter = 0;
		players = new Player[3];
		this.name = string;
		trophies = 0;
		
	}
	
	public void addPlayer(Player player) {
		// TODO Auto-generated method stub
		
		Arrays.copyOf(players, ++counter);
		players[counter - 1] = player;
	}
	
	public double getTeamGoals(){
		int goals = 0;
		for(int i = 0; i <counter; i++){
			goals += players[i].getGoals();
		}
		return goals;
	}



	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}



	public int getAveAge() {
		// TODO Auto-generated method stub
		int goals = 0;
		for(int i = 0; i <counter; i++){
			goals += players[i].getAge();
		}
		return goals/counter;
	}

	

}
