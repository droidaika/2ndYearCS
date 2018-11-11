package LeagueDraft;


import java.util.Arrays;


public class Division {

private Team[] teams;
private String name;
private int counter;
	
	public Division(String string) {
		teams = new Team[5];
		this.name = string;
		counter = 0;
	}
	
	public String getName(){
		return name;
	}
	
	public void addTeam(Team team) {
		// TODO Auto-generated method stub
		Arrays.copyOf(teams, ++counter);
		teams[counter - 1] = team;
	}

	public int getNumTeams() {
		// TODO Auto-generated method stub
		return counter;
	}
	public double getDivisionGoals(){
		double goals = 0;
		for(int i = 0; i <counter; i++){
			goals += teams[i].getTeamGoals();
		}
		return goals;
	}

	

	public double getTeamGoals(String teamName) {
		// TODO Auto-generated method stub
		for(int i = 0; i <counter; i++){
			if(teams[i].getName() == teamName){
				return teams[i].getTeamGoals();
			}
		}
		return -1;
	}

	public int getAveAge(String teamName) {
		for(int i = 0; i <counter; i++){
			if(teams[i].getName()== teamName){
				return teams[i].getAveAge();
			}
		}
		return -1;
	}
}
